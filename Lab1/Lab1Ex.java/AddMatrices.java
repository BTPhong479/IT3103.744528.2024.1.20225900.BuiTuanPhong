import java.util.Scanner;

public class AddMatrices {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n*n];
        int[] b= new int[n*n];
        for(int i=0;i<n*n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n*n;i++) b[i]=sc.nextInt();
        for(int i=0;i<n*n;i++){
            if(i%n==0) System.out.print("\n");
            System.out.print((a[i]+b[i])+" ")  ;
        }
    }
}
