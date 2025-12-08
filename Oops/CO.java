package Oops;
public class CO{
    public static void main(String[] args) {
        Car c = new Car();
        c.clutch();
    }
}
class Car{
    void clutch(){
        System.out.println("This is a clutch");
    }
}