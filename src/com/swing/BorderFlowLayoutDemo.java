package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BorderFlowLayoutDemo extends JFrame {
	/*
	 * Ĭ�ϲ�����BorderLayout,
	 * 1���ٽ�3����岼�ֹ�������flowLayout 
	 * 2���ѵ�һ�������ڱ��� 
	 * 3���ѵڶ����������в� 
	 * 4���ѵ������������ϲ�
	 */
	public BorderFlowLayoutDemo() throws HeadlessException {
		this.setTitle("��¼ҳ��");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.setLayout(new FlowLayout());
		//���ò��ֹ�����
		panel1.add(new JLabel("�û���"));
		JTextField username = new JTextField(20);
		panel1.add(username);
		//��ɵڶ���
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(new JLabel("��    ��"));
		JPasswordField password = new JPasswordField(20);
		panel2.add(password);
		//��ɵ�����  
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton login = new JButton("��¼");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//��ȡ����������ֵ
				String myUsername = username.getText();
				String myPassword = password.getText();
				System.out.println(myUsername + "," + myPassword);
				if(myUsername.equalsIgnoreCase("karl") && myPassword.equalsIgnoreCase("1234")) {
					System.out.println("��¼�ɹ�" + myUsername + "," + myPassword);
				}else {
					System.out.println("�˺��������!");
				}
				
			}
		});
		panel3.add(login);
		panel3.add(new JButton("ע��"));
		//��ɵ��Ĳ�
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
	
		
		
		
		
		
		
		
		//this.pack();
		this.setBounds(500,300,300,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		BorderFlowLayoutDemo demo = new BorderFlowLayoutDemo();
	}
}
