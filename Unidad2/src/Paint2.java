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
		JPanel panel = new JPanel(){
			@Override
			public void paintComponent(Graphics create)
			{
				super.paintComponent(create);
				Graphics2D g2d= (Graphics2D)create;	
				g2d.setColor(new Color(149,27,27));
				g2d.fillRect(100,100,150,80);
			}
		};
		
		panel.setBackground(new Color(252, 209, 210));
		panel.setBounds(0, 0, 601, 422);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
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
		btnNewButton.setBounds(261, 18, 89, 23);
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
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
