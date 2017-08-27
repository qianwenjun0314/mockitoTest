package com.qianwenjun.study.mock;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.qianwenjun.study.injectmock.DoAction;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
		
	@InjectMocks
	DoAction action = new DoAction();
	
	@Mock
	private DoVertify doVertify;
	
	@Test
	public void mockCheck(){
				
		MockitoAnnotations.initMocks(this);
		
		Mockito.when(doVertify.doVertifymethon()).thenReturn(true).thenReturn(false);
		
		action.doActionTest();
		
//		if (doVertify.doVertifymethon()){
//			DoFirst first = new DoFirst();
//			first.doFirstAction();
//			if (doVertify.doVertifymethon()){
//				DoTwice twice = new DoTwice();
//				twice.doTwiceAction();
//			}
//		}
	}
}
