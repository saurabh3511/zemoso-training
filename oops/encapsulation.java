package oops;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

public class encapsulation {
    public static void main(String[] args){
        encapsul obj = new encapsul();
        obj.setNameContact("saurabh bisht","9716655386");
        System.out.println("my name is " + obj.getName());
        System.out.println("my contact number is " + obj.getContact());
    }
}

class encapsul{
    private String name ;
    private String contact;
    public void setNameContact(String name,String contact){
        this.name = name;
        this.contact =contact;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
}