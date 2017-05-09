package main.java;

import java.util.ArrayList;
import java.util.List;

public class TestTask {
	
	private static final double MAX = 64.0;
	
	public static List<Number> calculateSquares(List<Number> list) {
		
		ArrayList<Number> result = new ArrayList<Number>();
		
		for (Number number:list) {
			
			if(Math.abs(number.doubleValue()) < MAX) {
				result.add(new Double(number.doubleValue() * number.doubleValue()));
			}
		}
		return result;
	}
	
}
