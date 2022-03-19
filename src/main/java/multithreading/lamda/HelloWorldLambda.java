package multithreading.lamda;

public class HelloWorldLambda {

    public static void main(String[] args) {
        // impl sayHelloWorld using lambda

        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
