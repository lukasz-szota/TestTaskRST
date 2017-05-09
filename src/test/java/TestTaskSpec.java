package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.java.TestTask;

import org.junit.Test;

public class TestTaskSpec {

	private static final double DELTA = 1e-14;
	
	@Test
	public void whenInvokeOnEmptyListThenReturnEmptyList() {
		
		List<Number> emptyList = new ArrayList<Number>();
		
		assertEquals(emptyList, TestTask.calculateSquares(emptyList));
	}
	
	@Test
	public void returnCalculationResultForAllNumbersWithAbsoluteValueLessThan64() {
		
		List<Number> list = new ArrayList<Number>();
		list.add(new Integer(64));
		list.add(new Integer(-64));
		list.add(new Double(64.0));
		list.add(new Double(-64.0));
		
		assertEquals(0, TestTask.calculateSquares(list).size());
		
		list.clear();
		list.add(new Integer(0));
		list.add(new Integer(63));
		list.add(new Integer(-63));
		list.add(new Double(64.0 - DELTA));
		list.add(new Double(-64.0 + DELTA));
		
		assertEquals(5, TestTask.calculateSquares(list).size());
	}
	
	@Test
	public void whenNumberAbsoluteValueIsLessThan64ThenReturnNumberSquare() {
		
		List<Number> list = new ArrayList<Number>();
		
		list.add(new Integer(0));
		assertEquals(0.0, TestTask.calculateSquares(list).get(0));
		
		list.add(new Integer(-1));
		assertEquals(1.0, TestTask.calculateSquares(list).get(1));
		
		list.add(new Integer(2));
		assertEquals(4.0, TestTask.calculateSquares(list).get(2));
		
		list.add(new Double(64.0 - DELTA));
		assertEquals(new Double((64.0 - DELTA) * (64.0 - DELTA)), TestTask.calculateSquares(list).get(3));
	}

}
