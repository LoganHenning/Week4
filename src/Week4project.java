import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week4project {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.	Create an instance of an ArrayList of String called employeeNames
		
		List<String>employeeNames = new ArrayList<String>();
				
		//2.	Create an instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		
		//3.	Create an instance of a HashMap of Integer, String called employeeMap
		Map<Integer, String>employeeMap = new HashMap<Integer, String>();
		
		
		//4.	Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
		employeeNames.add("Hannah");
		employeeNames.add("Tanner");
		employeeNames.add("Victoria");
		employeeNames.add("Clay");
		employeeNames.add("Alex");
		
		//5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
			System.out.println(id);
			
		}
		//6.	Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.
		for(Integer key : employeeMap.keySet()) {
			System.out.printf("%d is %s.%n", key, employeeMap.get(key));
		}
		//7.	Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
		//8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
			idsBuilder.setLength(idsBuilder.length() - 1);	
		}
		
		
		
		//9.	Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		//10.	Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
		//11.	Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		//12.	Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());

		
		
		
		
		
		
		
		
		
		
	
			}
			
	}
			
			
		
		
	
		
		
		
		
		
		
		
		
		
	
	
	
