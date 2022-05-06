package enumExamples;

public class Basic {

    enum Week{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        Week(){
            System.out.println("Constructor called "+ this);
        }
    }



    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        System.out.println(day.name());
        System.out.println(day.toString());

        System.out.println("SYsy Print"+Week.THURSDAY);

        for(Week w : Week.values()){
            System.out.println(w);
        }
    }
}
