import java.util.*;
public class Sort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };
        List<Integer> numbersList = Arrays.asList(numbers);
        Collections.sort(numbersList);
        System.out.println(numbersList);
    }
}
