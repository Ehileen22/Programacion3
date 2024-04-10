import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 700, 700);
		iniciarComponentes();
	}

	public void iniciarComponentes()
	{
		this.login();
		//this.registro();
		
	}
	public void login()
	{

		this.setSize(750, 590);
		this.setResizable(false);
		this.setTitle("User Login");
		
		JPanel account= new JPanel();
		account.setSize(this.getWidth(),this.getHeight());
		account.setLocation(0,0);
		account.setBackground(Color.decode("#354E8E"));
		account.setLayout(null);
		
		
	
		JLabel userL=new JLabel();
		userL.setIcon(new ImageIcon(getClass().getResource("userL.png")));
		userL.setBounds(175, 180, 35, 35);
		account.add(userL);
		
		JLabel pswIcon=new JLabel();
		pswIcon.setIcon(new ImageIcon(getClass().getResource("psw.png")));
		pswIcon.setBounds(175, 295, 35, 35);
		account.add(pswIcon);
		
		JLabel loginTitle=new JLabel("Iniciar Sesión",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,30));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(215, -10);
		loginTitle.setOpaque(false);
		account.add(loginTitle);
		
		JLabel myAccount=new JLabel("Mi Cuenta",0);
		myAccount.setSize(300, 80);
		myAccount.setFont(new Font("Georgia Italic",Font.BOLD ,40));
		myAccount.setForeground(new Color(243, 189, 80));
		myAccount.setLocation(215, 55);
		myAccount.setOpaque(false);
		account.add(myAccount);
		
		JLabel userName1 = new JLabel("Nombre de usuario");
		userName1.setBounds(215, 140, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		account.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 180, 300, 35);
		account.add(userResponse);
		
		
		JLabel pwd = new JLabel("Contraseña");
		pwd.setBounds(215, 256, 300, 35);
		pwd.setFont(new Font("Georgia",Font.BOLD ,20));
		pwd.setForeground(Color.WHITE);
		account.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(215, 295, 300, 35);
		account.add(pwdResponse);
		
		JButton access= new JButton("Login");
		access.setBounds(290, 360, 150, 45);
		access.setFont(new Font("Georgia",Font.BOLD ,25));
		access.setBackground(new Color(243, 189, 80 ));
		access.setOpaque(true);
		access.setBorderPainted(true);
		access.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
		account.add(access);
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"No puede ingresar!!!", null, JOptionPane.WARNING_MESSAGE);
					
								
			}
			
			
		});
		
		JLabel cuestion = new JLabel("No tienes una cuenta?");
		cuestion.setBounds(305, 440, 300, 35);
		cuestion.setFont(new Font("Georgia",Font.BOLD ,10));
		cuestion.setForeground(Color.WHITE);
		account.add(cuestion);
		
		JButton signUp= new JButton("Registrarse");
		signUp.setBounds(318, 480, 100, 35);
		signUp.setFont(new Font("Georgia",Font.BOLD ,15));
		signUp.setBackground(new Color(243, 189, 80 ));
		signUp.setOpaque(true);
		signUp.setBorderPainted(true);
		signUp.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		account.add(signUp);
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,60 , 650, 375);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		account.add(color);
		getContentPane().add(account);
	}
	public void registro()
	{
		this.setSize(750, 590);
		this.setResizable(false);
		this.setTitle("Registrarse");
		
		JPanel account= new JPanel();
		account.setSize(this.getWidth(),this.getHeight());
		account.setLocation(0,0);
		account.setBackground(Color.decode("#354E8E"));
		account.setLayout(null);
		
		JLabel loginTitle=new JLabel("Registrarse",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,40));
		loginTitle.setForeground(new Color(243, 189, 80));
		loginTitle.setLocation(202, -2);
		loginTitle.setOpaque(false);
		account.add(loginTitle);
		
		
		JLabel userName1 = new JLabel("Ingresa tu nombre");
		userName1.setBounds(213, 89, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		account.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 126, 300, 35);
		account.add(userResponse);
		
		
		JLabel apellido = new JLabel("Ingresa tu apellido");
		apellido.setBounds(213, 160, 300, 35);
		apellido.setFont(new Font("Georgia",Font.BOLD ,20));
		apellido.setForeground(Color.WHITE);
		account.add(apellido);
		
		JTextField apellidoResponse = new JTextField();
		apellidoResponse.setBounds(213, 194, 300, 35);
		account.add(apellidoResponse);
		JLabel correo = new JLabel("Correo electrónico");
		correo.setBounds(213, 230, 300, 35);
		correo.setFont(new Font("Georgia",Font.BOLD ,20));
		correo.setForeground(Color.WHITE);
		account.add(correo);
		
		JTextField correoResponse = new JTextField();
		correoResponse.setBounds(213, 264, 300, 35);
		account.add(correoResponse);
		
		JLabel pwd = new JLabel("Contraseña");
		pwd.setBounds(213, 302, 300, 35);
		pwd.setFont(new Font("Georgia",Font.BOLD ,20));
		pwd.setForeground(Color.WHITE);
		account.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(213, 334, 300, 35);
		account.add(pwdResponse);
		
		JLabel pwdConf = new JLabel("Confirmar contraseña");
		pwdConf.setBounds(213, 371, 300, 35);
		pwdConf.setFont(new Font("Georgia",Font.BOLD ,20));
		pwdConf.setForeground(Color.WHITE);
		account.add(pwdConf);
		
		JPasswordField pwdConfResponse = new JPasswordField();
		pwdConfResponse.setBounds(213, 404, 300, 35);
		account.add(pwdConfResponse);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al cielo.");
		chckbxNewCheckBox.setFont(new Font("Georgia",Font.BOLD ,9));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(212, 446, 301, 23);
		account.add(chckbxNewCheckBox);
		
		JButton access= new JButton("Registrarse");
		access.setBounds(283, 480, 167, 45);
		access.setFont(new Font("Georgia",Font.BOLD ,25));
		access.setBackground(new Color(243, 189, 80 ));
		access.setOpaque(true);
		access.setBorderPainted(true);
		access.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
		account.add(access);
		access.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passw = new String(pwdResponse.getPassword());
		        String confir = new String(pwdConfResponse.getPassword());
		        String nom=userResponse.getText();
		        String ape=apellidoResponse.getText();
		        String correoE=correoResponse.getText();
				if(passw.equals(confir)&& !passw.equals("") &&!confir.equals(""))
				{
					pwdResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					pwdConfResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));;
				}
				else
				{
					pwdResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					pwdConfResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));;
				}
				
				if(nom.length()<=0)
				{
					userResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					
				}
				else
				{
					userResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
				
				if(ape.length()<=0)
				{
					apellidoResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				else
				{
					apellidoResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
				if(correoE.length()<=0)
				{
					correoResponse.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					
				}
				else
				{
					correoResponse.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
				if(!chckbxNewCheckBox.isSelected())
				{
					chckbxNewCheckBox.setBorderPainted(true);
					chckbxNewCheckBox.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				}
				else
				{
					chckbxNewCheckBox.setBorderPainted(true);
					chckbxNewCheckBox.setBorder(BorderFactory.createLineBorder(Color.green, 2));
				}
			}
		});
		getContentPane().add(account);
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,79 , 650, 461);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		account.add(color);
		
		
		
		
		
	}
}
