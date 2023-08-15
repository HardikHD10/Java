package section6;

public class person {
    private String Firstname;
    private String Lastname;
    private int Age;

    public String getFirstname(){
        return Firstname;
    }

    public String getLastname(){
        return Lastname;
    }
    public int  getAge(){
        return Age;
    }
    public void setFirstname(String Firstname){
        this.Firstname = Firstname;
    }
    public void setLastname(String Lastname){
        this.Lastname = Lastname;
    }
    public void setAge(int Age){
        if(Age > 0 && Age <100){
            this.Age = Age;
        }
        else{
            Age = 0;
        }
    }
    public boolean isTeen() {
        if(Age > 12 && Age < 20) {
            return true;
        } else {
            return false;
        }
    }
    public String getFullname(){
        return (getFirstname() +" "+ getLastname());
    }

}
