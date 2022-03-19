package multithreading.basics2;

import java.util.stream.IntStream;

public class SumOfNumbersUsingRunnableExample {

    public static int[] numbers = IntStream.rangeClosed(0,5000).toArray();
    public static int sum = 0;
    public static  int total = IntStream.rangeClosed(0,5000).sum(); // verification

    public static void main(String[] args) throws InterruptedException {
        Worker1 worker1 = new Worker1(numbers);
        Worker2 worker2 = new Worker2(numbers);

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Sum of 5000 integers in parallel is : "+sum);
        System.out.println("Sum of 5000 integers from  InstStream is : "+total);
    }

    public static void add(int toAdd){
        sum = sum+toAdd;
    }
}

class Worker1 implements Runnable{

    int[] array;
    int sum=0;

    public Worker1(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        for(int i=0;i<array.length/2;i++){
            sum = sum + array[i];
        }
        SumOfNumbersUsingRunnableExample.add(sum);

    }
}

class Worker2 implements Runnable{

    int[] array;
    int sum=0;

    public Worker2(int[] array){
        this.array = array;
    }


    @Override
    public void run() {
        for(int i=array.length/2;i<array.length;i++){
            sum = sum + array[i];
        }

        SumOfNumbersUsingRunnableExample.add(sum);
    }
}
