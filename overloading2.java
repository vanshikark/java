class Parent{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
}
class Overloading2 {
    public static void main(String[] args) {
        Parent obj= new Parent();
        obj.sum(45,78);
        obj.sum(89,54,89);
        obj.sum(89,78);
    }
    
}

