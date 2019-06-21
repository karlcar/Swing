package com.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {

	public FlowLayoutDemo() throws HeadlessException {
		this.setTitle("登录页面");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//设置布局管理器
		this.setLayout(new FlowLayout());
		this.add(new JLabel("用户名"));
		this.add(new JTextField(20));
		this.add(new JLabel("密码"));
		this.add(new JPasswordField(20));
		this.add(new JButton("登录"));
		this.add(new JButton("注册"));
		
		
		
		
		
		//this.pack();
		this.setBounds(500,300,300,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutDemo demo = new FlowLayoutDemo();
	}
}
