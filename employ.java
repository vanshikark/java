class Employ1 {
    void work()
    {
        System.out.println("working");
    }
    
}
class Manager extends Employ1{
    void attendMeeting()
    {
        System.out.println("attending meetings");
    }
}
class Employ{
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.work();
        obj.attendMeeting();

    }
}
