package section8.AutoboxingandUnboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double intialamount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addtransactions(intialamount);
    }

    public void addtransactions(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
