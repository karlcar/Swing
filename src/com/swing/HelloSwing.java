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
		this.setVisible(true);//����Ĭ�ϲ��ɼ�
		this.setTitle("JFrame");
		this.setBounds(300, 300, 500, 300); //��ߴ�
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //Ĭ�ϵ���ر�֮��ͻ���ڴ���ɾ�������ڰ����
	
		JLabel label = new JLabel("����JLabel������");//���ı�
		label.setForeground(new Color(255,0,0));
		label.setFont(new Font("����", Font.ITALIC,20));
		label.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
		
		this.add(label);
	
	
	
	
	}
	
	public static void main(String[] args) {
		HelloSwing hs = new HelloSwing();
	}

}
