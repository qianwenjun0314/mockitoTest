package com.qianwenjun.study.injectmock;

import com.qianwenjun.study.mock.DoFirst;
import com.qianwenjun.study.mock.DoTwice;
import com.qianwenjun.study.mock.DoVertify;

public class DoAction {
	
	private DoVertify vertify;
	
	public void doActionTest(){

//		DoVertify vertify = new DoVertify();
		if (vertify.doVertifymethon()){
			DoFirst first = new DoFirst();
			first.doFirstAction();
			if (vertify.doVertifymethon()){
				DoTwice twice = new DoTwice();
				twice.doTwiceAction();
			}
		}
	}
}
