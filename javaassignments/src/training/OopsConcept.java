package training;

class Employee {
private String empName;
private String empId;
private String empAddress;
private double salary;
public String getEmpName() {
return empName;
}
public void setEmpName(String empName) {
this.empName = empName;
}
public String getEmpId() {
return empId;
}
public void setEmpId(String empId) {
this.empId = empId;
}
public String getEmpAddress() {
return empAddress;
}
public void setEmpAddress(String empAddress) {
this.empAddress = empAddress;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
@Override
public String toString() {
return "Employee [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress + ", salary=" + salary
+ "]";
}
}

public class OopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsConcept op = new OopsConcept();
		
		System.out.println(op.toString());
	}

}
