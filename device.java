class Device1 {
    void poweron()
    {
        System.out.println("starting on");
    }
    
}
class Laptop extends Device1{
    void boot()
    {
        System.out.println("booting");
    }
}
class Gaminglaptop extends Laptop{
    void startgame()
    {
        System.out.println("game start");
    }
}
class Device{
    public static void main(String[] args) {
        Gaminglaptop obj = new Gaminglaptop();
        obj.poweron();
        obj.boot();
        obj.startgame();

    }
}

