package mergesortedarrays;

import java.util.Arrays;

/**
 *
 * @author Tripunovska Tina
 *
 */
public class MergeSortedArrays {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[] array1 = {0, 1, 4, 13, 33};
        int[] array2 = {0, 2, 3, 5, 22, 30, 34, 50};
        mergeSortedArrays(array1, array2);

    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int [array1.length + array2.length];
        int array1Length = array1.length;
        int array2Length = array2.length;
        int i = 0;
        int j = 0;
        int m = 0;

        if (array1Length == 0) {
            return array2;
        }
        if (array2Length == 0) {
            return array1;
        }

        while (i < array1Length && j < array2Length) {
            if (array1[i] <= array2[j]) {
                mergedArray[m] = array1[i];
                i++;
            } else {
                mergedArray[m] = array2[j];
                j++;
            }
            m++;
        }
        
        while (i < array1Length) 
            mergedArray[m++] = array1[i++]; 

        while (j < array2Length) 
            mergedArray[m++] = array2[j++]; 
        
        System.out.println(Arrays.toString(mergedArray));
        return mergedArray;
    }

}
