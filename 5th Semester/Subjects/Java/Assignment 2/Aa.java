public class Aa {
    public static void main(String[] args) {
        employee emp1 = new employee(101, "Geet Ahire", "Music", 120000);
        System.out.println("ID : " + emp1.id + "\nName : " + emp1.name + "\nDeptartment Name : " + emp1.deptName
                + "\nSalary : " + emp1.salary);
        System.out.println(employee.count + " class created!\n");

        employee emp2 = new employee(102, "Rohan Bhujbal", "CS", 80000);
        System.out.println("ID : " + emp2.id + "\nName : " + emp2.name + "\nDeptartment Name : " + emp2.deptName
                + "\nSalary : " + emp2.salary);
        System.out.println(employee.count + " class created!\n");

        employee emp3 = new employee(103, "Sumit Burhade", "Sales", 45000);
        System.out.println("ID : " + emp3.id + "\nName : " + emp3.name + "\nDeptartment Name : " + emp3.deptName
                + "\nSalary : " + emp3.salary);
        System.out.println(employee.count + " class created!\n");
    }
}

class employee {
    int id;
    String name;
    String deptName;
    int salary;
    static int count = 0;

    employee() {
        id = -1;
        name = "NA";
        deptName = "NA";
        salary = -1;
        employee.count++;
    }

    employee(int id, String name, String deptName, int salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        employee.count++;
    }
}