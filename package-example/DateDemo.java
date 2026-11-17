// Using the Date class from the java.util package
import java.util.*; //java / util / Date.java

class DateDemo {
  public static void main(String[] args) {

    // Date is imported, so the simple name can be used
    Date now = new Date();
    System.out.println("Current date and time: " + now);

    // Milliseconds since January 1, 1970 (the epoch)
    long ms = now.getTime();
    System.out.println("Milliseconds since 1970: " + ms);

    // A Date one day (24 hours) later
    Date tomorrow = new Date(ms + 24L * 60 * 60 * 1000);
    System.out.println("Same time tomorrow: " + tomorrow);

    // Comparing two dates
    System.out.println("now before tomorrow? " + now.before(tomorrow));
    System.out.println("now after tomorrow? " + now.after(tomorrow));

    // Without import, use the fully qualified name
    java.util.Date epoch = new java.util.Date(0);
    System.out.println("The epoch: " + epoch);
  }
}
