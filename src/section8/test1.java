package section8;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class test1 {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobilephone mobilephone =new Mobilephone("0039 330 4404");

    public static void main(String[] args) {
         boolean quit = false;
         startphone();
         printactions();
         while(!quit){
             System.out.println("\n enter action : (6 to show available options:)");
             int action = scanner.nextInt();
             scanner.nextLine();

             switch (action){
                 case 0:
                 {
                     System.out.println("\nshutting down...");
                     quit = true;
                     break;
                 }
                 case 1:
                 {
                     mobilephone.Printcontacts();
                     break;
                 }
                 case 2:
                 {
                     addnewcontact();
                     break;
                 }
                 case 3:
                 {
                     updatecontact();
                     break;
                 }
                 case 4:
                 {
                     removecontact();
                     break;
                 }
                 case 5:
                 {
                     querycontact();
                     break;
                 }
                 case 6:
                 {
                     printactions();
                     break;
                 }
             }
         }
    }
    private static void startphone(){
        System.out.println("starting the phone...");
    }

    private static void printactions(){
        System.out.println("\n available actions:\npress");
        System.out.println("0 to shutdown\n"+ "1 to print contacts\n"+"2 to add a new contact\n"+"3 to update existing contact \n"+"4 to remove an existing contact\n"+"5 to query if an existing contact exists\n"+"6 to print a list of availabe actions\n");
        System.out.println("choose from the available options : ");
    }

    private static void addnewcontact(){
        System.out.println("enter new contacts name : ");
        String name = scanner.nextLine();
        System.out.println("enter phone number : ");
        String phone = scanner.nextLine();
        Contacts newcontact = Contacts.contactrecord(name,phone);
        if (mobilephone.addnewcontact(newcontact)){
            System.out.println("new contact added : name = "+ name + ", phone="+ phone);
        }
        else {
            System.out.println("cannot add "+ name + " already on file");
        }
    }

    private static void updatecontact(){
        System.out.println("enter existing contact name :");
        String name = scanner.nextLine();
        Contacts existingcontactrecord =mobilephone.querycontact(name);
        if(existingcontactrecord == null){
            System.out.println("contact not found...");
            return;
        }
        System.out.println("enter new contact name: ");
        String newname = scanner.nextLine();
        System.out.println("enter new contact number:");
        String newNumber = scanner.nextLine();
        Contacts newcontact = Contacts.contactrecord(newname,newNumber);
        if(mobilephone.updatecontact(existingcontactrecord,newcontact)){
            System.out.println("Successfully updated record");
        }
        else {
            System.out.println("error upadating record.");
        }
    }

    private static void removecontact(){
        System.out.println("enter existing contact name :");
        String name = scanner.nextLine();
        Contacts existingcontactrecord =mobilephone.querycontact(name);
        if(existingcontactrecord == null){
            System.out.println("contact not found...");
            return;
        }

        if(mobilephone.removecontact(existingcontactrecord)){
            System.out.println("succesfully deleted");
        }else
        {
            System.out.println("error deleting contact");
        }
    }

    private static void querycontact(){
        System.out.println("enter existing contact name :");
        String name = scanner.nextLine();
        Contacts existingcontactrecord =mobilephone.querycontact(name);
        if(existingcontactrecord == null){
            System.out.println("contact not found...");
            return;
        }
        System.out.println("name: "+ existingcontactrecord.getName() + " phone number is "+ existingcontactrecord.getPhonenumber());
    }
}
