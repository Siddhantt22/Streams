import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Problem4
 */
public class Problem4 {
    public static void main(String[] args) {
         List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg","fgffhh");
      List<String>strList2=  strList.stream().filter(n->!n.isEmpty()).collect(Collectors.toList());
      strList2.forEach(n->System.out.println(n));
    }
    
}




