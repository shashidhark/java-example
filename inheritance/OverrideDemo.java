class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
        System.out.println(this.toString());
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k + " " + this.toString());
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        
        // Calls B's show(), hiding A's show()
        subOb.show(); 
    }
}