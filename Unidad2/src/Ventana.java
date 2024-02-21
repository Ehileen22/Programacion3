import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana extends JFrame{

	public Ventana()
	{
		
		this.setSize(1000, 700);
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
		this.login();
		
		//Registro
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.decode("#F3BAAE" ));
		registro.setLayout(null);
		
		JLabel regiTitle=new JLabel("REGISTRO",0);
		regiTitle.setSize(300, 80);
		regiTitle.setFont(new Font("Courier new",Font.BOLD ,35));
		regiTitle.setForeground(Color.BLACK);
		regiTitle.setLocation(100, 20);
		regiTitle.setOpaque(true);
		regiTitle.setBackground(new Color(252, 45, 0 ));
		registro.add(regiTitle);
		
		JLabel userName = new JLabel("NOMBRE DE USUARIO", 0);
		userName.setBounds(100, 125, 300, 35);
		userName.setFont(new Font("Courier new",Font.BOLD ,25));
		userName.setOpaque(true);
		userName.setBackground(new Color(219, 102, 77));
		registro.add(userName);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(100, 170, 300, 35);
		userResponse.setHorizontalAlignment(0);
		userResponse.setFont(new Font("Courier new",Font.PLAIN ,15));
		registro.add(userResponse);
		
		JLabel bioTag=new JLabel("BIO",0);
		bioTag.setBounds(100, 215, 300, 35);
		bioTag.setFont(new Font("Courier new",Font.BOLD ,20));
		registro.add(bioTag);
		
		JTextArea bioText= new JTextArea();
		bioText.setBounds(100, 245, 300, 50);
		bioText.setFont(new Font("Courier new",Font.BOLD ,15));
		registro.add(bioText);
		
		JLabel prefer = new JLabel("PREFERENCIAS", 0);
		prefer.setBounds(100, 305, 300, 35);
		prefer.setFont(new Font("Courier new",Font.BOLD ,25));
		registro.add(prefer);
		
		JCheckBox itemBox1= new JCheckBox("Dulces");
		itemBox1.setBounds(100, 340, 100, 35);
		itemBox1.setFont(new Font("Courier new",Font.BOLD ,15));
		itemBox1.setHorizontalAlignment(0);
		itemBox1.setOpaque(true);
		itemBox1.setBackground(new Color(252, 141, 118));
		itemBox1.setBorderPainted(true);
		itemBox1.setBorder(BorderFactory.createLineBorder(new Color(91, 19, 3 ), 2));
		registro.add(itemBox1);
		
		JCheckBox itemBox2= new JCheckBox("Salado");
		itemBox2.setBounds(200, 340, 100, 35);
		itemBox2.setFont(new Font("Courier new",Font.BOLD ,15));
		itemBox2.setHorizontalAlignment(0);
		itemBox2.setOpaque(true);
		itemBox2.setBackground(new Color(252, 141, 118));
		itemBox2.setBorderPainted(true);
		itemBox2.setBorder(BorderFactory.createLineBorder(new Color(91, 19, 3 ), 2));
		registro.add(itemBox2);
		
		JCheckBox itemBox3= new JCheckBox("Salado");
		itemBox3.setBounds(300, 340, 100, 35);
		itemBox3.setFont(new Font("Courier new",Font.BOLD ,15));
		itemBox3.setHorizontalAlignment(0);
		itemBox3.setOpaque(true);
		itemBox3.setBackground(new Color(252, 141, 118));
		itemBox3.setBorderPainted(true);
		itemBox3.setBorder(BorderFactory.createLineBorder(new Color(91, 19, 3 ), 2));
		registro.add(itemBox3);
		
		JLabel terms = new JLabel("Terminos", 0);
		terms.setBounds(100, 390, 300, 35);
		terms.setFont(new Font("Courier new",Font.BOLD ,25));
		terms.setOpaque(true);
		terms.setBackground(new Color(211, 125, 106));
		registro.add(terms);
		
		JRadioButton acceptRadio=new JRadioButton ("Acepto los términos");
		acceptRadio.setBounds(89, 430, 150, 35);
		acceptRadio.setFont(new Font("Courier new",Font.BOLD ,10));
		acceptRadio.setOpaque(false);
		registro.add(acceptRadio);
		
		JRadioButton rejectRadio=new JRadioButton ("No acepto los términos");
		rejectRadio.setBounds(260, 430, 180, 35);
		rejectRadio.setFont(new Font("Courier new",Font.BOLD ,10));
		rejectRadio.setOpaque(false);
		registro.add(rejectRadio);
		
		ButtonGroup groupRadio=new ButtonGroup();
		groupRadio.add(acceptRadio);
		groupRadio.add(rejectRadio);
		
		String colonias[]= {"Centro","Camino Real","Pedregal","Conchalito"};
		JComboBox locations= new JComboBox(colonias);
		locations.setFont(new Font("Courier new",Font.BOLD ,15));
		locations.setBounds(100, 470, 300, 35);
		registro.add(locations);
		
		

		JButton crear= new JButton("Crear cuenta");
		crear.setBounds(150, 525, 200, 50);
		crear.setFont(new Font("Courier new",Font.BOLD ,25));
		crear.setBackground(new Color(252, 141, 118));
		crear.setOpaque(true);
		crear.setBorderPainted(true);
		crear.setBorder(BorderFactory.createLineBorder(new Color(211,19,6), 2));
		registro.add( crear);
		this.add(registro);
	
		
	}
	public void login() {
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
		
		
		
		this.add(login);
	
		
	}

}
