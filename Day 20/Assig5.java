import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Assig5 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101, "Sudam", "123 Aurangabad, India", 20000.0));
		list.add(new Employee(102, "Virendra", "234 Nashik, Pakistan", 30000.0));
		list.add(new Employee(103, "Vijay", "345 Pune, SouthAfirca", 25000.0));
		list.add(new Employee(104, "Vaibhav", "456 Delhi, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}