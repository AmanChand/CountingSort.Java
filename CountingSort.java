/**
* Problem 3A
*/

public class CountingSort {

    public static void main(String[] args) {
    CountingSort countingSort = new CountingSort();
    int[] arrayToSort = new int[] { 4, 2, 1, 3, 4, 1, 2, 1, 0, 4 };
    int[] sortedArray = countingSort.counting_sort(arrayToSort);

    for (int i = 0; i < sortedArray.length; i++) {
    System.out.print(sortedArray[i] + ","); //print the sorted array

    }
    
    }
    /**
* Does the counting Sort on the input array
*/
    
    public int[] counting_sort(int[] arrayToSort) {
    int maxValue = getMaxValue(arrayToSort);
    int[] finalSortedArray = new int[arrayToSort.length];
    int[] tempArray = new int[maxValue + 1];
    

        for (int i = 0; i < arrayToSort.length; i++) {
        tempArray[arrayToSort[i]] = tempArray[arrayToSort[i]] + 1;

        }

        for (int i = 1; i < maxValue + 1; i++) {
        tempArray[i] = tempArray[i] + tempArray[i - 1];

        }

        for (int i = (arrayToSort.length - 1); i >= 0; i--) {
        finalSortedArray[tempArray[arrayToSort[i]] - 1] = arrayToSort[i];
        tempArray[arrayToSort[i]] = tempArray[arrayToSort[i]] - 1;

        }

            return finalSortedArray;

        }
        
    /**
    * finds the max value to sort the array
    */

    private int getMaxValue(int[] arrayToSort) {
    int maxVal = Integer.MIN_VALUE;

        for (int i : arrayToSort) {

        if (i > maxVal) {
            maxVal = i;

            }

        }
        
        return maxVal;
    }
}
