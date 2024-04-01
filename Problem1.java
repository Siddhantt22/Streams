import java.util.Arrays;
import java.util.List;

/**
 * Problem1
 */
public class Problem1 {
    public static void main(String[] args) {
         List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg","fgffhh");
       long count=  strList.stream().filter(n->n.isEmpty()).count();
       System.out.println(count);
         
    }
    
}