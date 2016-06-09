package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format

		//lambda
		list.parallelStream().forEach(x->System.out.println(x.toUpperCase()));
		//method reference
		list.parallelStream().forEach(x->outPut(x));

	}
	static void outPut(String s){
		System.out.println(s.toUpperCase());
	}
	
	//implement a Consumer
	
	
}