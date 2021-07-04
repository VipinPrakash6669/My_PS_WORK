package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BMICalculatorTest {

	@Test
	void Should_return_true_when_diet_recommended() {
		//assertTrue(BMICalculator.isDietRecommended(89.0,1.75));
		//given
		double weight=89.0;
		double height=1.72;
				
		//when
		boolean recommend=BMICalculator.isDietRecommended(weight, height);
		
		//then
		assertTrue(recommend);
	}

	@Test
	void Should_return_false_when_diet_notrecommended() {
		//assertTrue(BMICalculator.isDietRecommended(89.0,1.75));
		//given
		double weight=189.0;
		double height=1.72;
				
		//when
		boolean recommend=BMICalculator.isDietRecommended(weight, height);
		
		//then
		assertTrue(recommend);
	}
	
	@Test
	void Should_return_arithmetic_exception_when_height_zero() {
		//assertTrue(BMICalculator.isDietRecommended(89.0,1.75));
		//given
		double weight=189.0;
		double height=0;
				
		//when
		Executable executable=()->BMICalculator.isDietRecommended(weight, height);
		
		//then
		assertThrows(ArithmeticException.class, executable);
	}
	//test_with_multiple_assertion
	@Test
	void should_return_coder_with_worstBMI_inthe_List()
	{
		//given
		List<Coder> l=new ArrayList<Coder>();
		l.add(new Coder(1.80,60));
		l.add(new Coder(1.82,98));
		l.add(new Coder(1.82,64));
		
		///when
		Coder coderwithworstBMI=BMICalculator.findCoderWithWorstBMI(l);
		
		//then
		//assertEquals(1.82,coderwithworstBMI.getHeight());
		//assertEquals(98.0,coderwithworstBMI.getWeight());
		//now problem here is first assertion fails second will not execute or we cnt see if second assertion
		//is correct or not here we use assertAll
		assertAll(
				()->assertEquals(1.82,coderwithworstBMI.getHeight()),
				()->assertEquals(98.0,coderwithworstBMI.getWeight())
		);
	}
	@Test
	void should_returnNull_coder_with_worstBMI_inthe_List()
	{
		//given
		List<Coder> l=new ArrayList<Coder>();
		//when
		Coder coderwithworstBMI=BMICalculator.findCoderWithWorstBMI(l);
		//then
		assertNull(coderwithworstBMI);
	}
	//test array equality
	@Test
	void should_return_correct_BMIScore_array_when_coder_listisnot_empty()
	{
		//given
		List<Coder> l=new ArrayList<Coder>();
		l.add(new Coder(1.80,60));
		l.add(new Coder(1.82,98));
		l.add(new Coder(1.82,64.7));
		double[] expected= {18.52,29.59,19.53};
		//when
		double[] BMIScore=BMICalculator.getBMIScores(l);
		//then
		assertArrayEquals(expected, BMIScore);
	}
}
