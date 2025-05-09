class Atm{
    private int a;
    void setRuppes(int a){
        this.a=a;
    }
    int getRuppes(){d
        return a;
    }
}
public class encap {
    public static void main(String[] args) {
        Atm obj=new Atm();
        obj.setRuppes(10000);
        System.out.println(obj.getRuppes());
    }
}


