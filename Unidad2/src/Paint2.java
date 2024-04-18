import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Paint2 extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame;
	private JPanel panel_1;
	private JPanel panel ;
	private int x=250, y=180;
	private Player jp= new Player(x, y, 25, 25, "#951B1B");
	private Player obstaculo=new Player(100,100,50, 150,"#82CAC5");
	private boolean movArriba=true;
	private boolean movAbajo=true;
	private boolean movDerecha=true;
	private boolean movIzquierda=true;
	//fill(jp,getX(), asi con todos)
	//jp.setY(jp.getY()-10);
	//lo mismo por obstaculo
	//al final son 4 ifs
	//el decode, no olvidar
	//hablando del video x+100 pq es el tamaño del cuadradito
	

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
		frame.setBounds(100, 100, 617, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
		panel = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d= (Graphics2D)create;	
				g2d.setColor(Color.decode(jp.getColor()));
				g2d.fillRect(jp.getX(),jp.getY(),jp.getW(),jp.getH());
				
				g2d.setColor(Color.decode(obstaculo.getColor()));
				g2d.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getW(),obstaculo.getH());
				
			}
		};
		
		panel.setBackground(new Color(252, 209, 210));
		panel.setBounds(0, 0, 601, 422);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 124, 140));
		panel_1.setBounds(0, 422, 601, 52);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(173, 2, 4), 2));;
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setFocusable(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(252, 18, 89, 23);
		panel_1.add(btnNewButton);
		
		frame.addKeyListener(this);
		frame.setFocusable(true);
		
	}
	
	
	
	/*@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		repaint();
		super.paint(g);
		g.fillRect(100, 100, 70,80);
		g.setColor(Color.black);
	}*/

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		int iniX=jp.getX();
		int iniY=jp.getY();
		switch(e.getKeyCode())
		{
		case 87:
			//w arriba
			//y+=10;
			if(movArriba)
			{
				jp.setY(jp.getY()-10);
			}
			
			break;
			
		case 83:
			//s abajo
			if(movAbajo)
			{
		
				jp.setY(jp.getY()+10);
			}
			//y+=10;
			
			break;
		case 68:
			//d derecha
			if(movDerecha)
			{
				jp.setX(jp.getX()+10);
			}
			//x+=10;
			break;
		case 65:
			if(movIzquierda) {
				jp.setX(jp.getX()-10);
			}
			//x-=10;
			//a izquierda
			break;
			
		
		}
		if(colision(jp))
		{
			jp.setX(iniX);
			jp.setY(iniY);
			if(e.getKeyCode()==87)
			{
				movArriba=false;
			}else if(e.getKeyCode()==83)
			{
				movAbajo=false;
			}else if(e.getKeyCode()==68)
			{
				movDerecha=false;
			}else if(e.getKeyCode()==65) 
			{
				
				movIzquierda=false;
			}
		}
		else
		{
			movArriba=true;
			movAbajo=true;
			movDerecha=true;
			movIzquierda=true;
		}
		//System.out.println(jp.colision(obstaculo));
		//cuando lo quiera tocar
		//si se suma, pues se resta 
		panel.repaint();
		
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean colision(Player p)
	{
		
		//if (this.c+this.w>p.x+p.y) o sin lo otro
		if(jp.getX()<(obstaculo.getX()+obstaculo.getW())&&(jp.getX()+jp.getW())>obstaculo.getX()+5&&jp.getY()<(obstaculo.getY()+obstaculo.getH())&&(jp.getY()+jp.getH())>obstaculo.getY()+5)
		{
			System.out.println("Colision");
			
			
			return true;
			
		}
		else	
		{
			return false;
		}
			
	}
}
