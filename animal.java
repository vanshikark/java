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
class Animal{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();

    }
}