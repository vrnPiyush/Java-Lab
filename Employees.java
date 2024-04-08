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

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Employees {
    public static void main(String[] args) {
      
        Employee[] employees = new Employee[10];
        
        employees[0] = new Employee("Ram", 50000, 30);
        employees[1] = new Employee("Rahul", 60000, 25);
        employees[2] = new Employee("Rohan", 55000, 35);
        employees[3] = new Employee("Raman", 70000, 28);
        employees[4] = new Employee("Raghav", 48000, 32);
        employees[5] = new Employee("Rohit", 62000, 27);
        employees[6] = new Employee("Rohan", 53000, 40);
        employees[7] = new Employee("Raju", 58000, 45);
        employees[8] = new Employee("Ramesh", 54000, 38);
        employees[9] = new Employee("Ritesh", 65000, 33);


        
        Employee LargestSalaryemp = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > LargestSalaryemp.getSalary()) {
                LargestSalaryemp = employees[i];
            }
        }

    
        System.out.println("Employee with the largest salary:");
        System.out.println("Name: " + LargestSalaryemp.getName());
        System.out.println("Salary: " + LargestSalaryemp.getSalary());
    }
}

