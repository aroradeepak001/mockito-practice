package org.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.junit.Assert.*;

@PrepareForTest
@RunWith(PowerMockRunner.class)
public class AppTest{
	Apple apple;
	SampleAPP sampleapp;
	@Before
	public void setup(){
		
		sampleapp = Mockito.mock(SampleAPP.class);
		apple = new Apple();
		apple.setName("Orange");
		when(sampleapp.getApple()).thenReturn(apple);
		doThrow(new RuntimeException()).when(sampleapp).sayHello();
		System.out.println("test");
		
		
	}
	
	@Test
	public void testApple(){
		System.out.println("test");
		assertTrue(sampleapp.getApple().equals(apple));
	}
	
	@Test(expected=RuntimeException.class)
	public void testHello(){
		
		sampleapp.sayHello();
		
	}

	
	
}