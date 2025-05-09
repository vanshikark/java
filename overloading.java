class Parent{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
class Overloading {
    public static void main(String[] args) {
        Parent obj= new Parent();
        obj.sum(420);
        obj.sum(89,54);
        obj.sum(89,78,90);
    }
    
}
