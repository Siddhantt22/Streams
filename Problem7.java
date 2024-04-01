import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem7
 */

public class Problem7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
 numbers.stream()
                  .map(n->n*n)
  .forEach(m->System.out.println(m));
    }
}
