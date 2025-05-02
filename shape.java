class Person1 {
    void displayname()
    {
        System.out.println("name");
    }
    
}
class Student extends Person1{
    void displayclass()
    {
        System.out.println("class");
    }
}
class Monitor extends Student{
    void checkdiscipline()
    {
        System.out.println("discipline");
    }
}
class Person{
    public static void main(String[] args) {
        Monitor obj = new Monitor();
        obj.displayname();
        obj.displayclass();
        obj.checkdiscipline();

    }
}
