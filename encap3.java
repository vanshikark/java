class Employee {
    private String name;
    private int salary;
    private int id;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class encap3 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        obj.setName("vanshika");
        System.out.println(obj.getName());
        obj1.setSalary(59000);
        System.out.println(obj1.getSalary());
        obj2.setId(394);
        System.out.println(obj2.getId());
    }
}

