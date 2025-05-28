package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class JavaOutput {

	public static void main(String[] args) {
		
		
		String a = "Welcome";
		String b = new String("Welcome");
		
		Map map = new HashMap();
		map.put(a, "1");
		map.put(b, "2");
		
		System.out.println("Map Size : " + map.size()); 

	}

}
