package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloSwingJButton extends JFrame{
	
	int i =0;
	public HelloSwingJButton() throws HeadlessException {
		super();
		
		this.setTitle("JButton");
		this.setBounds(300, 300, 500, 300); //框尺寸
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //默认点击关闭之后就会从内存中删除，等于按红点
	
		
		this.setVisible(true);//窗口默认不可见
		
		//增加一个鼠标左键点击，打印一个文本
		JButton button = new JButton("注册");
		HelloSwingJButton hb = this;
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("打开新窗口");
				hb.setVisible(false);
				new BorderFlowLayoutDemo();
			}
		});
		this.add(button,BorderLayout.NORTH);
		
		this.add(new JButton("注册2"),BorderLayout.SOUTH);
		
		this.pack();//自动控制大小
	}
	
	//这个方法会给定时任务调用
	@Override
	public void repaint() {
		super.repaint();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dataString = sd.format(new Date());
		System.out.println(dataString);
		
	}
	
	public static void main(String[] args) {
		HelloSwingJButton hs = new HelloSwingJButton();
		
	}

}
