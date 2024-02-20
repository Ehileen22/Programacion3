import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana()
	{
		
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		this.iniciarComponentes();
		
	}
	public void iniciarComponentes()
	{
		JPanel login= new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.GRAY);
		login.setLayout(null);
		
		JLabel loginTitle=new JLabel("ACCEDER",0);
		loginTitle.setSize(300, 80);
		loginTitle.setFont(new Font("Courier new",Font.BOLD ,25));
		loginTitle.setForeground(Color.WHITE);
		loginTitle.setLocation(100, 20);
		loginTitle.setOpaque(true);
		loginTitle.setBackground(Color.RED);
		login.add(loginTitle);
		
		//size
		//Location
		//background-opaque
		//String en su constructor
		
		JPanel registro= new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.GREEN);
		
		this.add(login);
		this.add(registro);
		
	}

}
