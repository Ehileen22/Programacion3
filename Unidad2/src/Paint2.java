import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Paint2 extends JFrame implements KeyListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JPanel panel_1;
	private JPanel panel ;
	private int x=10, y=10;
	private Player jp= new Player(x, y, 20, 20, "");
	//private Player obstaculo=new Player(100,100,50, 150,"#82CAC5");
	private boolean movArriba=true;
	private boolean movAbajo=true;
	private boolean movDerecha=true;
	private boolean movIzquierda=true;
	private String color="#992323";
	private JLabel lblNewLabel;
	private int horas=0, minutos=0, segundos=0;
	private Player meta=new Player(580,540,20,20,"");
	private Timer timerTiempo;
	//fill(jp,getX(), asi con todos)
	//jp.setY(jp.getY()-10);
	//lo mismo por obstaculo
	//al final son 4 ifs
	//el decode, no olvidar
	//hablando del video x+100 pq es el tamaño del cuadradito
	private Player obstaculos[]= {new Player(0,0,10, 560,color), new Player(30,0,570, 10,color),new Player(590,10,10, 530,color),new Player(0,560 ,600, 10,color), 
								  new Player(30,0,10, 90,color),new Player(40,60,70, 10,color),new Player(60,40,10, 20,color),new Player(90,30,40, 10,color),
								  new Player(130,10,10, 30,color),/*barra esa*/new Player(140,60,140, 10,color),new Player(160,40,10, 20,color),new Player(190,30,40, 10,color),
								  new Player(230,10,10, 30,color), new Player(260,30,180, 10,color), new Player(340,40,10, 20,color),new Player(470,30,50, 10,color), new Player(470,40,10, 20,color),
								  new Player(540,10,10, 30,color),new Player(550,30,20, 10,color),
								  new Player(10,110,50, 10,color),new Player(60,90,10, 30,color),new Player(70,90,20, 10,color),new Player(110,60,10, 140,color),
								  new Player(10,140,80, 10,color), new Player(30,170,60, 10,color),new Player(80,140,10, 30,color),new Player(30,200,90, 10,color),
								  new Player(30,200,10, 70,color), new Player(30,260,60, 10,color),/*la barra vertical*/new Player(60,240,10, 110,color),new Player(110,230,10, 60,color),new Player(90,230,30, 10,color),
								  new Player(90,290,30, 10,color), new Player(10,290,30, 10,color),new Player(10,290,30, 10,color),new Player(30,320,30, 10,color),new Player(10,350,30, 10,color),
								  new Player(30,360,10, 30,color),new Player(40,380,50, 10,color),new Player(30,360,10, 20,color),new Player(60,350,60, 10,color),new Player(80,380,10, 40,color),
								  new Player(30,410,60, 10,color),/*otra barra larga vertical*/new Player(110,350,10, 100,color),new Player(10,440,20,10,color),new Player(50,410,10,70,color),new Player(80,440,70,10,color),
								  new Player(30,470,90,10,color), new Player(10,530,20,10,color), new Player(30,500,50,10,color),new Player(50,500,10,40,color),new Player(80,500,10,70,color),new Player(110,480,10,30,color),
								 
								  new Player(120,90,40,10,color),new Player(160,90,10,30,color),new Player(140,120,50,10,color),new Player(190,70,10,20,color),new Player(140,130,10,40,color),new Player(140,170,30,10,color),
								  new Player(160,170,10,40,color),new Player(140,200,30,10,color),new Player(140,210,10,50,color),new Player(120,260,50,10,color),new Player(90,320,50,10,color),new Player(140,290,10,100,color),
								  new Player(120,380,20,10,color),new Player(110,500,30,10,color),new Player(140,500,10,30,color),/*last one*/new Player(110,530,70,10,color),new Player(220,70,10,80,color),new Player(190,150,40,10,color),
								  new Player(190,150,10,90,color),new Player(170,230,30,10,color),new Player(170,260,10,40,color),new Player(170,290,50,10,color),new Player(170,260,10,40,color),new Player(220,290,10,30,color),
								  new Player(170,320,60,10,color),new Player(170,320,10,90,color),new Player(140,410,40,10,color),new Player(140,440,10,30,color),new Player(140,470,40,10,color),new Player(170,440,10,70,color),new Player(170,500,30,10,color),
								  new Player(170,500,30,10,color),new Player(200,500,10,40,color),
								  new Player(280,60,10,40,color),new Player(280,90,30,10,color),new Player(310,60,10,70,color),new Player(220,180,10,50,color),new Player(220,230,40,10,color),new Player(250,90,10,140,color),new Player(260,120,20,10,color),
								  new Player(320,60,30,10,color),new Player(340,90,10,70,color),new Player(340,120,70,10,color),new Player(370,60,10,70,color),/*barras largas final*/new Player(370,60,220,10,color),new Player(410,90,190,10,color),new Player(440,90,10,70,color),
								  new Player(290,150,60,10,color),new Player(280,150,10,30,color),new Player(310,160,10,80,color),new Player(200,260,170,10,color),new Player(280,200,10,70,color),new Player(340,180,10,90,color),new Player(340,180,70,10,color)
								  ,new Player(370,160,10,30,color),/*la q ocupo para la vuelta*/new Player(370,150,170,10,color),new Player(370,210,10,60,color),new Player(250,260,10,70,color),new Player(250,290,70,10,color),new Player(310,290,10,40,color),new Player(200,350,150,10,color),
								  new Player(200,350,10,90,color),new Player(170,440,40,10,color),new Player(230,380,10,180,color),new Player(200,470,40,10,color),new Player(230,380,30,10,color),new Player(280,320,10,130,color),new Player(260,440,30,10,color),
								  new Player(260,440,10,60,color),new Player(260,500,50,10,color),new Player(240,530,50,10,color),new Player(340,290,10,90,color),new Player(340,380,40,10,color),new Player(170,260,10,40,color),
								  new Player(290,470,50,10,color),new Player(310,440,10,100,color),new Player(310,530,30,10,color),new Player(310,380,10,30,color),new Player(310,410,30,10,color),new Player(340,410,10,30,color),new Player(340,440,30,10,color),
								  new Player(370,440,10,120,color),new Player(370,380,10,30,color),new Player(370,410,30,10,color),new Player(400,350,10,160,color),new Player(340,500,40,10,color),new Player(380,530,70,10,color),
								  new Player(340,290,70,10,color), new Player(400,240,10,80,color), new Player(380,320,30,10,color), new Player(400,240,70,10,color), new Player(370,210,70,10,color), new Player(380,350,100,10,color), new Player(440,290,10,60,color),
								  new Player(470,350,10,40,color), new Player(440,380,10,30,color), new Player(370,440,10,120,color), new Player(440,410,70,10,color), new Player(440,440,10,30,color), new Player(440,440,30,10,color), new Player(470,440,10,30,color),
								  new Player(500,290,10,160,color),/*raya q no c q*/ new Player(470,470,70,10,color), new Player(480,290,30,10,color), new Player(470,320,40,10,color), new Player(470,180,10,120,color), new Player(440,180,100,10,color),
								  new Player(530,180,10,40,color), new Player(500,210,30,10,color), new Player(500,210,10,30,color), new Player(530,120,10,40,color), new Player(480,120,60,10,color), new Player(530,240,10,260,color), new Player(504,260,30,10,color),
								  new Player(530,240,40,10,color), new Player(560,90,10,150,color), new Player(400,500,170,10,color), new Player(470,500,10,40,color), new Player(500,530,10,30,color), new Player(500,530,50,10,color),
								  new Player(530,290,40,10,color), new Player(560,320,10,160,color), new Player(560,470,40,10,color), new Player(10,0,20,10,"#FFFFFF")};
	public int dir=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint2 frame = new Paint2();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paint2() {
		frame = new JFrame();
		frame.setBounds(300, 20, 675, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		tiempo();
		panel = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				
				super.paintComponent(create);
				Graphics2D g2d= (Graphics2D)create;
//				g2d.setColor(Color.decode("#00B846"));
//				g2d.fillRect(590,540,10,20);
				try {
					BufferedImage image= ImageIO.read(new File("src/calcifer.png"));
					g2d.drawImage(image,jp.getX(),jp.getY(),jp.getW(),jp.getH(),null);
					BufferedImage image2= ImageIO.read(new File("src/final.png"));
					g2d.drawImage(image2,meta.getX(),meta.getY(),meta.getW(),meta.getH(),null);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				for(Player obstaculo:obstaculos)
				{
					g2d.setColor(Color.decode(obstaculo.getColor()));
					g2d.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getW(),obstaculo.getH());
				}
				
				
			}
		};
		
		panel.setBackground(Color.white);
		panel.setBounds(30, 30, 600, 570);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.addMouseListener(this);
		panel_1 = new JPanel();
		panel_1.setBackground(Color.black);
		panel_1.setBounds(0, 600, 675, 65);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton(new ImageIcon(getClass().getResource("reinicio.png")));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		//btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(173, 2, 4), 2));;
		//btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setFocusable(false);
				reiniciar();
			}
		});
		//btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(300, 2, 52, 52);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.black);
		panel_2.setBounds(0, 0, 659, 600);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		
		lblNewLabel= new JLabel("Tiempo: 00: 00: 00 " );
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(220,5, 399, 25);
		panel_2.add(lblNewLabel);
		
		/*JLabel fin=new JLabel();
		fin.setIcon(new ImageIcon(getClass().getResource("final.png")));
		fin.setBounds(632,565,25,25);
		panel_2.add(fin);*/
		
		frame.addKeyListener(this);
		frame.setFocusable(true);
		
		Timer timer=new Timer(100,new ActionListener() {
		 public void actionPerformed(ActionEvent evt) {
			update();
		 }
		});
		timer.start();
		
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		//solo guardadr la ultima tecla presionada
		System.out.println(e.getKeyCode());
		
		
		switch(e.getKeyCode())
		{
		case 87:
			dir=1;
			
			break;
			
		case 83:
			dir=2;
		
			
			break;
		case 68:
			dir=3;
			
			break;
		case 65:
			dir=4;
			
			break;
			
		
		}
	}

	public void update()
	{
		switch(dir)
		{
		case 1:
			jp.setY(jp.getY()-10);
			break;
			
		case 2:
			
			jp.setY(jp.getY()+10);
			
			
			break;
		case 3:
			
			jp.setX(jp.getX()+10);
			
			break;
		case 4:
			
			jp.setX(jp.getX()-10);

			break;
			
		
		}
		for(Player obstaculo: obstaculos)
		{
			if(jp.colision(obstaculo))
			{
				if(dir==1)
				{
					jp.setY(jp.getY()+10);
				}
				if(dir==2)
				{
					jp.setY(jp.getY()-10);
				}
				if(dir==3)
				{
					jp.setX(jp.getX()-10);
				}
				if(dir==4)
				{
					jp.setX(jp.getX()+10);
				}
			}
		}
		if(jp.colision(meta))
		{
			detenerTiempo();
			JOptionPane.showMessageDialog(null, "GANASTE!!!"+"\n"+lblNewLabel.getText(), null, JOptionPane.WARNING_MESSAGE);
			reiniciar();
			
		}
			
		panel.repaint();
	}
	public void tiempo()
	{
		timerTiempo=new Timer(1000,new ActionListener() {
			 public void actionPerformed(ActionEvent evt) {
				segundos++;
				if(segundos>=60)
				{
					segundos=0;
					minutos++;
					if(minutos>=60)
					{
						minutos=0;
						horas++;
					}
				}
				actualizar();
				
			 }
			});
			timerTiempo.start();
	}
	public void actualizar()
	{
		String fHoras=String.format("%02d",horas);
		String fMinutos=String.format("%02d",minutos);
		String fSegundos=String.format("%02d",segundos);
		lblNewLabel.setText("Tiempo: " +fHoras+": "+fMinutos+": "+fSegundos);
	}
	public void reiniciarTiempo()
	{
		horas=0;
		minutos=0;
		segundos=0;
		actualizar();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X: " + e.getX()+"   Y: "+e.getY());
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void detenerTiempo()
	{
		if(timerTiempo!=null&&timerTiempo.isRunning())
		{
			timerTiempo.stop();
		}
	}
	public void reiniciar()
	{
		detenerTiempo();
		jp.setX(10);
		jp.setY(10);
		dir=0;
		reiniciarTiempo();
		timerTiempo.start();
		
		
	}
}
