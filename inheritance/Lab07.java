// Interface 1: Refundable
interface Refundable {
    void refund();
}

// Interface 2: Verifiable with a default method
interface Verifiable {
    default void verify() {
        System.out.println("Standard verification completed: Transaction is authentic.");
    }
}

// Abstract Superclass: Payment
abstract class Payment {
    protected String transactionId;
    protected double amount;

    // Constructor
    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Abstract method to be implemented by subclasses
    public abstract void processPayment();

    // Concrete method shared by all payment types
    public void printReceipt() {
        System.out.println("----------------------------------------");
        System.out.println("PAYMENT RECEIPT");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount Paid    : $" + String.format("%.2f", amount));
        System.out.println("----------------------------------------");
    }

    // Static nested class to log transactions
    public static class TransactionLog {
        public static void record(String transactionId, String paymentType, double amount, String status) {
            System.out.println("[LOG] ID: " + transactionId + " | Type: " + paymentType 
                             + " | Amount: $" + String.format("%.2f", amount) + " | Status: " + status);
        }
    }
}

// Subclass 1: CardPayment (implements both Refundable and Verifiable)
class CardPayment extends Payment implements Refundable, Verifiable {
    private String cardNumber;

    public CardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        verify(); // Calling default method from Verifiable
        System.out.println("Processing Card Payment of $" + String.format("%.2f", amount) 
                         + " using Card ending in " + cardNumber.substring(cardNumber.length() - 4));
        TransactionLog.record(transactionId, "CardPayment", amount, "SUCCESS");
    }

    @Override
    public void refund() {
        System.out.println("Initiating refund of $" + String.format("%.2f", amount) 
                         + " for Transaction ID: " + transactionId + " back to Card.");
        TransactionLog.record(transactionId, "CardPayment", amount, "REFUNDED");
    }
}

// Subclass 2: UpiPayment (implements Verifiable only)
class UpiPayment extends Payment implements Verifiable {
    private String upiId;

    public UpiPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        verify(); // Calling default method from Verifiable
        System.out.println("Processing UPI Payment of $" + String.format("%.2f", amount) 
                         + " via UPI ID: " + upiId);
        TransactionLog.record(transactionId, "UpiPayment", amount, "SUCCESS");
    }
}

// Driver Class
public class ECommercePaymentDemo {
    public static void main(String[] args) {
        // 1. Demonstrate that abstract class Payment cannot be instantiated:
        // Payment p = new Payment("TXN000", 100.0); // COMPILE-TIME ERROR: Payment is abstract; cannot be instantiated

        // 2. Process one payment of each type through a reference of type Payment (Dynamic Method Dispatch)
        Payment payment1 = new CardPayment("TXN1001", 250.00, "4532015112830366");
        Payment payment2 = new UpiPayment("TXN1002", 75.50, "alex@okaxis");

        Payment[] payments = { payment1, payment2 };

        for (Payment p : payments) {
            System.out.println("\n=== Processing Next Payment ===");
            p.processPayment();
            p.printReceipt();

            // 3. Invoke refund() only where it is available using instanceof
            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            } else {
                System.out.println("Refund not supported for this payment method (" + p.getClass().getSimpleName() + ").");
            }
        }
    }
}