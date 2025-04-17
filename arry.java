import java.util.Scanner;
public class arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter array values");
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nsum:"+ sum);
    }
    
}
