class Animal1 {
    void eat()
    {
        System.out.println("eating");
    }
    
}

class Dog extends Animal1{
    void bark()
    {
        System.out.println("bow bow");
    }
}
class Cat extends Animal1{
    void sound()
    {
        System.out.println("meoww");
    }
}
class Animal3{
    public static void main(String[] args) {
    Dog obj=new Dog();
    obj.eat();
    obj.bark();
    Cat obj1 = new Cat();
    obj1.eat();
    obj1.sound();

}
}

 