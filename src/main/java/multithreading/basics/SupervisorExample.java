package multithreading.basics;

public class SupervisorExample {

    public static void main(String[] args) throws InterruptedException {
        Worker1 w1 = new Worker1();
        Worker2 w2 = new Worker2();
        w1.executeWork();
        w2.executeWork();
    }
}

class Worker1{
    public void executeWork() throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(100);
            System.out.println("Worker 1 is executing task : "+i);
        }
    }

}

class Worker2{
    public void executeWork() throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(100);
            System.out.println("Worker 2 is executing task : "+i);
        }
    }
}
