class Parent{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
}
class ctpoly {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.sum(9);
        obj.sum(9,7);
    }
    
}
