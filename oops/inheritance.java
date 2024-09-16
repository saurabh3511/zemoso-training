package oops;

public class inheritance {
    public static void main(String[] args) {
        poco phone = new poco();
        phone.feature();
        phone.phoneNumber();
        ios obj = new ios();
        obj.versions("13");
    }
}

class mobiles{
    public void phoneNumber(){
        System.out.print("there are 10 digits ");
    }
    public void phoneType(String type){
        System.out.print("this is a "+type+" phone");
    }
}
class poco extends mobiles{
    public void feature(){
        System.out.println("it has advance features");
    }
}

class ios extends mobiles{
 public void versions(String version){
     System.out.println("this is version " + version);
 }
}