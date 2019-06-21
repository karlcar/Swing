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
	 * 默认布局是BorderLayout,
	 * 1、再建3个面板布局管理器是flowLayout 
	 * 2、把第一个面板放在北部 
	 * 3、把第二个面板放在中部 
	 * 4、把第三个面板放在南部
	 */
	public BorderFlowLayoutDemo() throws HeadlessException {
		this.setTitle("登录页面");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.setLayout(new FlowLayout());
		//设置布局管理器
		panel1.add(new JLabel("用户名"));
		JTextField username = new JTextField(20);
		panel1.add(username);
		//完成第二步
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(new JLabel("密    码"));
		JPasswordField password = new JPasswordField(20);
		panel2.add(password);
		//完成第三步  
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton login = new JButton("登录");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//获取两个输入框的值
				String myUsername = username.getText();
				String myPassword = password.getText();
				System.out.println(myUsername + "," + myPassword);
				if(myUsername.equalsIgnoreCase("karl") && myPassword.equalsIgnoreCase("1234")) {
					System.out.println("登录成功" + myUsername + "," + myPassword);
				}else {
					System.out.println("账号密码错误!");
				}
				
			}
		});
		panel3.add(login);
		panel3.add(new JButton("注册"));
		//完成第四步
		
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
