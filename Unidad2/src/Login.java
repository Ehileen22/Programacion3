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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame1 = new Login();
					frame1.setVisible(true);
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
		iniciarComponentes();
	}

	public void iniciarComponentes()
	{
		frame=new JFrame();
		frame.setBounds(120, 50,750, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Cuenta
		JMenu mnNewMenu = new JMenu("Cuenta");
		mnNewMenu.setBackground(new Color(255, 255, 255));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.removeAll();			
				getContentPane().removeAll();
				login(frame);
				frame.repaint();
				frame.revalidate();
					
								
			}
			
			
		});
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.removeAll();			
				getContentPane().removeAll();
				registro(frame);
				frame.repaint();
				frame.revalidate();
					
								
			}
			
			
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Recuperación de cuenta");
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					frame.removeAll();			
					getContentPane().removeAll();
					recuperarCuenta(frame);
					frame.repaint();
					frame.revalidate();
					
			}
			
		});
			
		////////
		
		JMenu mnNewMenu_1 = new JMenu("Usuarios");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Baja");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("¿Cómo crear un usuario?");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("¿Cómo acceder al sistema?");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		this.login(frame);
		
		
	}
	private void login(JFrame frame)
	{

		//frame.revalidate();
		//frame.repaint();
		this.setSize(750, 650);
		this.setResizable(false);
		this.setTitle("User Login");
		
		JPanel account= new JPanel();
		account.setSize(this.getWidth(),this.getHeight());
		account.setLocation(0,0);
		account.setBackground(Color.decode("#354E8E"));
		account.setLayout(null);
		
		
	
		JLabel userL=new JLabel();
		userL.setIcon(new ImageIcon(getClass().getResource("userL.png")));
		userL.setBounds(175, 212, 35, 35);
		account.add(userL);
		
		JLabel pswIcon=new JLabel();
		pswIcon.setIcon(new ImageIcon(getClass().getResource("psw.png")));
		pswIcon.setBounds(179, 321, 35, 35);
		account.add(pswIcon);
		
		JLabel loginTitle=new JLabel("Iniciar sesión",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,30));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(215, 0);
		loginTitle.setOpaque(false);
		account.add(loginTitle);
		
		JLabel myAccount=new JLabel("Mi cuenta",0);
		myAccount.setSize(300, 80);
		myAccount.setFont(new Font("Georgia Italic",Font.BOLD ,40));
		myAccount.setForeground(new Color(243, 189, 80));
		myAccount.setLocation(215, 70);
		myAccount.setOpaque(false);
		account.add(myAccount);
		
		JLabel userName1 = new JLabel("Nombre de usuario");
		userName1.setBounds(215, 161, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		account.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 212, 300, 35);
		account.add(userResponse);
		
		
		JLabel pwd = new JLabel("Contraseña");
		pwd.setBounds(220, 275, 300, 35);
		pwd.setFont(new Font("Georgia",Font.BOLD ,20));
		pwd.setForeground(Color.WHITE);
		account.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(220, 321, 300, 35);
		account.add(pwdResponse);
		
		JButton access= new JButton("Iniciar sesión");
		access.setBounds(261, 394, 210, 45);
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
		
		JLabel cuestion = new JLabel("¿No tienes una cuenta?");
		cuestion.setBounds(300, 493, 134, 35);
		cuestion.setFont(new Font("Georgia",Font.BOLD ,10));
		cuestion.setForeground(Color.WHITE);
		account.add(cuestion);
		
		JButton signUp= new JButton("Registrarse");
		signUp.setBounds(297, 526, 137, 35);
		signUp.setFont(new Font("Georgia",Font.BOLD ,15));
		signUp.setBackground(new Color(243, 189, 80 ));
		signUp.setOpaque(true);
		signUp.setBorderPainted(true);
		signUp.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		account.add(signUp);
		signUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					frame.removeAll();	
					frame.remove(account);
					
					getContentPane().removeAll();
					registro(frame);
					
					frame.repaint();
					frame.revalidate();
					
			}
			
			
		});
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,76 , 650, 395);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		account.add(color);
		getContentPane().add(account);
		
		
		frame.repaint();
		frame.revalidate();
	}
	private void registro(JFrame frame)
	{
		//frame.revalidate();
		//frame.repaint();
		this.setSize(750, 650);
		this.setResizable(true);
		this.setTitle("Registrarse");
		
		JPanel account2= new JPanel();
		account2.setSize(this.getWidth(),this.getHeight());
		account2.setLocation(0,0);
		account2.setBackground(Color.decode("#354E8E"));
		account2.setLayout(null);
		
		JLabel loginTitle=new JLabel("Registrarse",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,40));
		loginTitle.setForeground(new Color(243, 189, 80));
		loginTitle.setLocation(202, -2);
		loginTitle.setOpaque(false);
		account2.add(loginTitle);
		
		
		JLabel userName1 = new JLabel("Ingresa tu nombre");
		userName1.setBounds(213, 89, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		account2.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 126, 300, 35);
		account2.add(userResponse);
		
		
		JLabel apellido = new JLabel("Ingresa tu apellido");
		apellido.setBounds(213, 160, 300, 35);
		apellido.setFont(new Font("Georgia",Font.BOLD ,20));
		apellido.setForeground(Color.WHITE);
		account2.add(apellido);
		
		JTextField apellidoResponse = new JTextField();
		apellidoResponse.setBounds(213, 194, 300, 35);
		account2.add(apellidoResponse);
		JLabel correo = new JLabel("Correo electrónico");
		correo.setBounds(213, 230, 300, 35);
		correo.setFont(new Font("Georgia",Font.BOLD ,20));
		correo.setForeground(Color.WHITE);
		account2.add(correo);
		
		JTextField correoResponse = new JTextField();
		correoResponse.setBounds(213, 264, 300, 35);
		account2.add(correoResponse);
		
		JLabel pwd = new JLabel("Contraseña");
		pwd.setBounds(213, 302, 300, 35);
		pwd.setFont(new Font("Georgia",Font.BOLD ,20));
		pwd.setForeground(Color.WHITE);
		account2.add(pwd);
		
		JPasswordField pwdResponse = new JPasswordField();
		pwdResponse.setBounds(213, 334, 300, 35);
		account2.add(pwdResponse);
		
		JLabel pwdConf = new JLabel("Confirmar contraseña");
		pwdConf.setBounds(213, 371, 300, 35);
		pwdConf.setFont(new Font("Georgia",Font.BOLD ,20));
		pwdConf.setForeground(Color.WHITE);
		account2.add(pwdConf);
		
		JPasswordField pwdConfResponse = new JPasswordField();
		pwdConfResponse.setBounds(213, 404, 300, 35);
		account2.add(pwdConfResponse);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al cielo.");
		chckbxNewCheckBox.setFont(new Font("Georgia",Font.BOLD ,9));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(212, 446, 301, 23);
		account2.add(chckbxNewCheckBox);
		
		JButton access= new JButton("Registrarse");
		access.setBounds(283, 480, 167, 45);
		access.setFont(new Font("Georgia",Font.BOLD ,25));
		access.setBackground(new Color(243, 189, 80 ));
		access.setOpaque(true);
		access.setBorderPainted(true);
		access.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
		account2.add(access);
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
		getContentPane().add(account2);
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,79 , 650, 461);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		account2.add(color);
		
		JButton btnNewButton = new JButton("¿Ya tienes una cuenta?");
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBounds(283, 547, 167, 23);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.decode("#354E8E"));
		account2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					frame.remove(account2);			
					getContentPane().removeAll();
					login(frame);
					frame.repaint();
					frame.revalidate();
					
			}
			
			
		});
		
		
		
		frame.repaint();
		frame.revalidate();
		
	}
	
	private void recuperarCuenta(JFrame frame)
	{
		
		this.setSize(750, 650);
		this.setResizable(true);
		this.setTitle("Recuperación de  cuenta");
		
		JPanel recuperar= new JPanel();
		recuperar.setSize(this.getWidth(),this.getHeight());
		recuperar.setLocation(0,0);
		recuperar.setBackground(Color.decode("#354E8E"));
		recuperar.setLayout(null);
		
		JLabel loginTitle=new JLabel("Recuperación de cuenta",0);
		loginTitle.setSize(569, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,40));
		loginTitle.setForeground(new Color(243, 189, 80));
		loginTitle.setLocation(74, 11);
		loginTitle.setOpaque(false);
		recuperar.add(loginTitle);
		
		JLabel color = new JLabel();
		color.setBackground(new Color(48, 67, 117));
		color.setBounds(40,102 , 650, 438);
		color.setOpaque(true);
		color.setFont(new Font("Georgia",Font.BOLD ,25));
		recuperar.add(color);
		
		getContentPane().add(recuperar);
		
		frame.repaint();
		frame.revalidate();
	}
}
