// SUPPRESSWARNINGS
// this annotations is used explicitly to tell the springboot that this code safe don't show the warnings

package Annotation;

import java.util.ArrayList;
import java.util.List;

public class Suppresswarning {
    
    //@SuppressWarnings("checked"). ===== this annotation used for above definition.
     void test(){
        List ls = new ArrayList<>();
        ls.add("size");
        ls.add(5);
        System.out.println("Thanks suppresswarnings"+ls);
    }
    public static void main(String[] args) {
        Suppresswarning s = new Suppresswarning();
        s.test();
    }
}

//ERROR: Note: Annotation/Suppresswarning.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.