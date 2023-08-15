package section6;

public class challenge {
    private int Account_number;
    private int Balance;
    private int Phonenumber;
    private String customer_name;
    private String Email;

    public challenge(){ // constructor : replaces set
        System.out.println("empty constructor called :");
    }

    public void setAccount_number(int Account_number){
        this.Account_number = Account_number;
    }
    public int getAccount_number(){
        return Account_number;
    }
    public void setBalance(int Balance){
        this.Balance = Balance;
    }
    public int getBalance(){
        return Balance;
    }
    public void setPhonenumber(int Phonenumber){
        this.Phonenumber = Phonenumber;
    }
    public int getPhonenumber(){
        return Phonenumber;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String  getEmail(){
        return Email;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }
    public String getCustomer_name(){
        return customer_name;
    }
    public void deposit(int dep){
        this.Balance +=  dep;
    }
    public void withdraw(int wrdw){
        this.Balance -=  wrdw;
    }


}
