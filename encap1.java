class Bankaccount{
    private int a;
    void setDeposit(int a){
        this.a=a;
    }
    int getWithdrwal(){
        return a;
    }
}
public class encap1 {
    public static void main(String[] args) {
        Bankaccount obj=new Bankaccount();
        obj.setDeposit(98000);
        System.out.println(obj.getWithdrwal());
    }
}



