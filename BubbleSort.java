import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringList = scanner.nextLine().split(" ");
        int[] integerList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            integerList[i] = Integer.parseInt(stringList[i]);
        }
        System.out.println("Now, your integer list sorted: ");
        System.out.println(bubbleSort(Arrays.stream(integerList).boxed().collect(Collectors.toList())));
    }

    public static List<Integer> bubbleSort(List<Integer> integerList) {
        boolean changeMade = true;
        while (changeMade) {
            changeMade = false;
            for (int i = 0; i < integerList.size() - 1; i++) {
                if (integerList.get(i) > integerList.get(i + 1)) {
                    int temporal = integerList.get(i + 1);
                    integerList.set(i + 1, integerList.get(i));
                    integerList.set(i, temporal);
                    changeMade = true;
                }
            }
        }
        return integerList;
    }
}
