public class dsa4{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
            max = arr[i];
            }
            if (arr[i] < min) {
            min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        scanner.close();
    }
    
}
