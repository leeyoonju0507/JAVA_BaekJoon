package javaStudy0710;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MOBIS3 {

	public static void main(String[] args) {    
	      List<HashMap<String, Integer>> aa = new ArrayList<HashMap<String, Integer>>();
	      
	      
	      HashMap<String, Integer> bb = new HashMap<String, Integer>();
	      
	      bb.put("one", 1);
	      bb.put("two", 2);
	      bb.put("three", 3);
	      bb.put("four", 4);
	      
	      
	      aa.add(bb);
	      
	      bb.put("one", 5);
	      bb.put("two", 6);
	      bb.put("three", 7);
	      bb.put("four", 8);
	      
	      aa.add(bb);
	      
	      System.out.println(aa.get(1).get("four"));
		   

	}

}
