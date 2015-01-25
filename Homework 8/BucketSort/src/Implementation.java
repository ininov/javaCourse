import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Implementation {
	
	public static void main(String[] args) {
        int[] arr = new int[]{20, 3, 7, 4, 1, 9, 6, 15,5} ;
        
////        Random rand = new Random();
//        for (int i = 0; i < arr.length; i++) {
//			arr[i]=rand.nextInt();
//			System.out.println(arr[i]);
//		}
//        
//        
        
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = bucketSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	

	 public static int[] bucketSort(int[] arr) {
	        int i;
	        int j;
	        int[] count = new int[arr.length];
	        Arrays.fill(count, 0);

	        for (i = 0; i < arr.length; i++) {
	            count[arr[i]]++;
	        }

	        for (i = 0, j = 0; i < count.length; i++) {
	            for (;count[i]>0; (count[i])--) {
	                arr[j++] = i;
	            }
	        }
	        return arr;
}
}
