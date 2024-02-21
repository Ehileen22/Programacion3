import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana()
	{
		
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.iniciarComponentes();
		this.setVisible(true);
		
		
	}
	public void iniciarComponentes()
	{
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.GRAY);
		login.setLayout(null);
		
		JLabel loginTitle=new JLabel("ACCEDER",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Courier new",Font.BOLD ,35));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(100, 20);
		loginTitle.setOpaque(true);
		loginTitle.setBackground(new Color(211,19,6));
		login.add(loginTitle);
		
		JLabel userName = new JLabel("NOMBRE DE USUARIO");
		userName.setBounds(100, 125, 300, 35);
		userName.setFont(new Font("Courier new",Font.BOLD ,25));
		login.add(userName);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(100, 170, 300, 35);
		login.add(userResponse);
		
		
		JLabel pwd = new JLabel("CONTRASEÑA");
		pwd.setBounds(100, 220, 300, 35);
		pwd.setFont(new Font("Courier new",Font.BOLD ,25));
		login.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(100, 265, 300, 35);
		login.add(pwdResponse);
		
		JCheckBox remember= new JCheckBox("Recordarme");
		remember.setBounds(100, 310, 120, 20);
		remember.setOpaque(false);
		login.add(remember);
		
	
		JLabel forgot = new JLabel("¿Olvidó su contraseña?");
		forgot.setBounds(265, 310, 180, 20);
		login.add(forgot);
		
		JButton access= new JButton("ACCEDER");
		access.setBounds(150, 365, 200, 50);
		access.setFont(new Font("Courier new",Font.BOLD ,25));
		access.setBackground(new Color(252, 141, 118));
		access.setOpaque(true);
		access.setBorderPainted(true);
		access.setBorder(BorderFactory.createLineBorder(new Color(211,19,6), 2));
		login.add(access);
		
		
		//size
		//Location
		//background-opaque
		//String en su constructor
		
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500, 0);
		
		registro.setBackground(Color.LIGHT_GRAY);
		
		this.add(login);
		this.add(registro);
	
		
	}

}
