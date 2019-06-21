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
		this.setBounds(300, 300, 500, 300); //��ߴ�
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //Ĭ�ϵ���ر�֮��ͻ���ڴ���ɾ�������ڰ����
	
		
		this.setVisible(true);//����Ĭ�ϲ��ɼ�
		
		//����һ���������������ӡһ���ı�
		JButton button = new JButton("ע��");
		HelloSwingJButton hb = this;
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("���´���");
				hb.setVisible(false);
				new BorderFlowLayoutDemo();
			}
		});
		this.add(button,BorderLayout.NORTH);
		
		this.add(new JButton("ע��2"),BorderLayout.SOUTH);
		
		this.pack();//�Զ����ƴ�С
	}
	
	//������������ʱ�������
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
