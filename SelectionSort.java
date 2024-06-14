import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringList = scanner.nextLine().split(" ");
        int[] integerList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            integerList[i] = Integer.parseInt(stringList[i]);
        }

        System.out.println(selectionSort(Arrays.stream(integerList).boxed().collect(Collectors.toList())));
    }

    public static List<Integer> selectionSort(List<Integer> integerList) {
        List<Integer> sortedList = new ArrayList<>(integerList);

        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = i+1; j < sortedList.size(); j++) {
                if (sortedList.get(i) > sortedList.get(j)) {
                    int lowerValue = sortedList.set(i,sortedList.get(j));
                    sortedList.set(j, lowerValue);
                }
            }
        }

        return sortedList;
    }
}
