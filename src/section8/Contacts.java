package section8;

public class Contacts {
    private String name;
    private  String Phonenumber;

    public Contacts(String name, String phonenumber) {
        this.name = name;
        Phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public static Contacts contactrecord(String name, String Phonenumber){
        return new Contacts(name,Phonenumber);
    }

}
