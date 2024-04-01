import java.util.Arrays;
import java.util.List;

/**
 * Problem3
 */
public class Problem3 {
    public static void main(String[] args) {
         List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg","fgffhh");
       long count=  strList.stream().filter(n->!n.isEmpty()).filter(n->n.charAt(0)=='a').count();
       System.out.println(count);
    }
    
}
