import java.util.Scanner;
public class TwoC {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextByte();
        int[][] arr=new int[n][n];
        int k=1,i=0,j=0,t,flag=1;
        while (k<=n*n){
            if (j==0&&i==0&&k<=n*n){
                arr[i][j]=k;
                k++;
                i=0;
                j=1;
            }
            if (j==0&&i!=0&&k<=n*n){
                arr[i][j]=k;
                k++;
                t=i;
                i=j;
                j=t;
                j++;
            }
            if (i>=j&&j!=0&&k<=n*n){
                arr[i][j-1]=k;
                k++;
                if (j-1!=0)
                    arr[i][j-1]++;
                j--;
            }
            if (j>i&&k<=n*n){
                arr[i][j]=k;
                k++;
                arr[i+1][j]=k;
                i++;
            }
        }
        for (i=0;i<n;i++){
            for (j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.print("\n");
        }
    }
}
