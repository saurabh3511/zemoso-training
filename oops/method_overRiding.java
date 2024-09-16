package oops;

public class method_overRiding {
    public static void main(String[] args) {
    A obj = new B();
    obj.display();
    }
}
class A{
    public void display(){
        System.out.print("you are in class A");
    }
}
class B extends A{
    public void display() {
        System.out.println("you are in class B");
    }
}