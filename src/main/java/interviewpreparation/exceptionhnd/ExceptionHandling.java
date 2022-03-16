package interviewpreparation.exceptionhnd;

public class ExceptionHandling {

    void checkMarks(int marks){
        if(marks<50)
            throw new ArithmeticException("Exam failed");
        else
            System.out.println("Exam passed");
    }
    public static void main(String args[]){
        Code object = new Code();
        object.checkMarks(43);
    }


}


