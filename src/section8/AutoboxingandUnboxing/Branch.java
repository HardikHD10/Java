package section8.AutoboxingandUnboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList <Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    private Customer findcustomer(String name){
        for (int i = 0; i<this.customers.size();i++) {
            Customer checkedcustomer = this.customers.get(i);
            if (checkedcustomer.getName().equals(name)){
                return checkedcustomer;
            }
        }
            return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addnewcustomer(String customername, double amount){
        if (findcustomer(customername) == null){
            this.customers.add(new Customer(customername,amount));
            return true;
    }
        return false;
    }

    public boolean addcustomertransactions(String customername, double amount){
        Customer existingcustomer = findcustomer(customername);

        if (existingcustomer != null){
            existingcustomer.addtransactions(amount);
            return true;
        }
        return false;
    }
}
