package interviewpreparation.generics;

public class Main {

    public static void main(String[] args) {
        MyClass<Integer,Double> obj = new MyClass<>(10,20.2);
        //MyClass<Double> obj2 = new MyClass<>(10.2);

        obj.showType();
     //   obj2.showType();

        NumericFans<Integer> iOb = new NumericFans<>(5);
        System.out.println(iOb.square());
    }
}
