package oop.abstraction;

public abstract class TestAbstract {

    public abstract void fees();
    public String hello(){
        return "Hello";
    }

}

class AbstImpl extends TestAbstract {

    public void fees() {
        System.out.println("Class 7 fees Collection");
    }

}

class X extends AbstImpl {

    public void fees() {
        System.out.println("class 8 fees Collection");
    }

}