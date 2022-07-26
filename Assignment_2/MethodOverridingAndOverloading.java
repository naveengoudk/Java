package Assignment_2;
/* Method overriding : if a subclass and superclass has a same method then it is known as method
 * overriding . In the below example both superclass and subclass i.e parent and child has a method
 * "method 1" . According to inheritance if method1 is called from subclass it should execute code in
 * superclass method but here it overrides it and runs its own method1*/

/* Method overloading : in the parent class we have two methods named "method1" but the second method has
 * parameters . this is known as method overloading. Two methods with a same name but parameters , parameters type or
 * their order should be different to be a valid method overloading. Two methods with different return type is not a
 * valid method overloading */

class parent {
    void method1() {
        System.out.println("i am a method 1 from parent class");
    }

    int method1(int a) {
        return a;
    }
}

class child extends parent {
    void method1() {
        System.out.println("i am a method 1 from child class");
    }
}

public class MethodOverridingAndOverloading {
    public static void main(String[] args) {

        child c = new child();
        c.method1();

        parent p = new parent();
        p.method1();
    }
}
