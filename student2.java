class student {
    String firstname="rish";
    int age=12;

    student(String firstname,int age){
        this.firstname=firstname;
        age=age;
      
        System.out.println(firstname+  " "+age);
    }
    
}
class hello{
    public static void main (String[] args) {
        student obj=new student("rish",98);
        student obj2=new student ("vansh",90);

        System.out.println(obj.firstname);
        System.out.println(obj2.firstname);

    }
}
