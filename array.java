public class array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] arr2={4,5,6,7,8};
        
        int[] m=new int[arr.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            m[i]=arr[i];
        }
        for(int j=0;j<arr2.length;j++){
            m[arr.length+j]=arr2[j];
        }
      System.out.println(m);
    
    }
}
