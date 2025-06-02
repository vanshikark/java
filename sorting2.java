import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    String name;
    int rollNo;
    public Student(int age,String name,int rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;uu
    }
    public  String toString(){
        return age + " " + name + " " + rollNo;
    }
}
class sortByName implements  Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByAge implements  Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.age-s2.age;
    }
}


class  sorting2{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(10, "rohit", 45));
        list.add(new Student(32, "mohit", 34));
        list.add(new Student(10, "om", 55));
        Collections.sort(list,new sortByName());
        for(Student s :list){
            System.out.println(s);
        }
        Collections.sort(list,new sortByAge());
        for(Student s2 :list){
            System.out.println(s2);
        }
    }
}
