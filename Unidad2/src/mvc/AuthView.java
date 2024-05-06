package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.fasterxml.jackson.databind.JsonNode;

public class AuthView {
	JPanel panel;
	AuthModel modelo;
	public AuthView()
	{
		panel=new JPanel();
		modelo=new AuthModel();
	}
	public JPanel login()
	{
		//Diseño del login
//		JLabel userL=new JLabel();
//		userL.setIcon(new ImageIcon(getClass().getResource("userL.png")));
//		userL.setBounds(175, 212, 35, 35);
//		panel.add(userL);
//		
//		JLabel pswIcon=new JLabel();
//		pswIcon.setIcon(new ImageIcon(getClass().getResource("psw.png")));
//		pswIcon.setBounds(179, 321, 35, 35);
//		panel.add(pswIcon);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#354E8E"));
		JLabel loginTitle=new JLabel("Iniciar sesión",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,30));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(215, 0);
		loginTitle.setOpaque(false);
		panel.add(loginTitle);
		
		JLabel myAccount=new JLabel("Mi cuenta",0);
		myAccount.setSize(300, 80);
		myAccount.setFont(new Font("Georgia Italic",Font.BOLD ,40));
		myAccount.setForeground(new Color(243, 189, 80));
		myAccount.setLocation(215, 70);
		myAccount.setOpaque(false);
		panel.add(myAccount);
		
		JLabel userName1 = new JLabel("Nombre de usuario");
		userName1.setBounds(215, 161, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		panel.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 212, 300, 35);
		panel.add(userResponse);
		
		
		JLabel pwd = new JLabel("Contraseña");
		pwd.setBounds(220, 275, 300, 35);
		pwd.setFont(new Font("Georgia",Font.BOLD ,20));
		pwd.setForeground(Color.WHITE);
		panel.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(220, 321, 300, 35);
		panel.add(pwdResponse);
		
		JButton access= new JButton("Iniciar sesión");
		access.setBounds(261, 394, 210, 45);
		access.setFont(new Font("Georgia",Font.BOLD ,25));
		access.setBackground(new Color(243, 189, 80 ));
		access.setOpaque(true);
		access.setBorderPainted(true);
		access.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
		panel.add(access);
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println(userResponse.getText());
				String passw = new String(pwdResponse.getPassword());
				//System.out.println(pwdResponse.getText());
				if(modelo.login(userResponse.getText(),passw))
				{
					pwdResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					userResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					JOptionPane.showMessageDialog(null,"Bienvenido", null, JOptionPane.WARNING_MESSAGE);
					
				}
				else	
				{
					pwdResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					userResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					JOptionPane.showMessageDialog(null,"Su usuario y/o contraseña están incorrectos, ingrese sus datos nuevamente", null, JOptionPane.WARNING_MESSAGE);
				}
			}
			
			
		});
		
		JLabel cuestion = new JLabel("¿No tienes una cuenta?");
		cuestion.setBounds(300, 493, 134, 35);
		cuestion.setFont(new Font("Georgia",Font.BOLD ,10));
		cuestion.setForeground(Color.WHITE);
		panel.add(cuestion);
		
		JButton signUp= new JButton("Registrarse");
		signUp.setBounds(297, 526, 137, 35);
		signUp.setFont(new Font("Georgia",Font.BOLD ,15));
		signUp.setBackground(new Color(243, 189, 80 ));
		signUp.setOpaque(true);
		signUp.setBorderPainted(true);
		signUp.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		panel.add(signUp);
		signUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
					
			}
			
			
		});
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,76 , 650, 395);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		panel.add(color);
		return panel;
	}
	
	public JPanel registro()
	{
		//Diseño del registro
		panel.setBackground(Color.pink);
		return panel;
	}
}
