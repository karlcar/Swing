package com.swing;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloSwingJLabel extends JFrame{
	
	JLabel label;
	int i =0;
	public HelloSwingJLabel() throws HeadlessException {
		super();
		
		this.setTitle("JFrame");
		this.setBounds(300, 300, 500, 300); //框尺寸
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //默认点击关闭之后就会从内存中删除，等于按红点
	
		label = new JLabel("我是JLabel，高手");//放文本
		label.setForeground(new Color(255,0,0));
		label.setFont(new Font("黑体", Font.ITALIC,20));
		label.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.add(label);
		this.setVisible(true);//窗口默认不可见
		
		//增加一个鼠标左键点击，打印一个文本
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("我被点击了" + i++);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText(e.getX() + "," + e.getY());
			}
		});
		
		
	}
	
	//这个方法会给定时任务调用
	@Override
	public void repaint() {
		super.repaint();
		label.setText("123");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dataString = sd.format(new Date());
		System.out.println(dataString);
		label.setText(dataString); 
		
	}
	
	public static void main(String[] args) {
		HelloSwingJLabel hs = new HelloSwingJLabel();
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				hs.repaint();
//			}
//		}, 3000,1000);
	}

}
