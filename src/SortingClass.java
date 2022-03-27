import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingClass {
    public SortingClass(){
        int[] arr = IntStream.range(1, 10).toArray();

        //Arrays.fill(arr, 5);
        /*
        for (int i = 0; i < 10; i++) {
            arr[10-1-i] = i;
        }
        */

        long startTime = System.nanoTime();
        new ShellSort(arr);
        long esimatedTime = System.nanoTime() - startTime;
        System.out.println(esimatedTime);
    }
}
