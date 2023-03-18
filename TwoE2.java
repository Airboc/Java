import java.util.Scanner;
import java.util.ArrayList;
public class TwoE2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] x = new int[n];
        int[] count = new int[n];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < n ;i++) {
            list1.add(i,scan.nextInt());
            x[i] = list1.get(i);
            for (int j = 0; j < list1.get(i); j++){
                list2.add(j,scan.nextInt());
                arr[i]+=list2.get(j);
            }
            arr[i] = arr[i]/x[i];
        }
        System.arraycopy(arr, 0, count, 0, n);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (count[j] > count[j + 1]) {
                    int temp = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (count[i] == arr[j]){
                    int pbs=0;
                    for (int p = n-1; p > j; p--)
                        pbs+=x[p];
                    for (int p = 0; p < x[j]; p++,pbs++){
                        if (p<x[j]-1)
                            System.out.print(list2.get(pbs)+" ");
                        if (p==x[j]-1)
                            System.out.println(list2.get(pbs));
                    }
                }
            }
        }
    }
}