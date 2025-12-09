//LAMBDA EXPRESSION
// IT is a way of making code into simple and shorter and lambda expression can be created when functional interface class


package features;

public class Lambda {

    public static void main(String[] args) {
        Finterface f = () ->"This is a lambda expression with functional interface";
        System.out.println(f.sound());
    }
    
}
