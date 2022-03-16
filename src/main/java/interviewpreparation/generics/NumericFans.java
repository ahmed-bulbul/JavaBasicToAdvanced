package interviewpreparation.generics;

public class NumericFans<T extends Number> {

    T obj;

    NumericFans(T obj){
        this.obj=obj;
    }

    double square(){
        return obj.intValue() * obj.intValue();
    }
}
