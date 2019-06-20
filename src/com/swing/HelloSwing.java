package com.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing extends JFrame{
	
	
	public HelloSwing() throws HeadlessException {
		super();
		this.setVisible(true);//窗口默认不可见
		this.setTitle("JFrame");
		this.setBounds(300, 300, 500, 300); //框尺寸
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //默认点击关闭之后就会从内存中删除，等于按红点
	
		JLabel label = new JLabel("我是JLabel，高手");//放文本
		label.setForeground(new Color(255,0,0));
		label.setFont(new Font("黑体", Font.ITALIC,20));
		label.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
		
		this.add(label);
	
	
	
	
	}
	
	public static void main(String[] args) {
		HelloSwing hs = new HelloSwing();
	}

}
