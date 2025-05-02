class studentt {
    String firstname="rish";
    int age=12;
     
    studentt(){
        System.out.println("hello");
    }
    studentt(String firstname){
      this();
      System.out.println(firstname);
    }
    studentt(String firstname,int age){
        this(firstname);
        this.firstname=firstname;
      
        System.out.println(firstname+  " "+age);
    }
    
}
class hello4{
    public static void main (String[] args) {
        studentt obj=new studentt("rish",98);
        //student obj2=new student ("vansh",90);

        //System.out.println(obj.firstname);
        //System.out.println(obj2.firstname);

    }
}
