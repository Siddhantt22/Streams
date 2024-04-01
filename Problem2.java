import java.util.Arrays;
import java.util.List;

/**
 * Problem2
 */
public class Problem2 {
    public static void main(String[] args) {
         List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg","fgffhh");
       long count=  strList.stream().filter(n->n.length()>3).count();
       System.out.println(count);
    }
    
}
