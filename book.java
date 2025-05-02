class Book1 {
    void read()
    {
        System.out.println("readinggg");
    }
    
}
class Novel extends Book1{
    void storyline()
    {
        System.out.println("storyyyy");
    }
}
class Book{
    public static void main(String[] args) {
        Novel obj = new Novel();
        obj.read();
        obj.storyline();

    }
}

