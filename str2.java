public class str2 {
    public static void main(String[] args) {
        String str="eye";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("p");
        }
        else{
            System.out.println("n");
        }
    }
    
}
