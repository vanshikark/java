public class oearr {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int even=0;
        int odd=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0)
            {
               even++;
            }
            else{
               odd++; 
            }
        }
        System.out.println("even"+" "+even+" "+"odd"+" "+odd);
        }
    }
    

