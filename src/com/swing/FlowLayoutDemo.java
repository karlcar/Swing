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
		this.setTitle("��¼ҳ��");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//���ò��ֹ�����
		this.setLayout(new FlowLayout());
		this.add(new JLabel("�û���"));
		this.add(new JTextField(20));
		this.add(new JLabel("����"));
		this.add(new JPasswordField(20));
		this.add(new JButton("��¼"));
		this.add(new JButton("ע��"));
		
		
		
		
		
		//this.pack();
		this.setBounds(500,300,300,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutDemo demo = new FlowLayoutDemo();
	}
}
