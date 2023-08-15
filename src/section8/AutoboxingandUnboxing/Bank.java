package section8.AutoboxingandUnboxing;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addbranch(String branchname){
        if(findbranch(branchname) == null){
            this.branches.add(new Branch(branchname));
            return true;
        }
        return false;
    }

    public boolean addcustomer(String branchname, String customername, double intialamount){
        Branch branch = findbranch(branchname);
        if(branch != null){
            return branch.addnewcustomer(customername,intialamount);
        }
        return false;
    }

    public boolean addcustomertransaction(String branchname, String customername, double intialamount){
        Branch branch = findbranch(branchname);
        if(branch!=null){
            return branch.addcustomertransactions(customername,intialamount);
        }
        return false;
    }

    private  Branch findbranch(String name){
        for (int i = 0; i<this.branches.size();i++) {
            Branch checkedbranch = this.branches.get(i);
            if (checkedbranch.getName().equals(name)){
                return checkedbranch;
            }
        }
        return null;
    }


    public boolean listcustomer(String branchname, boolean showtransactions){
        Branch branch = findbranch(branchname);
        if(branch != null) {
            System.out.println("customers for branch" + branch.getName());

            ArrayList<Customer> branchcustomers = branch.getCustomers();
            for (int i = 0; i < branchcustomers.size(); i++) {
                Customer branchcustomer = branchcustomers.get(i);
                System.out.println("customer : " + branchcustomer.getName() + "[ " + i + " ]");
                if (showtransactions == true) {
                    System.out.println("transactions");
                    ArrayList<Double> transactions = branchcustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[ " + (j + 1) + " ]amount " + transactions.get(j));
                    }
                }
            }
            return true;

        }
        else {
            return false;
        }
    }

}
