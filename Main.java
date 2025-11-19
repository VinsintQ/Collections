import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static int[] findLargestAndSmallest(int[] array) {

        int smallest=array[0];
        int largest =array[0];
        int [] result = new int[2];

        for (int i :array){
            if (i<smallest){
                smallest =i ;
            }
            if (i>largest){
                largest=i;
            }
        }
        result[0]=smallest;
        result[1]=largest;




        return result ;
    }
    public static Object[] removeDuplicatesFromArray(int[] array) {

        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(array);
        for (int i :array) {
            if (!list.contains(i)){
                list.add(i);
            }

        }


        return list.toArray();


    }

    public static int sumOfTwoLargest(int[] array) {

        if (array.length==0){
            return 0;
        }else if (array.length==1) {
            return array[0];
        }
        int largest =Integer.MIN_VALUE;
        int second_Largest =Integer.MIN_VALUE;

        for (int a :array){
           if (a>largest){
               second_Largest =largest;
               largest=a;

           }else if(a>second_Largest){
               second_Largest =a ;
           }

        }
            return second_Largest+largest;
    }


    public static void main(String[] args) {


    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        return null;
    }

}
