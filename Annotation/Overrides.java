
// OVERRIDE
//  java overriders the parent class methods from the child class


package Annotation;

import Annotation.Callmethods.*;

public class Overrides extends Animal{
    @Override
    public void sound(){
        System.out.println("makes dog sound");
    }

    public static void main(String[] args) {
        Overrides a = new Overrides();
        a.sound();
        
    }
    
}


//NOTE: 
// 1. avoid the mistakes of method names
// 2. steps : class -> methods -> statements

//errors: no