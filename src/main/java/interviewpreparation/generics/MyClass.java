package interviewpreparation.generics;

import java.util.HashMap;

public class MyClass<T,V> {

    T obj;
    V obj2;

    HashMap<T,V> hashMap = new HashMap<>();

     MyClass(T obj,V obj2) {
        this.obj = obj;
        this.obj2=obj2;
    }

    void showType(){
        System.out.println(obj.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }
}
