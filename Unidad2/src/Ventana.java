import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
		//this.login();
		//this.registro();
		//this.admin();
		//this.calculadora();
		//this.account();
		//this.calcu2();	
		//this.interes();
		//this.paint(getGraphics());
		this.repaint();
		this.validate();
			
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
		
		
		JLabel logo=new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("sun.png")));
		logo.setBounds(100, 50, 256, 256);
		login.add(logo);
		
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
	
	public void registro()
	{
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

	public void admin()
	{
		//panel
		JPanel adminPanel= new JPanel();
		adminPanel.setSize(this.getWidth(),this.getHeight());
		adminPanel.setLocation(0,0);
		adminPanel.setBackground(Color.decode("#A8F5BB"));
		adminPanel.setLayout(null);
		
		//menu
		JMenuBar barra= new JMenuBar();
		JMenu menuFile= new JMenu("Archivo");
		JMenuItem openItem= new JMenuItem("Abrir archivo...");
		JMenuItem createItem= new JMenuItem("Crear archivo...");
		
		this.setJMenuBar(barra);
		barra.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(createItem);
		
		//contenido del panel
		
		JLabel usersTag=new JLabel("USUARIOS",0);
		usersTag.setSize(300, 80);
		usersTag.setFont(new Font("Courier new",Font.BOLD ,35));
		usersTag.setForeground(Color.WHITE);
		usersTag.setLocation(350, 20);
		usersTag.setOpaque(true);
		usersTag.setBackground(new Color(15, 159, 57));
		adminPanel.add(usersTag);
		
		
		JLabel titleWidget=new JLabel("Total de usuarios",0);
		titleWidget.setBounds(40, 120,300,40);
		titleWidget.setFont(new Font("Courier new",Font.BOLD ,20));
		titleWidget.setForeground(Color.BLACK);
		titleWidget.setOpaque(false);
		adminPanel.add(titleWidget);
		
		JLabel contentWidget=new JLabel("100",0);
		contentWidget.setBounds(40, 150,300,40);
		contentWidget.setFont(new Font("Courier new",Font.BOLD ,25));
		contentWidget.setForeground(Color.BLACK);
		contentWidget.setOpaque(false);
		adminPanel.add(contentWidget);
		
		
		JLabel widget=new JLabel("");
		widget.setBounds(40, 120,300,80);
		widget.setOpaque(true);
		widget.setBackground(new Color(63, 233, 112));
		adminPanel.add(widget);
		
		//Botones
		JButton donwload= new JButton("Exportar");
		donwload.setBounds(750, 225,100,40);
		donwload.setFont(new Font("Courier new",Font.BOLD ,15));
		donwload.setBackground(new Color(220, 245, 168));
		donwload.setOpaque(true);
		donwload.setBorderPainted(true);
		donwload.setBorder(BorderFactory.createLineBorder(new Color(15, 159, 57), 2));
		adminPanel.add(donwload);
		
		JButton addUser= new JButton("Añadir");
		addUser.setBounds(860, 225,100,40);
		addUser.setFont(new Font("Courier new",Font.BOLD ,15));
		addUser.setBackground(new Color(220, 245, 168));
		addUser.setOpaque(true);
		addUser.setBorderPainted(true);
		addUser.setBorder(BorderFactory.createLineBorder(new Color(15, 159, 57), 2));
		adminPanel.add(addUser);
		
		
		//tabla
		String tableTitle[]={"No.Control", "Nombre", "Apellidos", "Semestre"};
		String tableData[][]={
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"},
							{"No.Control", "Nombre", "Apellidos", "Semestre"}};                           
		                               
		                 
		JTable usersTable= new JTable(tableData, tableTitle);
		JScrollPane tableScroll=new JScrollPane(usersTable);
		tableScroll.setBounds(40, 280,920 , 300);
		adminPanel.add(tableScroll);
		
		
		this.add(adminPanel);
	}
	
	public void calculadora()
	{
		//panel
		this.setSize(504, 580);
		this.setResizable(false);
		this.setTitle("Calculadora");
		
		JPanel calculadora= new JPanel();
		calculadora.setSize(this.getWidth(),this.getHeight());
		calculadora.setLocation(0,0);
		calculadora.setBackground(Color.BLACK);
		calculadora.setLayout(null);
		
		JLabel resultado=new JLabel("180.0", 0);
		resultado.setBounds(12,10,464, 60);
		resultado.setFont(new Font("Courier new",Font.BOLD ,17));
		resultado.setForeground(Color.BLACK);
		resultado.setOpaque(true);
		resultado.setBackground(Color.WHITE);
		calculadora.add(resultado);
		
		JButton ce= new JButton("CE");
		ce.setBounds(12,80 ,110,80);
		ce.setFont(new Font("Courier new",Font.BOLD ,17));
		ce.setForeground(Color.WHITE);
		ce.setBackground(new Color(80, 80, 80));
		ce.setOpaque(true);
		ce.setBorderPainted(true);
		ce.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(ce);
		
		JButton b1= new JButton();
		b1.setBounds(130,80 ,110,80);
		b1.setBackground(new Color(80, 80, 80 ));
		b1.setOpaque(true);
		b1.setBorderPainted(true);
		b1.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(b1);
		
		JButton b2= new JButton();
		b2.setBounds(248,80 ,110,80);
		b2.setBackground(new Color(80, 80, 80 ));
		b2.setOpaque(true);
		b2.setBorderPainted(true);
		b2.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(b2);
		
		JButton b3= new JButton();
		b3.setBounds(366,80 ,110,80);
		b3.setBackground(new Color(80, 80, 80 ));
		b3.setOpaque(true);
		b3.setBorderPainted(true);
		b3.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(b3);
		
		JButton button7= new JButton("7");
		button7.setBounds(12,170 ,110,80);
		button7.setFont(new Font("Courier new",Font.BOLD ,17));
		button7.setForeground(Color.WHITE);
		button7.setBackground(new Color(80, 80, 80));
		button7.setOpaque(true);
		button7.setBorderPainted(true);
		button7.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button7);
		
		JButton button8= new JButton("8");
		button8.setBounds(130,170 ,110,80);
		button8.setFont(new Font("Courier new",Font.BOLD ,17));
		button8.setForeground(Color.WHITE);
		button8.setBackground(new Color(80, 80, 80 ));
		button8.setOpaque(true);
		button8.setBorderPainted(true);
		button8.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button8);
		
		JButton button9= new JButton("9");
		button9.setBounds(248,170 ,110,80);
		button9.setBackground(new Color(80, 80, 80 ));
		button9.setFont(new Font("Courier new",Font.BOLD ,17));
		button9.setForeground(Color.WHITE);
		button9.setOpaque(true);
		button9.setBorderPainted(true);
		button9.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button9);
		
		JButton slash= new JButton("/");
		slash.setBounds(366,170 ,110,80);
		slash.setBackground(new Color(80, 80, 80 ));
		slash.setFont(new Font("Courier new",Font.BOLD ,17));
		slash.setForeground(Color.WHITE);
		slash.setOpaque(true);
		slash.setBorderPainted(true);
		slash.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(slash);
		
		JButton button4= new JButton("4");
		button4.setBounds(12,260 ,110,80);
		button4.setFont(new Font("Courier new",Font.BOLD ,17));
		button4.setForeground(Color.WHITE);
		button4.setBackground(new Color(80, 80, 80));
		button4.setOpaque(true);
		button4.setBorderPainted(true);
		button4.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button4);
		
		JButton button5= new JButton("5");
		button5.setBounds(130,260 ,110,80);
		button5.setFont(new Font("Courier new",Font.BOLD ,17));
		button5.setForeground(Color.WHITE);
		button5.setBackground(new Color(80, 80, 80 ));
		button5.setOpaque(true);
		button5.setBorderPainted(true);
		button5.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button5);
		
		JButton button6= new JButton("6");
		button6.setBounds(248,260 ,110,80);
		button6.setBackground(new Color(80, 80, 80 ));
		button6.setFont(new Font("Courier new",Font.BOLD ,17));
		button6.setForeground(Color.WHITE);
		button6.setOpaque(true);
		button6.setBorderPainted(true);
		button6.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button6);
		
		JButton asterisk= new JButton("*");
		asterisk.setBounds(366,260 ,110,80);
		asterisk.setBackground(new Color(80, 80, 80 ));
		asterisk.setFont(new Font("Courier new",Font.BOLD ,17));
		asterisk.setForeground(Color.WHITE);
		asterisk.setOpaque(true);
		asterisk.setBorderPainted(true);
		asterisk.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(asterisk);
		
		JButton button1= new JButton("1");
		button1.setBounds(12,350 ,110,80);
		button1.setFont(new Font("Courier new",Font.BOLD ,17));
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(80, 80, 80));
		button1.setOpaque(true);
		button1.setBorderPainted(true);
		button1.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button1);
		
		JButton button2= new JButton("2");
		button2.setBounds(130,350 ,110,80);
		button2.setFont(new Font("Courier new",Font.BOLD ,17));
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(80, 80, 80 ));
		button2.setOpaque(true);
		button2.setBorderPainted(true);
		button2.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button2);
		
		JButton button3= new JButton("3");
		button3.setBounds(248,350 ,110,80);
		button3.setBackground(new Color(80, 80, 80 ));
		button3.setFont(new Font("Courier new",Font.BOLD ,17));
		button3.setForeground(Color.WHITE);
		button3.setOpaque(true);
		button3.setBorderPainted(true);
		button3.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button3);
		
		JButton hyphen= new JButton("-");
		hyphen.setBounds(366,350 ,110,80);
		hyphen.setBackground(new Color(80, 80, 80 ));
		hyphen.setFont(new Font("Courier new",Font.BOLD ,17));
		hyphen.setForeground(Color.WHITE);
		hyphen.setOpaque(true);
		hyphen.setBorderPainted(true);
		hyphen.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(hyphen);
		
		JButton button0= new JButton("0");
		button0.setBounds(12,440 ,110,80);
		button0.setFont(new Font("Courier new",Font.BOLD ,17));
		button0.setForeground(Color.WHITE);
		button0.setBackground(new Color(80, 80, 80));
		button0.setOpaque(true);
		button0.setBorderPainted(true);
		button0.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(button0);
		
		JButton dot= new JButton(".");
		dot.setBounds(130,440 ,110,80);
		dot.setFont(new Font("Courier new",Font.BOLD ,17));
		dot.setForeground(Color.WHITE);
		dot.setBackground(new Color(80, 80, 80 ));
		dot.setOpaque(true);
		dot.setBorderPainted(true);
		dot.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(dot);
		
		JButton equals= new JButton("=");
		equals.setBounds(248,440 ,110,80);
		equals.setBackground(new Color(80, 80, 80 ));
		equals.setFont(new Font("Courier new",Font.BOLD ,17));
		equals.setForeground(Color.WHITE);
		equals.setOpaque(true);
		equals.setBorderPainted(true);
		equals.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(equals);
		
		JButton plus= new JButton("+");
		plus.setBounds(366,440 ,110,80);
		plus.setBackground(new Color(80, 80, 80 ));
		plus.setFont(new Font("Courier new",Font.BOLD ,17));
		plus.setForeground(Color.WHITE);
		plus.setOpaque(true);
		plus.setBorderPainted(true);
		plus.setBorder(BorderFactory.createLineBorder(new Color(4, 113, 116), 2));
		calculadora.add(plus);

		
		
		this.add(calculadora);

	}
	
	public void account(){
		this.setSize(750, 570);
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
		
		JLabel loginTitle=new JLabel("User Login",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Georgia",Font.BOLD ,30));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(215, -10);
		loginTitle.setOpaque(false);
		account.add(loginTitle);
		
		JLabel myAccount=new JLabel("My Account",0);
		myAccount.setSize(300, 80);
		myAccount.setFont(new Font("Georgia Italic",Font.BOLD ,40));
		myAccount.setForeground(new Color(243, 189, 80));
		myAccount.setLocation(215, 55);
		myAccount.setOpaque(false);
		account.add(myAccount);
		
		JLabel userName1 = new JLabel("Enter Your Username");
		userName1.setBounds(215, 140, 300, 35);
		userName1.setFont(new Font("Georgia",Font.BOLD ,20));
		userName1.setForeground(Color.WHITE);
		account.add(userName1);
		
		JTextField userResponse = new JTextField();
		userResponse.setBounds(215, 180, 300, 35);
		account.add(userResponse);
		
		
		JLabel pwd = new JLabel("Enter Your Password");
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
		
		JLabel cuestion = new JLabel("Don't have an account?");
		cuestion.setBounds(305, 440, 300, 35);
		cuestion.setFont(new Font("Georgia",Font.BOLD ,10));
		cuestion.setForeground(Color.WHITE);
		account.add(cuestion);
		
		JButton signUp= new JButton("Sign Up");
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
		this.add(account);
		
	}
	
	public void calcu2()
	{
		this.setSize(500, 650);
		
		JPanel panel= new JPanel();
		panel.setSize(482,620);
		panel.setBackground(new Color(240, 159, 159 ));
		panel.setLayout(new BorderLayout());
		
		JLabel text= new JLabel("100.00", 4);
		text.setOpaque(true);
		text.setBackground(Color.WHITE);
		text.setFont(new Font("Marker felt",Font.BOLD ,30));
		panel.add(text, BorderLayout.NORTH);
		
		JPanel centro= new JPanel();
		centro.setBackground(new Color(255, 129, 129));
		centro.setLayout(new GridLayout(4,3,3,3));
		panel.add(centro,BorderLayout.CENTER);
		
		String btns[]= {"7","8","9","6","5","4","3","2","1","0",".","/"};
		for(int i=0; i<12; i++)
		{
			JButton boton= new JButton(btns[i]);
			boton.setBackground(Color.white);
			centro.add(boton);
		}
		
		JPanel east= new JPanel();
		east.setBackground(new Color(249, 62, 62));
		east.setLayout(new GridLayout(3,1,3,3));
		panel.add(east,BorderLayout.EAST);
		
		String btns2[]= {"+","-","="};
		for(int i=0; i<3; i++)
		{
			JButton boton2= new JButton(btns2[i]);
			boton2.setBackground(Color.white);
			east.add(boton2);
		}
		
		JPanel west= new JPanel();
		west.setBackground(Color.RED);
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);
		
		String btns3[]= {"MC","M+","  *  "};
		for(int i=0; i<3; i++)
		{
			JButton boton3= new JButton(btns3[i]);
			
			boton3.setBackground(Color.white);
			west.add(boton3);
		}
		this.add(panel);
	}

	public void interes(){
		this.setSize(530, 600);
		this.setResizable(false);
		this.setTitle("Calculando el interés");
		
		JPanel interes= new JPanel();
		interes.setSize(500,550);
		interes.setBackground(Color.white);
		interes.setLayout(new BorderLayout());
		
		
		JLabel title=new JLabel("    Interés",2);
		title.setFont(new Font("Georgia",Font.BOLD ,30));
		title.setForeground(Color.red);
		title.setOpaque(false);
		interes.add(title, BorderLayout.NORTH);
		
		
		JLabel verde=new JLabel();
		verde.setPreferredSize(new Dimension(200,200));
		verde.setBackground(new Color(164, 245, 149));
		verde.setOpaque(true);
		verde.setBorder(BorderFactory.createLineBorder(Color.WHITE,20));
		interes.add(verde, BorderLayout.CENTER);
		
		

		//1
		JLabel text= new JLabel("Calcular Interés", 2);
		text.setBounds(23, 23, 170, 35);
		text.setOpaque(false);
		text.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(text);

		
		//2
		JLabel capital= new JLabel("Capital:",0);
		capital.setBounds(10, 80, 150, 35);
		capital.setOpaque(false);
		capital.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(capital);
		//3
		JTextField capitalText= new JTextField("1500");	
		capitalText.setBounds(155, 80, 295, 35);
		capitalText.setOpaque(true);
		capitalText.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(capitalText);
		//4
		JLabel tiempo= new JLabel("  Tiempo: ",0);	
		tiempo.setBounds(10, 145, 150, 35);
		tiempo.setOpaque(false);
		tiempo.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(tiempo);
		//5
		JTextField tiempoText= new JTextField("2  ");
		tiempoText.setBounds(155, 150, 295, 35);
		tiempoText.setOpaque(true);
		tiempoText.setBackground(Color.WHITE);
		tiempoText.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(tiempoText);
		//6
		JLabel tasaInteres= new JLabel("Tasa Interés: ",0);
		tasaInteres.setBounds(-45, 220, 300, 35);
		tasaInteres.setOpaque(false);
		tasaInteres.setFont(new Font("Marker felt",Font.BOLD ,14));
		verde.add(tasaInteres);
		//7
		JTextField tasaText= new JTextField("0.1");	
		tasaText.setBounds(155, 220, 295, 35);
		tasaText.setOpaque(true);
		tasaText.setBackground(Color.WHITE);
		tasaText.setFont(new Font("Marker felt",Font.BOLD ,15));
		verde.add(tasaText);
		
		
		
		//8
		JButton calcular= new JButton("   Calcular");
		calcular.setFont(new Font("Georgia",Font.PLAIN ,15));
		calcular.setBounds(100, 290, 120, 35);
		calcular.setForeground(Color.white);
		calcular.setBackground(Color.black);
		calcular.setOpaque(true);
		calcular.setBorderPainted(true);
		calcular.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		verde.add(calcular);
		//9
		JButton cancelar= new JButton("   Cancelar");
		cancelar.setFont(new Font("Georgia",Font.PLAIN ,15));
		cancelar.setBounds(280, 290, 120, 35);
		cancelar.setForeground(Color.white);
		cancelar.setBackground(Color.black);
		cancelar.setOpaque(true);
		cancelar.setBorderPainted(true);
		cancelar.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		verde.add(cancelar);
		
		JLabel guar=new JLabel();
		guar.setIcon(new ImageIcon(getClass().getResource("guardar.png")));
		guar.setBounds(175, 180, 30, 30);
		calcular.add(guar);
		
		JLabel cancel=new JLabel();
		cancel.setIcon(new ImageIcon(getClass().getResource("cancel.png")));
		cancel.setBounds(175, 295, 30, 30);
		cancelar.add(cancel);
		
		JLabel rosa=new JLabel();
		rosa.setPreferredSize(new Dimension(150,150));
		rosa.setBackground(new Color(245, 162, 149));
		rosa.setOpaque(true);
		rosa.setBorder(BorderFactory.createLineBorder(Color.WHITE,20));
		interes.add(rosa, BorderLayout.SOUTH);
		

		JLabel inte= new JLabel("Interés:",0);		
		inte.setBounds(10, 35, 150, 35);
		inte.setOpaque(false);
		inte.setFont(new Font("Marker felt",Font.BOLD ,15));
		rosa.add(inte);
		//14
		JTextField inteText= new JTextField("138.2930000");	
		inteText.setBounds(145, 35, 300, 35);
		inteText.setOpaque(true);
		inteText.setFont(new Font("Marker felt",Font.BOLD ,15));
		rosa.add(inteText);
		//15
		JLabel monto= new JLabel("Monto: ",0);
		monto.setBounds(10,80, 150, 35);
		monto.setOpaque(false);
		monto.setBackground(new Color(245, 162, 149));
		monto.setFont(new Font("Marker felt",Font.BOLD ,15));
		rosa.add(monto);
		//16
		JTextField montoText= new JTextField("1284.2930000");
		montoText.setBounds(145, 80, 300, 35);
		montoText.setOpaque(true);
		montoText.setFont(new Font("Marker felt",Font.BOLD ,15));
		rosa.add(montoText);
	
		

		
		this.add(interes);

	}
	
	public void paint(Graphics create)
	{
		
		this.setSize(935, 700);
		Graphics2D g2d= (Graphics2D)create;
		
		g2d.setColor(new Color(45, 132, 225  ));
		g2d.fillRect(0,0,this.getWidth(),this.getHeight());
		
		//nubes del fondo
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(255,470,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(250,465,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(155,523,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(150,518,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(255,575,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(250,570,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(645,263,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(640,258,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(785,458,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(790,455,215,45,90,90);
		//Cosos del fondo
		//1
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(19,205,190,570,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(15,210,175,560,200,200);
		
		//2
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(369,205,190,470,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(365,210,175,460,200,200);
		//3
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(565,85,190,570,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(559,90,175,560,200,200);
		
		//Coso de enfrente azul fuerte} 
		//1
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(-70,460,230,290,225,225);
		
		g2d.setColor(new Color(117, 185, 199 ));
		g2d.fillRoundRect(-75,465,220,320,225,225);
		
		//2
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(369,460,230,290,225,225);
		
		g2d.setColor(new Color(117, 185, 199));
		g2d.fillRoundRect(365,465,220,320,225,225);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(485,410,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(480,405,215,45,90,90);
		//3
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(603,305,230,390,225,225);
		
		g2d.setColor(new Color(117, 185, 199 ));
		g2d.fillRoundRect(599,300,220,420,225,225);
		
		//4g2d.setColor(new Color(40, 136, 178));
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(880,400,230,290,200,200);
		
		g2d.setColor(new Color(117, 185, 199));
		g2d.fillRoundRect(885,405,220,320,200,200);
		
		//blanco
		g2d.setColor(Color.white);
		g2d.fillRoundRect(730,560,180,120,170,170);
		
		//Tubos
		//1
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(450,485,105,175,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(455,480,95,165,10,10);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(445,455,115,50,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(450,457,105,46,10,10);
		
		g2d.setColor(new Color(71, 116, 171));
		g2d.fillRect(455,457,3,175);
		g2d.fillRect(460,457,2,175);
		g2d.setColor(Color.white);
		g2d.fillRect(463,457,11,175);
		g2d.setColor(new Color(155, 184, 218));
		g2d.fillRect(475,457,5,175);
		
		g2d.setColor(new Color(102, 135, 173));
		g2d.fillRect(480,457,3,175);
		g2d.setColor(new Color(87, 117, 153));
		g2d.fillRect(483,457,15,175);
		
		g2d.setColor(new Color(93, 118, 147));
		g2d.fillRect(500,457,5,175);
		g2d.setColor(new Color(65, 92, 124));
		g2d.fillRect(505,457,3,175);
		g2d.setColor(new Color(40, 74, 115));

		g2d.fillRect(508,457,17,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(525,457,8,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(533,457,8,175);
		g2d.setColor(new Color(16, 38, 65));
		g2d.fillRect(541,457,7,175);
		g2d.setColor(new Color(5, 26, 51));
		g2d.fillRect(548,457,3,175);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(551,457,3,175);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(445,457,111,48,10,10);
		//2
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(850,535,105,175,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(855,530,95,165,10,10);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(845,505,115,50,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(850,507,105,46,10,10);
		
		g2d.setColor(new Color(71, 116, 171));
		g2d.fillRect(855,507,3,175);
		g2d.fillRect(860,507,2,175);
		g2d.setColor(Color.white);
		g2d.fillRect(863,507,11,175);
		g2d.setColor(new Color(155, 184, 218));
		g2d.fillRect(875,507,5,175);
		
		g2d.setColor(new Color(102, 135, 173));
		g2d.fillRect(880,507,3,175);
		g2d.setColor(new Color(87, 117, 153));
		g2d.fillRect(883,507,15,175);
		
		g2d.setColor(new Color(93, 118, 147));
		g2d.fillRect(900,507,5,175);
		g2d.setColor(new Color(65, 92, 124));
		g2d.fillRect(905,507,3,175);
		g2d.setColor(new Color(40, 74, 115));

		g2d.fillRect(908,507,17,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(925,507,8,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(933,507,8,175);
		g2d.setColor(new Color(16, 38, 65));
		g2d.fillRect(941,507,7,175);
		g2d.setColor(new Color(5, 26, 51));
		g2d.fillRect(948,507,3,175);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(951,507,3,175);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(845,507,111,48,10,10);
		//ovalos
		//1
		g2d.setColor(Color.white);
		g2d.fillOval(125, 258, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(125, 368, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(45, 418, 23, 35);
		//2
		g2d.setColor(Color.white);
		g2d.fillOval(395, 308, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(395, 418, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(475, 258, 23, 35);
		//3
		g2d.setColor(Color.white);
		g2d.fillOval(665, 138, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(595, 258, 23, 35);
		
		//4
		g2d.setColor(Color.white);
		g2d.fillOval(649, 355, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(755, 518, 23, 35);
		
		//nube 1
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(-50,310,200,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(-55,305,205,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(215,360,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(210,355,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(760,210,140,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(755,205,145,45,90,90);

		//planta
		g2d.setColor(Color.black);
		g2d.fillArc(180,560,110, 110, 90, 90);
		g2d.fillOval(205,550, 65, 75);
		g2d.fillArc(225,550,90, 100, 0, 180);
		g2d.fillArc(255,570,90, 90, 0, 180);
		
		g2d.setColor(new Color(43, 192, 25));
		g2d.fillArc(185,565,110, 110, 90, 90);
		g2d.fillOval(210,555, 55, 85);
		g2d.fillArc(230,555,80, 100, 0, 180);
		g2d.fillArc(260,575,80, 90, 0, 180);
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(new Color(19, 72, 1));
		g2d.drawArc(262,577,74, 70, -5,85);
		
		g2d.setColor(new Color(19, 72, 1));
		g2d.drawArc(247,560,60, 70, 35,48);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(86, 239, 68));
		g2d.drawArc(211,558,60, 60, 100, 52);
		
		g2d.drawArc(188,570,70, 82, 107, 72);
		
		g2d.setColor(new Color(159, 0, 18));
		g2d.fillOval(220, 570, 15, 15);
		g2d.fillOval(200, 600, 15, 15);
		g2d.fillOval(250, 590, 15, 15);
		g2d.fillOval(290, 580, 15, 15);
		
		g2d.setColor(new Color(255, 138, 152));
		g2d.fillOval(222, 570, 5, 5);
		g2d.fillOval(202, 600, 5, 5);
		g2d.fillOval(252, 590, 5, 5);
		g2d.fillOval(292, 580, 5, 5);
		
		//Cubos
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,560,64,55,15,15);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,565,55,48,15,15);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,565,50,43,15,15);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,505,64,55,15,15);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,510,55,48,15,15);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,510,50,43,15,15);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,450,64,55,20,20);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,455,55,48,20,20);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,455,50,43,20,20);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,395,64,55,20,20);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,400,55,48,20,20);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,400,50,43,20,20);
		
		int y=0;
		g2d.setColor(new Color(230, 227, 227));
		for(int i=0;i<4;i++)
		{
			
			g2d.fillOval(790, 405+y, 10, 10);
			g2d.fillOval(810, 412+y, 17, 13);
			g2d.fillOval(828, 422+y, 10, 16);
			g2d.fillOval(795, 430+y, 18, 10);
			
			y+=55;
		}
		
		//cubos amarillos
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(845,395,64,57,20,20);
		
		g2d.setColor(new Color(226, 182, 0));
		g2d.fillRoundRect(850,400,55,48,20,20);
		
		g2d.setColor(new Color(245, 221, 94));
		g2d.fillRoundRect(850,400,50,43,20,20);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(905,395,64,57,20,20);
		
		g2d.setColor(new Color(226, 182, 0));
		g2d.fillRoundRect(910,400,55,48,20,20);
		
		g2d.setColor(new Color(245, 221, 94));
		g2d.fillRoundRect(910,400,50,43,20,20);
		
		g2d.setColor(Color.BLACK);
		g2d.drawLine(865, 417, 865, 427);	
		g2d.drawLine(890, 417, 890, 427);	
		//Las bases
		g2d.setColor(new Color(216, 163, 76));
		g2d.fillRect(0,635,1000,65);
		g2d.setColor(new Color(175, 97, 52 ));
		g2d.fillRect(0,630,1000,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0,615,1000,15);//615 es el numero en y donde topa
		g2d.setColor(new Color(3, 165, 10));
		g2d.fillRect(0,618,1000,9);
		
		int x=0;
		g2d.setColor(new Color(218, 181, 120));
		for(int i=0;i<32;i++)
		{
			
			g2d.fillOval(10+x, 640, 7, 7);
			g2d.fillOval(30+x, 655, 7, 7);
			g2d.fillOval(15+x, 668, 7, 7);
			g2d.fillOval(22+x, 680, 7, 7);
			
			x+=30;
		}
		try {
			BufferedImage image= ImageIO.read(new File("src/mario2.png"));
			g2d.drawImage(image,370,508,null);
			BufferedImage image2= ImageIO.read(new File("src/planta.png"));
			g2d.drawImage(image2,467,335,null);
		}catch(IOException e) {
			e.printStackTrace();
		}
		/////////////////////////////////////////////////////////
		/*
		//this.setSize(1000, 700);
		super.paint(create);
		
		Graphics2D g2d= (Graphics2D)create;
		
		g2d.setColor(new Color(149, 245, 226 ));
		
		g2d.fillRect(0,0,this.getWidth(),this.getHeight());
		
		g2d.setColor(new Color(126, 55, 28 ));
		//x,y,ancho, largo
		
		g2d.fillRect(60,650,1000,50);
		g2d.setColor(new Color(216, 163, 76 ));
		g2d.fillRect(60,640,1000,10);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(60,635,1000,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(815,455,185,180,20,20);
		
		g2d.setColor(new Color(90, 232, 68 ));
		g2d.fillRoundRect(820,460,180,175,20,20);
		
		g2d.setColor(new Color(77, 170, 46));
		g2d.fillRoundRect(820,625,190,10,20,20);
		
		
	
		
		g2d.setColor(Color.black);
		g2d.fillOval(823, 463, 24, 24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(825, 465, 20, 20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(823, 606, 24, 24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(825, 608, 20, 20);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(880,220,80,80,5,5);
		
		g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(885,225,70,70,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(890, 230, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(940, 230, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(890, 280, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(940, 280, 10, 10);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(100,360,80,80,5,5);
		
		g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(105,365,70,70,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(110, 368, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(158, 368, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(110, 418, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(158, 418, 10, 10);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(230,80,80,80,5,5);
		
		g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(235,85,70,70,5,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(310,80,80,80,5,5);
		
		g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(315,85,70,70,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillOval(240, 90, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(290, 90, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(240, 140, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(290, 140, 10, 10);
		
		
		g2d.setColor(Color.black);
		g2d.fillOval(320, 90, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(370, 90, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(320, 140, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(370, 140, 10, 10);
		
		//Azul
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(345,370,200,265,20,20);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(320,355,200,285,20,20);
		
		g2d.setColor(new Color(145, 194, 241));
		g2d.fillRoundRect(325,360,190,275,20,20);
		
		g2d.setColor(new Color(82, 167, 224));
		g2d.fillRoundRect(505,360,10,275,20,20);
		
		g2d.setColor(new Color(82, 167, 224));
		g2d.fillRoundRect(325,625,190,10,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(333,366,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(335,368,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(483,366,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(485,368,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(483, 606, 24, 24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(485, 608, 20, 20);
		
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawLine(353,371,338, 386);
		g2d.drawLine(503,371,488, 386);
		g2d.drawLine(502,612,490, 625);
		
		g2d.drawLine(353,371,338, 386);
		g2d.drawLine(503,371,488, 386);
		g2d.drawLine(502,612,490, 625);
		
		
		
		g2d.drawLine(843,468,827,482 );
		g2d.drawLine(843,612,827, 625);
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(895,250,19,19);
		g2d.fillOval(940,245,15,10);
		g2d.setColor(new Color(248, 193, 133));
		g2d.fillOval(890,250,19,19);
		g2d.fillOval(935,245,15,10);
//		
		
		//rosa
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(305,475,150,160,20,20);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(230,455,200,180,20,20);
		
		g2d.setColor(new Color(240, 197, 173));
		g2d.fillRoundRect(235,460,190,175,20,20);
		
		g2d.setColor(new Color(255, 148, 104));
		g2d.fillRoundRect(415,460,10,175,20,20);
		
		g2d.setColor(new Color(255, 148, 104));
		g2d.fillRoundRect(235,625,190,10,20,20);
		
		//circulos
		g2d.setColor(Color.black);
		g2d.fillOval(243,466,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(245,468,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(243,606,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(245,608,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(393,606,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(395,608,20,20);
		
		g2d.setColor(Color.black);
		g2d.fillOval(393,466,24,24);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(395,468,20,20);
		
		g2d.setColor(Color.black);
		
		g2d.drawLine(263,472,247, 485);
		g2d.drawLine(263,612,247, 625);
		g2d.drawLine(413,612,397, 625);
		g2d.drawLine(413,472,397, 485);
		
		/*g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(235,85,70,70,5,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(310,80,80,80,5,5);
		
		g2d.setColor(new Color(210, 121, 42));
		g2d.fillRoundRect(315,85,70,70,5,5);*/
		
		/*g2d.setColor(Color.black);
		g2d.fillOval(245,110,19,19);
		g2d.fillOval(290,105,15,10);
		g2d.setColor(new Color(248, 193, 133));
		g2d.fillOval(240,110,19,19);
		g2d.fillOval(285,105,15,10);
		

		
		
		
		//Coso verde
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(620,455,110,185,10,10);
		
		g2d.setColor(new Color(13, 137, 31));
		g2d.fillRoundRect(625,460,100,175,10,10);
		
		/*g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(610,445,128,60,10,10);
		
		g2d.setColor(new Color(13, 137, 31));
		g2d.fillRoundRect(615,447,118,56,10,10);
		
		g2d.setColor(new Color(155, 222, 105));
		g2d.fillRect(625,447,3,188);
		g2d.fillRect(630,447,2,188);
		g2d.fillRect(634,447,8,188);
		g2d.fillRect(647,447,3,188);
		
		g2d.fillRect(680,447,4,188);
		g2d.setColor(new Color(42, 96, 2));
		g2d.fillRect(689,447,3,188);
		g2d.setColor(new Color(140, 200, 96));
		g2d.fillRect(692,447,2,188);
		
		g2d.setColor(new Color(43, 93, 5));
		g2d.fillRect(696,447,5,188);
		g2d.setColor(new Color(36, 60, 19 ));
		g2d.fillRect(686,447,3,188);
		g2d.fillRect(702,447,12,188);
		g2d.setColor(new Color(23, 42, 8));
		g2d.fillRect(714,447,5,188);
		g2d.setColor(new Color(21, 44, 3));
		g2d.fillRect(719,447,3,188);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(722,447,6,188);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(617,445,113,60,10,10);
		
		//Planta
		g2d.setColor(Color.black);
		g2d.fillArc(75,580,110, 110, 90, 90);
		g2d.fillOval(105,560, 65, 75);
		g2d.fillArc(95,590,90, 90, 0, 180);
		
		g2d.setColor(new Color(37, 125, 8));
		g2d.fillArc(80,585,100, 100, 90, 90);
		g2d.fillOval(110,565, 55, 65);
		g2d.fillArc(100,595,80, 80, 0, 180);
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(new Color(19, 72, 1));
		g2d.drawArc(107,600,70, 70, 5, 60);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(77, 198, 36));
		g2d.drawArc(109,567,70, 70, 110, 50);
		
		g2d.drawArc(84,590,70, 90, 110, 67);
		//piso
		int x=0;
		int y=640;
		
		
		//int yPoints[]= {640,640,650,650,660,680,680,690,690,665,665,660, 660,650, 650};
		g2d.setColor(new Color(67, 33, 4 ));
		for(int i=1;i<=20;i++)
		{
			
			int xPoints[]= {70+x,90+x,90+x,100+x,110+x,110+x,130+x,130+x,100+x,100+x,90+x,90+x, 80+x, 80+x,70+x};
			int yPoints[]= {660,660,665,665,670,680,680,685,685,675,675,670, 670,665, 665};
			g2d.fillPolygon(xPoints, yPoints, 15);
			x+=45;
		}
		
		try {
			BufferedImage image= ImageIO.read(new File("src/mario.png"));
			g2d.drawImage(image,490,550,null);
			BufferedImage image2= ImageIO.read(new File("src/plant.png"));
			g2d.drawImage(image2,640,323,null);
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		/*g2d.setColor(new Color(149, 245, 226 ));
		g2d.fillRect(50,50,200,100);
		
		//cafe
		g2d.setColor(new Color(126, 55, 28 ));
		//x,y,ancho, largo
		g2d.fillRect(0,660,1000,40);
		
		//claro
		g2d.setColor(new Color(216, 163, 76 ));
		g2d.fillRect(0,620,1000,40);
		
		//Verde
		g2d.setColor(new Color(112, 216, 76));
		g2d.fillRect(0,580,1000,40);
		
		//Verde fuerte
		g2d.setColor(new Color(36, 121, 7));
		g2d.fillRect(0,560,1000,25);
		
		//Casa
		//Madera rectangular
		g2d.setColor(new Color(223, 180, 73));
		g2d.fillRect(0,430,1000,50);
		
		//Maderas en vertical
		g2d.setColor(new Color(254, 206, 86));
		
		int xPoints[]= {10,40,70,70,10};
		int yPoints[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints, yPoints, 5);
		
		int xPoints2[]= {100,130,160,160,100};
		int yPoints2[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints2, yPoints2, 5);
		
		int xPoints3[]= {190,220,250,250,190};
		int yPoints3[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints3, yPoints3, 5);
		
		
		int xPoints4[]= {930,960,990,990,930};
		int yPoints4[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints4, yPoints4, 5);
		
		int xPoints5[]= {840,870,900,900,840};
		int yPoints5[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints5, yPoints5, 5);
		
		int xPoints6[]= {750,780,810,810,750};
		int yPoints6[]= {350,300,350,560,560};
		g2d.fillPolygon(xPoints6, yPoints6, 5);
		
		
		//Casa
		g2d.setColor(new Color(250, 218, 165 ));
		g2d.fillRect(270,240,460,320);
		
		//Sombra de la casa
		g2d.setColor(new Color(222, 189, 133 ));
		int xPoints7[]= {270,730,730};
		int yPoints7[]= {240,240,330};
		g2d.fillPolygon(xPoints7, yPoints7, 3);
		
		//Sombra de la ventana
		g2d.setColor(new Color(222, 189, 133));
		int xPoints10[]= {570,730,730};
		int yPoints10[]= {420,450,420};
		g2d.fillPolygon(xPoints10, yPoints10, 3);
		
		
		g2d.setColor(new Color(147, 101, 25));
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(272,292,727,292);
		
		g2d.drawLine(272,332,727,332);
		
		g2d.drawLine(272,372,727,372);
		
		g2d.drawLine(272,412,727,412);
		
		g2d.drawLine(272,452,727,452);
		
		g2d.drawLine(272,492,727,492);
		
		g2d.drawLine(272,532,727,532);
		
		g2d.setColor(new Color(85, 53, 0 ));
		g2d.fillRect(300,300,135,232);
		
		g2d.setColor(new Color(192, 133, 35));
		g2d.fillRect(310,310,115,217);
		
		g2d.setColor(Color.white);
		g2d.fillOval(400, 415, 20, 20);
		
		
		g2d.setColor(new Color(198, 37, 21));
		g2d.fillRect(570,300,120,120);
		
		g2d.setColor(Color.white);
		g2d.fillRect(580,310,100,100);
		
		g2d.setColor(Color.gray);
		g2d.fillRect(560,420,140,8);
		
		g2d.setColor(new Color(198, 37, 21));
		g2d.drawLine(630,305,630,410);
		g2d.drawLine(580,360,685,360);
		
		g2d.setColor(Color.gray);
		g2d.fillRect(250,535,500,25);
		g2d.fillRect(630,120,70,130);
		
		g2d.setColor(new Color(84, 85, 93));
		g2d.fillRect(615,90,100,30);
		
		g2d.setColor(new Color(117, 0, 0 ));
		int xPoints8[]= {240,400,750};
		int yPoints8[]= {250,40,250};
		g2d.fillPolygon(xPoints8, yPoints8, 3);
		
		g2d.setColor(new Color(55, 59, 61));
		int xPoints9[]= {630,700,700};
		int yPoints9[]= {120,140,120};
		g2d.fillPolygon(xPoints9, yPoints9, 3);
		//Asigna el color
		/*g2d.setColor(Color.blue);
		//Fill
		g2d.fillRect(50,50,200,100);
		//Clear
		g2d.clearRect(100, 100, 100, 100);
		
		g2d.fillArc(300, 300, 100, 100, 45, 180);
		
		g2d.drawArc(380, 300, 100, 100, 45, 180);
		
		g2d.setColor(Color.black);
		
		g2d.drawLine(0, 0, 500, 500);
		
		g2d.drawOval(400, 400, 50, 80);;
		
		g2d.fillOval(350, 400, 50, 80);
		
		int xPoints[]= {100,250,300};
		int yPoints[]= {100,200,300};
		
		g2d.setColor(Color.red);
		
		g2d.drawPolyline(xPoints, yPoints, 3);
		
		g2d.fillPolygon(xPoints, yPoints, 3);
		
		g2d.setFont(new Font("Courier new",Font.BOLD ,30));
		g2d.drawString("Hola", 280, 150);
		
		g2d.setStroke(new BasicStroke(10));
		g2d.drawRoundRect(420, 120, 200, 150, 10, 10);
		
		try {
			BufferedImage image= ImageIO.read(new File("src/sun.png"));
			g2d.drawImage(image,650,80,null);
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		
		
		
		
				
		
	}
}
