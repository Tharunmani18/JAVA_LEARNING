import java.util.Arrays;
import java.util.Comparator;

public class example {

    public static void main(String[] args) {
      int[] arr = {10,30,50,40,20};
      int secondhighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow(() -> new RuntimeException("no 2nd highest found"));
      System.out.println("found 2nd higest : "+secondhighest);
    }
    
}
