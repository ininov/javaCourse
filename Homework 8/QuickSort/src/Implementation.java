import java.util.Arrays;


public class Implementation {
	
	public static int pivot(int[] a, int low, int high){
        int mid = (low+high)/2;
        int pivot = a[low] + a[high] + a[mid] - Math.min(Math.min(a[low], a[high]), a[mid]) - Math.max(Math.max(a[low], a[high]), a[mid]);

        if(pivot == a[low])
            return low;
        else if(pivot == a[high])
            return high;
        return mid;
    }

    public static int partition(int[] a, int low, int high){

        int k = pivot(a, low, high);
        //System.out.println(k);
        swap(a, low, k);
        //System.out.println(a);
        int j = high + 1;
        int i = low;
        while(true){

            while(a[low] < a[--j])
                if(j==low)   break;

            while(a[++i] < a[low])
                if(i==high) break;

            if(i >= j)  break;
            swap(a, i, j);
        }
        swap(a, low, j);
        return j;
    }

    public static void sort(int[] a, int lo, int hi){
        if(hi<=lo)  return;
        int p = partition(a, lo, hi);
        sort(a, lo, p-1);
        sort(a, p+1, hi);
    }

    public static void swap(int[] a, int b, int c){
        int swap = a[b];
        a[b] = a[c];
        a[c] = swap;
    }

    public static void sort(int[] a){
        sort(a, 0, a.length - 1);
        System.out.print(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] arr = {17, 3,5, 12, 1, 8};
        sort(arr);
    }
}

