package com.swing;

import java.util.Timer;
import java.util.TimerTask;

//��ʱ��
public class TimerTaskDemo {
	int i = 0;
	public void test() {
		Timer timer = new Timer(); 
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(i++);  //�����ڲ��������ⲿ�ľֲ�������ֻ����final������final���ǲ��ܱ䣬ֻ����ȫ�ֵı���
			}
		}, 3000,1000);
	}
	
	public static void main(String[] args) {
		new TimerTaskDemo().test();
}
}