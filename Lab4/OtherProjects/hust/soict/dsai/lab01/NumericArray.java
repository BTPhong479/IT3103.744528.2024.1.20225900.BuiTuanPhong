import java.util.Arrays;
import java.util.Scanner;


public class NumericArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int avg;
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        System.out.print("\nSum: "+sum+"\nAvg: "+sum/n);

    }
}
