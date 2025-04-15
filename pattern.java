public class pattern {
    public static void main(String[] args) {
        System.out.println("triangle");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(); 
    }
    System.out.println(" reverse triangle");

    for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println(); 
}

System.out.println("rectangle");

for(int i=1;i<=5;i++){
    for(int j=1;j<=5;j++)
    {
        System.out.print("*");
    }
    System.out.println(); 
} 

System.out.println("pyramid");

for(int i=1;i<=5;i++){
    for(int j=i;j<5;j++)
    {
        System.out.print(" ");
    }
    for(int k=1;k<=(2*i-1);k++){
        System.out.print("* ");
    }
    System.out.println(); 
    }
    System.out.println("reverse pyramid");

for(int i=5;i>=1;i--){
    for(int j=i;j<5;j++)
    {
        System.out.print(" ");
    }
    for(int k=1;k<=(2*i-1);k++){
        System.out.print("* ");
    }
    System.out.println(); 
    }

}
}

