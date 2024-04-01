import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {
        List<String> mapExampleList = Arrays.asList("USA", "Japan", "France", "Germany",
                                        "Italy", "U.K.","Canada");
  String Result= mapExampleList.stream()
  .map(String::toUpperCase)
  .collect(Collectors.joining(",")); 

  System.out.println(Result);
    }
}
