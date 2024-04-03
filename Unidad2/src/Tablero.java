import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Collections;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tablero extends JFrame {

	boolean turno=true;
	boolean fin=false;
	JButton btnNewButton_1 = new JButton();
	JButton btnNewButton_2 = new JButton();
	JButton btnNewButton_3 = new JButton();
	JButton btnNewButton_4 = new JButton();
	JButton btnNewButton_5 = new JButton();
	JButton btnNewButton_6 = new JButton();
	JButton btnNewButton_7 = new JButton();
	JButton btnNewButton_8 = new JButton();
	JButton btnNewButton_9 = new JButton();
	JButton btnNewButton_10 = new JButton();
	JButton btnNewButton_11 = new JButton();
	JButton btnNewButton_12= new JButton();
	JButton btnNewButton_13 = new JButton();
	JButton btnNewButton_14 = new JButton();
	JButton btnNewButton_15 = new JButton();
	JButton btnNewButton_16 = new JButton();

	
	JButton button= new JButton();
	private static final long serialVersionUID = 1L;
	private final JPanel panel_1 = new JPanel();
	JPanel panel = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JButton reiniciar = new JButton("Reiniciar");
	private String btns[]={"1","2","3","4","5","6","7","8","9","10","11","12", "13", "14", "15", " "};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero() {
		
		JFrame frame=new JFrame();
		frame.setBounds(100, 100, 400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("   ");
		JLabel lblNewLabel_1 = new JLabel("   ");
		JLabel lblNewLabe2 = new JLabel("   ");
		JLabel lblNewLabel3 = new JLabel("   ");
		
		
		panel_1.setBackground(new Color(164, 224, 193 ));
		panel_2.setBackground(new Color(164, 224, 193 ));
		panel_3.setBackground(new Color(164, 224, 193 ));
		panel_4.setBackground(new Color(164, 224, 193 ));
		
		frame.getContentPane().add(panel_1,BorderLayout.NORTH);
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		frame.getContentPane().add(panel_3,BorderLayout.WEST);
		frame.getContentPane().add(panel_4,BorderLayout.EAST);
		
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		reiniciar.setPreferredSize(new Dimension(100,30));
		reiniciar.setBackground(new Color(21, 117, 179));
		reiniciar.setForeground(Color.white);
		reiniciar.setBorderPainted(true);
		reiniciar.setBorder(BorderFactory.createLineBorder(new Color(0, 53, 88),2));
		
		panel_2.add(reiniciar);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		//JButton btnNewButton_0= new JButton("");
		/*btnNewButton_1.setText("");
		btnNewButton_1.setBackground(Color.white);
	
		
		btnNewButton_2.setText("");
		btnNewButton_2.setBackground(Color.white);
		
		btnNewButton_3.setText("");
		btnNewButton_3.setBackground(Color.white);
		
		
		btnNewButton_4.setText("");
		btnNewButton_4.setBackground(Color.white);
		
		btnNewButton_5.setText("");
		btnNewButton_5.setBackground(Color.white);
		
		
		btnNewButton_6.setText("");
		btnNewButton_6.setBackground(Color.white);

	
		btnNewButton_7.setText("");
		btnNewButton_7.setBackground(Color.white);
		
		
		btnNewButton_8.setText("");
		btnNewButton_8.setBackground(Color.white);
		
		
		btnNewButton_9.setText("");
		btnNewButton_9.setBackground(Color.white);
		
		btnNewButton_10.setText("");
		btnNewButton_10.setBackground(Color.white);
		
		btnNewButton_11.setText("");
		btnNewButton_11.setBackground(Color.white);
		
		btnNewButton_12.setText("");
		btnNewButton_12.setBackground(Color.white);
		
		btnNewButton_13.setText("");
		btnNewButton_13.setBackground(Color.white);
		
		btnNewButton_14.setText("");
		btnNewButton_14.setBackground(Color.white);
		
		btnNewButton_15.setText("");
		btnNewButton_15.setBackground(Color.white);
		
		btnNewButton_16.setText("");
		btnNewButton_16.setBackground(Color.white);*/
		
		
		Collections.shuffle(Arrays.asList(btns));
		for(int i=0; i<16; i++)
		{
			JButton button= new JButton(btns[i]);
			button.setBackground(Color.white);
			panel.add(button);
		}
		
		Component [] elementos=panel.getComponents();
		for(int i=0; i<elementos.length;i++)
		{
			JButton btn =((JButton)elementos[i]);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton button = (JButton) e.getSource(); 
					click(button);
					
				}
				
			});
		}
		
		
		
		/*panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton_4);
		panel.add(btnNewButton_5);
		panel.add(btnNewButton_6);	
		panel.add(btnNewButton_7);	
		panel.add(btnNewButton_8);	
		panel.add(btnNewButton_9);
		panel.add(btnNewButton_10);
		panel.add(btnNewButton_11);
		panel.add(btnNewButton_12);
		panel.add(btnNewButton_13);
		panel.add(btnNewButton_14);
		panel.add(btnNewButton_15);
		panel.add(btnNewButton_16);*/
		
		
		
		/*btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		

		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});

		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});

		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		

		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});
		

		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				click(button);
				
			}
			
		});*/
		
		
		reiniciar.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(Arrays.asList(btns));
				for(int i=0; i<elementos.length;i++)
		    	{
		    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
		    		{
		    			JButton button= new JButton(btns[i]);
		    			button.setBackground(Color.white);
		    			panel.add(button);
		    						    		
		    		}
		    	}
					
								
			}
			
		});
		frame.getContentPane().add(panel_2,BorderLayout.SOUTH);
	
		
	}
	public void click(JButton button) {	

		if(button.getText().equals("1"))
		{
			button.setBackground(Color.red);
		}
		finJuego();
	}
	
	public void finJuego() {
		
	}
		
		
		
		
		
	

		
		
		
	    
		
	

}
