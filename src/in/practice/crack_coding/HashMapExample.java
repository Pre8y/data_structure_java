import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
	public static void main(String []a)
	{
		HashMap<Employee, String> map 
			= new HashMap<Employee, String>();
		map.put(new Employee(102), "Hari");
		map.put(new Employee(103), "Bari");
		map.put(new Employee(102), "Khari");
		Set<Employee> keys = map.keySet();
		for(Employee e :  keys)
			System.out.println(e+"==>"+map.get(e));
	
	}
}
	class Employee{
		int id;
		public Employee(int id)
		{
			this.id = id;
		}

		public int hashCode(){
			return id;
		}

		public boolean equals(Object obj)
		{
			if(obj instanceof Employee)
			{
				Employee e = (Employee) obj;
				return (e.id==this.id);

			}else return false;
		}

	

	}

