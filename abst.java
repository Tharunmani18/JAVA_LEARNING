//main abstact class
abstract class Bike{
    abstract void run();
}

//child class
class Honda extends Bike{
    @Override
    void run(){
        System.out.println("Honda bike is so cool looking");
    }

}
//call all the abstact class here
public class abst extends Honda{
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
   
}
