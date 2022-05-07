import java.util.Arrays;
import java.util.Random;
public class SortingClass {
    public SortingClass(){

        calculateAvarageTime('H', 'R', 100000);
    }
    private void FillArrayConstant(int[] arr){
        Arrays.fill(arr, 1);

    }
    private void FillArrayIncreasing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

    }

    private void FillArrayRandom(int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(arr.length);
        }
    }

    private void FillArrayDecreasing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

    }


    private void calculateAvarageTime(char sortType, char fillType, int number){
        int[] arr = new int[number];
        System.gc();
        long totaltime = 0;

        for (int i = 0; i < 10; i++) {

            if(fillType == 'C'){ // constant
                FillArrayConstant(arr);
            }
            else if(fillType == 'I'){ // increasing
                FillArrayIncreasing(arr);
            }
            else if(fillType == 'D'){ // decreasing
                FillArrayDecreasing(arr);
            }
            else if(fillType == 'R'){ // random
                FillArrayRandom(arr);
            }
            else{
                // This shouldn't happen
            }
            long startTime = System.nanoTime();
            if(sortType == 'H'){ // heap
                new HeapSort(arr);
            }
            else if(sortType == 'I'){ // intro
                new IntroSort(arr);
            }
            else if(sortType == 'S'){ //shell
                new ShellSort(arr);
            }
            else{
                // This shouldn't happen
            }
            long esimatedTime = System.nanoTime() - startTime;
            //System.out.println(esimatedTime);
            totaltime += esimatedTime;

        }
        totaltime /= 10;
        System.out.println(totaltime);
    }


}
