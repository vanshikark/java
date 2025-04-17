public class palindrome {
    public static void main(String[] args) {
        int a=859;
        int variable=a;
        int rev=0;
        while(a>0)
        {
          int digit=a%10;
          rev=rev*10+digit;
          a=a/10;

        }
        if(variable==rev) {

        
        System.out.println("P"); }
        else
        {
            System.out.println("N");
        }
    }
    }
    

