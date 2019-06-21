package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JTextField Jtitle;
	public Calculator() throws HeadlessException {
		this.setTitle("������");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		//1,����һ��JTextField���ڱ���
		//2����һ��JPanel������borderlayout��center
		Jtitle = new JTextField();
		this.add(Jtitle,BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		String[] buttons = {"7","8","9","-","4","5","6","+","1","2","3","X","%","0",".","="};
		for(String str:buttons) {
			JButton button = new JButton(str);
			//����һ���¼���������ֵ�ʱ����ӵ������
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//JButton bu = (JButton)e.getSource(); //�����Դͷ
 					if(button.getText().equals("=")) {
 						if(Jtitle.getText().contains("-")) {
 							String[] strArray = Jtitle.getText().split("-");
 							Integer a = Integer.parseInt(strArray[0]); 
 							Integer b = Integer.parseInt(strArray[1]);
 							Integer result = a - b;
 							Jtitle.setText(String.valueOf(result));
 						}else if(Jtitle.getText().contains("+")){
 							String[] strArray = Jtitle.getText().split("\\+");
 							Integer a = Integer.parseInt(strArray[0]); 
 							Integer b = Integer.parseInt(strArray[1]);
 							Integer result = a + b;
 							Jtitle.setText(String.valueOf(result));
 						}
						
					}
 					else {
						String text = button.getText();
						Jtitle.setText(Jtitle.getText() + text);
					}
					 
				}
			});
			panel.add(button);
		}
		this.add(panel,BorderLayout.CENTER);
		this.setVisible(true);
		this.pack();
		//this.setBounds(500,300,300,300);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}
}
