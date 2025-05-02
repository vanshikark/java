class student {
    String firstname="rish";
    int age=12;

    student(String s,int a){
        firstname=s;
        age=a;
      
        System.out.println(firstname+  " "+age);
    }
    
}
class hello{
    public static void main (String[] args) {
        student obj=new student("rish",6);
        student obj2=new student ("vansh",9);
    }
}