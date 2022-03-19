package multithreading.lamda;

public class RunnableExample {
    public static void main(String[] args) {

        //Runnable Traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("Sum with Traditional way "+sum );
            }
        };
        new Thread(runnable).start();


        //Implement with lambda
        Runnable runnable1 = ()->{
          int sum = 0;
          for (int i=0;i<10;i++){
              sum+=i;
          }
            System.out.println("Sum with lambda : "+sum);
        };
        new Thread(runnable1).start();



        // implement using Thread with lambda
        new Thread(()->{
            int sum=0;
            for (int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Thread Lambda: "+sum);
        }).start();
    }
}
