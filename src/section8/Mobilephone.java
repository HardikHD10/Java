package section8;

import java.util.ArrayList;

public class Mobilephone {
    private String mynumber;
    private ArrayList<Contacts> mycontacts;

    public Mobilephone(String mynumber) {
        this.mynumber = mynumber;
        this.mycontacts = new ArrayList<Contacts>();
    }

    public boolean addnewcontact(Contacts contacts){
        if(findcontact(contacts.getName())>= 0){
            System.out.println("Contact is already in file");
            return false;
        }
        mycontacts.add(contacts);
        return true;
    }

    public boolean updatecontact(Contacts oldcontact, Contacts newcontact){
      int foundposition = findcontact(oldcontact);
      if(foundposition<0){
          System.out.println(oldcontact.getName()+" was not found");
          return false;
      }else if(findcontact(newcontact.getName()) != -1){
          System.out.println("contact with name "+ newcontact.getName() +"already exists. update was not successful.");
          return false;
      }
      this.mycontacts.set(foundposition,newcontact);
        System.out.println(oldcontact.getName() +" was repalced with "+ newcontact.getName());
        return true;
    }

    private int findcontact(Contacts contacts){
        return this.mycontacts.indexOf(contacts);
    }

    private int findcontact(String contactname){
        for(int i = 0; i< this.mycontacts.size();i++){
            Contacts contact = this.mycontacts.get(i);
            if(contact.getName().equals(contactname)){
                return i;
            }
        }
        return -1;
    }

    public String querycontact(Contacts contacts){
        if(findcontact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }

    public boolean removecontact(Contacts contacts) {
        int foundposition = findcontact(contacts);
        if (foundposition < 0) {
            System.out.println(contacts.getName() + " was not found");
            return false;
        }
        this.mycontacts.remove(foundposition);
        System.out.println(contacts.getName()+" was deleted");
        return true;
    }
    public void Printcontacts(){
        System.out.println("contact list");
        for (int i = 0; i<this.mycontacts.size();i++){
            System.out.println((i+1)+"."+ this.mycontacts.get(i).getName()+" --> "+ this.mycontacts.get(i).getPhonenumber());
        }
    }

    public Contacts querycontact(String name){
        int position = findcontact(name);
        if (position>=0){
            return this.mycontacts.get(position);
        }
        else
        {
            return null;
        }
    }
}
