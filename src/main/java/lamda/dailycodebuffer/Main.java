package lamda.dailycodebuffer;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    @FunctionalInterface
    interface CheckPerson{
        boolean check(Person p);
    }

    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson{

        @Override
        public boolean check(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <=25;
        }
    }


    public static void printPersonOlderThan(List<Person> people, int age) {
        for(Person p : people) {
            if(p.getAge() > age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonWithAgeRange(List<Person> people, int min, int max) {
        for(Person p : people) {
            if(p.getAge() >= min && p.getAge() < max) {
                p.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> people, CheckPerson checkPerson) {
        for(Person p : people) {
            if(checkPerson.check(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPeopleWithPredicate(List<Person> people, Predicate<Person> checker) {
        for (Person p: people){
            if(checker.test(p)){
                p.printPerson();
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        List<Person> people = Person.generateDefaultList();
      //  printPersonOlderThan(people, 30);
      //  printPersonWithAgeRange(people, 20, 30);
      //  printPeople(people,new CheckPersonEligibleForSelectiveSearch());

        printPeople(people, new CheckPerson() {
            @Override
            public boolean check(Person p) {
                return p.gender == Person.Sex.MALE &&
                        p.getAge() >= 18 &&
                        p.getAge() <=25;
            }
        });

        printPeople(people, (p) ->
                 p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=25
        );

        printPeopleWithPredicate(people, p ->
                        p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=25
                );
    }
}
