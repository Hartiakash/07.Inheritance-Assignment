package Inheritance_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_Inheritance.html
 *
 * 1. A, B and C are classes
 * 2. A is a super class. B is a subclass of A. C is a subclass of B.
 * 3. Create three methods in each class, 2 methods are specific to each class and third
 * method (override method) should be in all three Classes A, B and C
 * 4. Create a class with main method. Create an object for each class A, B and C in main
 * method and call every method of each class using its own object/instance.
 * 5. Call an overridden method with super class reference to B and C class’s objects
 * 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above
 * process only for data member
 */

//super class
class A {
    int n = 11;

    void methodA1() {
        System.out.println("This is Class A Method 1");
    }

    void methodA2() {
        System.out.println("This is Class A Method 2");
    }

    void method3() {
        System.out.println("This is override method - Class A");
    }
}

//subclass of A
class B extends A {
    int n = 22;

    void methodB1() {
        System.out.println("This is Class B Method 1");
    }

    void methodB2() {
        System.out.println("This is Class B Method 2");
    }

    @Override //override method
    void method3() {
        System.out.println("This is override method - Class B");
    }
}

//subclass of B
class C extends B {
    int n = 33;

    void methodC1() {
        System.out.println("This is Class C Method 1");
    }

    void methodC2() {
        System.out.println("This is Class C Method 2");
    }

    @Override  //override method
    void method3() {
        System.out.println("This is override method - Class C");
    }
}

//class with main method
public class Inheritance {
    public static void main(String[] args) {
        //calling every method of each class using its own object/instance
        //object for class A
        A a = new A();
        a.methodA1();
        a.methodA2();
        a.method3();
        //object for class B
        B b = new B();
        b.methodB1();
        b.methodB2();
        b.method3();
        //object for class C
        C c = new C();
        c.methodC1();
        c.methodC2();
        c.method3();

        //Calling an overridden method with super class reference
        A orm;
        //upcasting
        orm = new B();
        orm.method3();
        //upcasting
        orm = new C();
        orm.method3();

        //Runtime Polymorphism with Data Members
        A rtp;
        rtp = new A();
        System.out.println(rtp.n);
        rtp = new B();
        System.out.println(rtp.n);
        rtp = new C();
        System.out.println(rtp.n);

        /* NOTE :
                6.Method is overridden not the data members,
                so runtime polymorphism can't be achieved by data members.
         */
    }
}
