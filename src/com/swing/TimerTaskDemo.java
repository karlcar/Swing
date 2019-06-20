package com.swing;

import java.util.Timer;
import java.util.TimerTask;

//定时器
public class TimerTaskDemo {
	int i = 0;
	public void test() {
		Timer timer = new Timer(); 
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(i++);  //匿名内部类引用外部的局部变量，只能用final，但是final又是不能变，只能用全局的变量
			}
		}, 3000,1000);
	}
	
	public static void main(String[] args) {
		new TimerTaskDemo().test();
}
}