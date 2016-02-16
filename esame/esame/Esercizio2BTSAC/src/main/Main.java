package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		PressureSensor sensor = new PressureSensor();
		double max = 0;
		double val = 0;
		
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			val = sensor.getRand().nextDouble() * 20.0 - 1.0;
			li.add((int) val);
			sensor.next();

		}
		for(int k = 0; k < li.size(); k++){
			if(max < li.get(k)) max = li.get(k);	
		}
		
		Optional<Integer> res = li.stream().
				map(x -> x * 1). 
				reduce((a, x) -> a + x); 
		
		int x = res.orElse(0);
		double medium = x / li.size();
		Math.round(max);
		Math.round(medium);
		System.out.println(max); 
		System.out.println(medium);

		

	}

}
