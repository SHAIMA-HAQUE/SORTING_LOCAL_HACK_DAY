import java.util.*;
/**
 * SortReverse
 */
public class SortReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 1123, 520, 366, 420 };
        List<Integer> numbersList = Arrays.asList(numbers);
 

        Collections.sort(numbersList, Collections.reverseOrder());
 

        System.out.println(numbersList);
    }
}