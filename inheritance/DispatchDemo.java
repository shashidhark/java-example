class A {
    int a = 1;
    void callMe() {
        System.out.println("Inside A's callMe method");
    }

    void volume() {
        System.out.println("Inside A's volume method");
    }
}

class B extends A {
    void callMe() {
        System.out.println("Inside B's callMe method");
    }
}

class C extends A {
    void callMe() {
        System.out.println("Inside C's callMe method");
    }
}

public class DispatchDemo {
    public static void main(String[] args) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C

        A r; // obtain a reference of type A

        r = a;      // r refers to an A object
        r.callMe(); // calls A's version of callMe

        r = b;      // r refers to a B object
        r.callMe(); // calls B's version of callMe
        r.volume(); // calls B's version of volume
        System.out.println("Inside C's callMe method " + r.a);

        r = c;      // r refers to a C object
        r.callMe(); // calls C's version of callMe
        
    }
}