package multithreading.lamda;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (x,y)-> x+" "+y;
        System.out.println(concatenateInterface.sConcat("Hello","World"));
    }
}
