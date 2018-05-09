
public class InheritanceOfPerson {
    public static void main(String[] args) {
        Person x = new Person();
        x.name = "Swan Patipan";
        x.idNumber = "2676354187365";
        x.address = "56 Jaktujak Bangkok";
        System.out.println(x.getName() + ":" + x.getAddress());
        x = new Employee();
        x.name = "Iti Para";
        x.idNumber = "2176872865276";
        x.address = "43 Taweewattana Bangkok";
        System.out.println(x.getName() + ":" + x.getAddress());
    }
}


class Person {
    protected String name;
    protected String idNumber;
    protected String address;
    //
    public Person() {
        this.name = "";
        this.idNumber = "";
        this.address = "";
    }
    
    public Person(String name) {
        this.name = name;
        
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
}

class Employee extends Person {
    private String position;
    private double salary;
    //
    public Employee() {
        this.position = "Worker";
        this.salary = 9000;
    }
    public Employee(String position, double money) {
        this.position = position;
        this.salary = money;
    }
    public void promote(String position, double money) {
        this.position = position;
        this.salary = money;
    }
    public void printDetail() {
        System.err.println(String.format("%s:%s\n%s %d", this.name, this.address, this.position, this.salary));
    }
}

class HourlyEmployee extends Person {
    private int hours;
    private double wage;
    //
    public HourlyEmployee(double wage) {
       this.wage = wage;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public double totalWage() {
        return this.hours * this.wage;
    }
}
