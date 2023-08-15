package section6;

public class persontest {
        public static void main(String[] args) {

            person person = new person();

            person.setFirstname("");
            person.setLastname("");
            person.setAge(10);

            System.out.println("Full name = " + person.getFullname());
            System.out.println("Is teen = " + person.isTeen());

            person.setFirstname("John");
            person.setAge(18);

            System.out.println("Full name = " + person.getFullname());
            System.out.println("Is teen = " + person.isTeen());

            person.setLastname("Smith");

            System.out.println("Full name = " + person.getFullname());
        }
    }
