package Annotation;

import Annotation.Callmethods.Animal;

public class Simple {

    public static void main(String[] args) {

      Animal a = () ->"enter a number";
       System.out.println(a.sound());
        
    }
    
}
