package JunitProject;

import java.util.*;
import java.util.stream.Collectors;

import lesson10.lecture.tdd.business.Address;

public class Util {
	//objective: convert a List of Address objects to a 
	//List of String arrays
	public static List<String[]> addressListToStringArrList(List<Address> listAddr){
		return listAddr.stream().map(x->new String[]{x.getStreet(),x.getCity(),x.getState(),x.getZip()}).collect(Collectors.toList());
		
			
				
		
	}		

}



