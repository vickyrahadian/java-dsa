package sorting;

import java.util.Arrays;

public class ShellSorting {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int gap = numbers.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < numbers.length; i++){
                int newElement = numbers[i];
                int j = i;

                while(j >= gap && numbers[j-gap] > newElement){
                    numbers[j] = numbers[j-gap];
                    j -= gap;
                }

                numbers[j] = newElement;
            }

        }

        System.out.println(Arrays.toString(numbers));

    }

}
