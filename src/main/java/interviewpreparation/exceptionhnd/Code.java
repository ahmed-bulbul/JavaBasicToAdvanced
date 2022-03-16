package interviewpreparation.exceptionhnd;

class Code{
    int checkMarks(int marks) throws ArithmeticException
    {
        int result= marks/0;
        return result;
    }
    public static void main(String args[])
    {
        Code object = new Code();
        try
        {
            System.out.println (object.checkMarks(43));
        }
        catch(ArithmeticException except)
        {
            System.out.println("Error in dividing number by zero");
        }
    }
}