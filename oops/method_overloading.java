package oops;

public class method_overloading {
    public static void main(String[] args) {
        addition obj = new addition();
        int first = obj.add(23,24);
        int second = obj.add(12,23,54);
        System.out.println(first);
        System.out.println(second);
    }
}
class addition{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}