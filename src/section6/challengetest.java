package section6;

public class challengetest {
    public static void main(String[] args) {
        challenge challenge = new challenge();

        challenge.setCustomer_name("Hardik");
        challenge.setEmail("hardik.ice20@gmail.com");
        challenge.setBalance(45000);
        challenge.setPhonenumber(982965);
        challenge.setAccount_number(325678794);

        System.out.println("account details "+ challenge.getCustomer_name()+ challenge.getAccount_number()+challenge.getPhonenumber()+challenge.getEmail());
        System.out.println("intial balance : " + challenge.getBalance() );
    }
}
