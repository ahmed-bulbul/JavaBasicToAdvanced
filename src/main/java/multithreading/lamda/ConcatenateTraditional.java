package multithreading.lamda;

public class ConcatenateTraditional implements ConcatenateInterface{
    @Override
    public String sConcat(String a, String b) {
        return a+" "+b;
    }

    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.sConcat("Hello","World"));
    }
}
