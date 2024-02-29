import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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
		this.interes();
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
}
