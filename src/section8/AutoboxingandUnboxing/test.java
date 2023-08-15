package section8.AutoboxingandUnboxing;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank("State bank of India");

        bank.addbranch("bhilwara");
        bank.addcustomer("bhilwara","hardik",36000);
        bank.addcustomer("bhilwara","mike",23235);
        bank.addcustomer("bhilwara","jackson",23241);

        bank.addbranch("delhi");
        bank.addcustomer("delhi","percy",21324);

        bank.addcustomertransaction("bhilwara","hardik",1232);
        bank.addcustomertransaction("bhilwara","hardik",1232);
        bank.addcustomertransaction("bhilwara","mike",1232);

        bank.listcustomer("adelaide",false);
        bank.listcustomer("sydney",true);
    }
}
