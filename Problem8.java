import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Problem8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        IntSummaryStatistics result=numbers.stream().mapToInt(n->n).summaryStatistics();
        System.out.println("Count of the List is "+result.getCount());
        System.out.println("Minimum of the List is "+result.getMin());
        System.out.println("Maximum of the List is "+result.getMax());
        System.out.println("Sum of the List is "+result.getSum());
        System.out.println("Average of the List is "+result.getAverage());
    }
}
//Get count, min, max, sum, and the average for numbers