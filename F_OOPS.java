// OBJECT ORIENTED PROGRAMMING

// Class Declaration
class Custom {

    // Class Function Declaration
    public void custom_fun() {
        System.out.println("Hello world");
    }

    // Class static Function Delaration
    public static void custom_fun2() {
        System.out.println("Good morning");
    }

    // Getters and Setters in Class
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {

        // This keyword useage
        this.radius = radius;
    }

    public double area_circle() {
        return Math.PI * radius * radius;
    }

}

// Inherited Class
class Custom_2 extends Custom {

    // Cunstroctor of Class
    public Custom_2(int a, int b) {
        System.out.println(a + b);
    }

    // Method Overriding from Parent Class
    @Override
    public void custom_fun() {
        System.out.println("Hello Parth");
    }

}

// Abstract Class
abstract class abs {
    abstract void sum(int a, int b);

    abstract void mul(int a, int b);
}

// Abstaract Class Inheritence
class newcls extends abs {

    // Overrided Abstact Method
    @Override
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Overrided Abstact Method
    @Override
    void mul(int a, int b) {
        System.out.println(a * b);
    }

}

// Interface Declaration
interface bicycle {
    void speedup();

    void breakdown();
}

interface bike {
    void bspeedup();

    void bspeeddown();
}

// Interface Implimented Class
class Implimented implements bicycle, bike {

    @Override
    public void bspeedup() {
        System.out.println("bike Speed Up");
    }

    @Override
    public void bspeeddown() {
        System.out.println("bike Speed Up");
    }

    @Override
    public void speedup() {
        System.out.println("bicycle Speed Up");
    }

    @Override
    public void breakdown() {
        System.out.println("cicycle break down");
    }

}

// Class with Single Inheritence and Multiple Implimentation
class inhimp extends abs implements bike, bicycle {

    // Overrided Interface Method
    @Override
    public void bspeedup() {
        System.out.println("bike Speed Up");
    }

    // Overrided Interface Method
    @Override
    public void bspeeddown() {
        System.out.println("bike Speed Up");
    }

    // Overrided Abstact Class Method
    @Override
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Overrided Abstact Class Method
    @Override
    void mul(int a, int b) {
        System.out.println(a * b);
    }

    // Overrided Interface Method
    @Override
    public void speedup() {
        System.out.println("bicycle Speed Up");
    }

    // Overrided Interface Method
    @Override
    public void breakdown() {
        System.out.println("cicycle break down");
    }

}

// Inheritence in Interfaces
interface ranvir {
    void father();
}

interface rekha extends ranvir {
    void mummy();
}

class pammu implements rekha {

    @Override
    public void father() {
        System.out.println("Father  of parth");
    }

    @Override
    public void mummy() {
        System.out.println("Mother of parth");
    }

}

public class F_OOPS {
    public static void main(String[] args) {

        // Object Declration of Class
        Custom ct = new Custom();

        // Class Function Acsess
        ct.custom_fun();

        // Class Static Function Acsess
        Custom.custom_fun2();

        // Class Getters and Setters Acsess
        ct.setRadius(5);
        System.out.println(ct.getRadius());
        System.out.println(ct.area_circle());

        // Class Constrctor Acsess
        Custom_2 ct2 = new Custom_2(3, 4);

        // Child to Peerent Acsess by Inherited Class
        ct2.setRadius(5);
        System.out.println(ct2.area_circle());

        // Overridede Method
        ct.custom_fun();
        ct2.custom_fun();

        // Dynamic Memory Dispatch Polymorphizam
        Custom obj = new Custom_2(2, 5);
        obj.setRadius(7);
        obj.custom_fun();

        // Acsess methods of Abstract Class
        newcls nw = new newcls();
        nw.sum(3, 4);
        nw.mul(3, 4);

        // Implimented interface Method Acsess
        Implimented impl = new Implimented();
        impl.bspeedup();
        impl.breakdown();
        impl.speedup();
        impl.bspeeddown();

        // Inherited + Implimented Class Acsess
        inhimp obj2 = new inhimp();
        obj2.breakdown();
        obj2.speedup();
        obj2.sum(3, 6);

        // Inherited Interface Method Acsess
        pammu pm = new pammu();
        pm.father();
        pm.mummy();
    }
}
