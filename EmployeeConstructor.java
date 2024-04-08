class Employee {
    String name;
    double salary;
    int age;

    public Employee(String name, double salary,int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
  
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    

    public double getSalary() {
        return salary;
    }

    
}

public class EmployeeConstructor{
    public static void main(String[] args) {
      
       
        
        Employee e1= new Employee("Ram", 50000, 30);
        Employee e2=new Employee("Rahul", 60000, 25);
       


        
      

    
        System.out.println("Name: "+e1.getName()+" Salary: "+e1.getSalary()+" Age: "+e1.getAge());
        System.out.println("Name: "+e2.getName()+" Salary: "+e2.getSalary()+" Age: "+e2.getAge());
        
       
    }
}

