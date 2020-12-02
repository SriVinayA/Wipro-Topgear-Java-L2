/*
Create an Employee class with the related attributes and behaviours. Create one more class
EmployeeDB which has the following methods.
a. boolean addEmployee(Employee e)
b. boolean deleteEmployee(int eCode)
c. String showPaySlip(int eCode)
d. Employee[] listAll()
Use an ArrayList which will be used to store the employees and use enumeration/iterator to
process the employees.
 */

package Topic4.Assignment3;

import Topic4.Assignment3.service.Employee;
import Topic4.Assignment3.service.EmployeeDB;

public class Assignment3 {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(1, "vinay", "vinay@gmail.com", 'm', 25000);
        Employee emp2 = new Employee(2, "varun", "varun@gmail.com", 'm', 35000);
        Employee emp3 = new Employee(3, "ram", "ram@gmail.com", 'm', 25000);
        Employee emp4 = new Employee(4, "ria", "ria@gmail.com", 'f', 55000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());
        System.out.println();
        empDb.deleteEmployee(2);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        System.out.println(empDb.showPaySlip(3));

    }
}