package oops;
import java.util.*;
public class abstraction {
    public static void main(String[] args){

        Samsung myphone = new Samsung();
        myphone.call("9716655386");
        myphone.send_message("hello my friend ");
        myphone.addContact("756246891");
    }
}
abstract class mobile{
    ArrayList<String> list = new ArrayList<String>();
    abstract void call(String no);
    abstract void send_message(String message);
    public void addContact(String contact){
        list.add(contact);
    }
}
class Samsung extends mobile{
     void call(String number){
         System.out.println("calling the person  " + number);
     }
     void send_message(String message){
         System.out.println("sending message "+message);
     }
}