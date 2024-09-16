public interface interfaces {
    public void run();
    public void speed();

}
class interfacedemo implements interfaces{
    public void run(){
        System.out.println("running speed is good");
    }
    public void speed(){
        System.out.println("speed is testing ");

    }
}

 class test{
    public static void main(String[] args){
        interfacedemo obj = new interfacedemo();
        obj.run();
        obj.speed();
    }
}
