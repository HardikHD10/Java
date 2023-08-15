package section8.Exercise;

public class contacts {
    private String Name;
    private String Phonenumber;

    public contacts(String name, String phonenumber) {
        this.Name = name;
        this.Phonenumber = phonenumber;
    }


    public String getName() {
        return Name;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public static contacts contactinfo(String name, String phonenumber){
       return new contacts(name,phonenumber);
    }
}
