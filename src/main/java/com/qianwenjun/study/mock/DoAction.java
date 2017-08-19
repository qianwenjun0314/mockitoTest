package com.qianwenjun.study.mock;

public class DoAction {
	public void doActionTest(){
		DoVertify vertify = new  DoVertify();
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
