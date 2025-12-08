package programs;

import java.util.Arrays;
import java.util.Comparator;

public class hightwo {
    public static void main(String[] args) {
        int[] arr = {20,30,10,40,60,50};

        int secondhigh = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow(() -> new RuntimeException("No second highest"));
        System.out.println("second highest : "+secondhigh);
    }
    
}
