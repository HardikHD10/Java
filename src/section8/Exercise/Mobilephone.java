package section8.Exercise;

import section8.Contacts;

import java.util.ArrayList;

public class Mobilephone {
    private String mynumber;
    private ArrayList<contacts> myContacts;

    public Mobilephone(String mynumber) {
        this.mynumber = mynumber;
        this.myContacts = new ArrayList<contacts>();
    }

    private int findcontacts(contacts contacts){
        return this.myContacts.indexOf(contacts);
    }

    public int findcontacts(String contactname ){
        for(int i = 0; i<this.myContacts.size();i++){
            contacts contacts = this.myContacts.get(i);
            if(contacts.getName().equals(contactname)){
                return i;
            }
        }
        return  -1;
    }
    public boolean addnewcontacts(contacts contact){
        if( findcontacts(contact.getName())>= 0){
            System.out.println(" contact "+ contact.getName()+" already exists!");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updatecontacts(contacts oldcontact, contacts newcontact){
        int foundposition = findcontacts(oldcontact);
        if(foundposition < 0){
            System.out.println(oldcontact.getName()+" was not found!");
            return false;
        }
        else if(findcontacts(newcontact.getName()) != -1){
            System.out.println(newcontact.getName()+" already exists. update was not successful.");
            return false;
        }
        else{
            this.myContacts.set(foundposition,newcontact);
            System.out.println(oldcontact.getName()+ "was succesfully replaced by "+ newcontact.getName());
            return true;
        }
    }

    public boolean removecontacts(contacts contact){
        int foundposition = findcontacts(contact);
        if(foundposition < 0){
            System.out.println(contact.getName()+" was not found!");
            return false;
        }
        else{
            myContacts.remove(contact);
            System.out.println(contact.getName()+" successfully removed!");
            return true;
        }
    }

    public  String querycontacts(contacts contact){
        if(findcontacts(contact)>0){
            return contact.getName();
        }
        else
            return null;
    }

    public contacts querycontacts(String name){
        int position = findcontacts(name);
        if (position>= 0){
            return this.myContacts.get(position);
        }
        else{
            return null;
        }
    }

   public void printcontacts(){
       System.out.println(" contact list : ");
       for (int i = 0 ;  i < this.myContacts.size();i++){
           System.out.println((i+1)+". "+ this.myContacts.get(i).getName()+" --->>> "+ this.myContacts.get(i).getPhonenumber());
       }
   }

    public void Printcontacts() {
    }
}
