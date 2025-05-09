class Shape{
    void area(double a){
        System.out.println("area of circle"+2*3.14*a*a);
        }
    void area(int b){
        System.out.println("area of square"+b*b);
    }
    void area(int h,int c){
        System.out.println("area of triangle"+1/2*h*c);
    }
}
class overloading3 {
    public static void main(String[] args) {
        Shape obj= new Shape();
        obj.area(4.25);
        obj.area(45);
        obj.area(34,2);
    }
    
}

