public class exception2 {
    public static void main(String[] args) {
        int[] arr={2,4,5,67};
        try {
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
