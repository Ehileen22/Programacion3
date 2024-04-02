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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gato extends JFrame {

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

	
	JButton button= new JButton();
	private static final long serialVersionUID = 1L;
	private final JPanel panel_1 = new JPanel();
	JPanel panel = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JButton reiniciar = new JButton("Reiniciar");
	private int equis=0;
	private int circulo=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gato frame = new Gato();
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
	public Gato() {
		
		JFrame frame=new JFrame();
		frame.setBounds(100, 100, 384,324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("O: "+circulo);
		JLabel lblNewLabel_1 = new JLabel("X: "+equis);
		
		frame.getContentPane().add(panel_1,BorderLayout.NORTH);
		
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		
		
		
		
		
		panel_2.add(reiniciar);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		//JButton btnNewButton_0= new JButton("");
		btnNewButton_1.setText("");
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
		
		
		
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton_4);
		panel.add(btnNewButton_5);
		panel.add(btnNewButton_6);	
		panel.add(btnNewButton_7);	
		panel.add(btnNewButton_8);	
		panel.add(btnNewButton_9);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {

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
			
		});
		reiniciar.setVerticalAlignment(SwingConstants.BOTTOM);
		reiniciar.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					Component [] elementos=panel.getComponents();
					for(int i=0; i<elementos.length;i++)
			    	{
			    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
			    		{
			    			JButton btn =((JButton)elementos[i]);
			    			
			    			btn.setText("");
			    			btn.setBackground(Color.white);
			    			btn.setEnabled(true);
			    		}
			    	}
					
								
			}
			
		});
		frame.getContentPane().add(panel_2,BorderLayout.SOUTH);
	
		
	}
	public void click(JButton button) {
		
		
		//boton libre
		if(button.getText().equals(""))
		{
			//turno
			if(turno)
			{
				button.setText("O");
				button.setOpaque(true);	
				button.setBackground(new Color(205, 217, 255));
				turno=false;
			}
			else
			{
				button.setText("X");
				button.setBackground(new Color(205, 255, 150));
				turno=true;
			}
			button.setEnabled(false);
		}
		finJuego();
	}
	
	public void finJuego() {
		//Horizontal
		if(btnNewButton_1.getText().equals(btnNewButton_2.getText())&&btnNewButton_1.getText().equals(btnNewButton_3.getText())&&!btnNewButton_1.getText().isEmpty()&&btnNewButton_2.getText().equals(btnNewButton_3.getText())&&!btnNewButton_1.getText().equals(""))

		{
			System.out.println("1");
			System.out.println(btnNewButton_1.getText());
			fin=true;
			
		}
		if(btnNewButton_4.getText().equals(btnNewButton_5.getText())&&btnNewButton_4.getText().equals(btnNewButton_6.getText())&&!btnNewButton_4.getText().isEmpty()&&btnNewButton_5.getText().equals(btnNewButton_6.getText())&&!btnNewButton_4.getText().equals(""))
		{
			System.out.println("2");
			fin=true;
			
		}
		if(btnNewButton_7.getText().equals(btnNewButton_8.getText())&&btnNewButton_7.getText().equals(btnNewButton_9.getText())&&!btnNewButton_7.getText().isEmpty()&& btnNewButton_8.getText().equals(btnNewButton_9.getText())&&!btnNewButton_7.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
		}
		
		//Vertical
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText())&&btnNewButton_1.getText().equals(btnNewButton_7.getText())&&!btnNewButton_1.getText().isEmpty()&&btnNewButton_4.getText().equals(btnNewButton_7.getText())&&!btnNewButton_1.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
			
		}
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText())&&btnNewButton_2.getText().equals(btnNewButton_8.getText())&&!btnNewButton_2.getText().isEmpty()&&btnNewButton_5.getText().equals(btnNewButton_8.getText())&&!btnNewButton_2.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
			
		}
		if(btnNewButton_3.getText().equals(btnNewButton_6.getText())&&btnNewButton_3.getText().equals(btnNewButton_9.getText())&&!btnNewButton_3.getText().isEmpty()&&btnNewButton_6.getText().equals(btnNewButton_9.getText())&&!btnNewButton_3.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
			
		}
		//Cruzados
		
		if(btnNewButton_1.getText().equals(btnNewButton_5.getText())&&btnNewButton_1.getText().equals(btnNewButton_9.getText())&&!btnNewButton_1.getText().isEmpty()&&btnNewButton_5.getText().equals(btnNewButton_9.getText())&&!btnNewButton_1.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
			
		}
		if(btnNewButton_3.getText().equals(btnNewButton_5.getText())&&btnNewButton_3.getText().equals(btnNewButton_7.getText())&&!btnNewButton_3.getText().isEmpty()&&btnNewButton_5.getText().equals(btnNewButton_7.getText())&&!btnNewButton_3.getText().equals(""))
		{
			System.out.println("3");
			fin=true;
		}
		
		Component [] elementos=panel.getComponents();
		if(fin)
		{
			JOptionPane.showMessageDialog(null,"Ganaste jugador:   "+ (turno ? "X":"O"), null, JOptionPane.WARNING_MESSAGE);
			for(int i=0; i<elementos.length;i++)
	    	{
	    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
	    		{
	    			JButton btn =((JButton)elementos[i]);
	    			btn.setText("");
	    			btn.setBackground(Color.white);
	    			btn.setEnabled(true);
	    			System.out.println("Reactivando botón " + i);
	    			equis++;
	    			circulo++;
	    		}
	    	}
			fin = false;
		}
		
		
		
		
		
	}

		
		/*if(btnNewButton_1.getText().equals(""))
		{
			//turno
			if(turno)
			{
				btnNewButton_1.setText("0");
				turno=false;
			}
			else
			{
				btnNewButton_1.setText("X");
				turno=true;
			}
			btnNewButton_1.setEnabled(false);
		}
		if(btnNewButton_2.getText().equals(""))
		{
			//turno
			if(turno)
			{
				btnNewButton_2.setText("0");
				turno=false;
			}
			else
			{
				btnNewButton_2.setText("X");
				turno=true;
			}
			btnNewButton_2.setEnabled(false);
		}
		if(btnNewButton_3.getText().equals(""))
		{
			//turno
			if(turno)
			{
				btnNewButton_3.setText("0");
				turno=false;
			}
			else
			{
				btnNewButton_3.setText("X");
				turno=true;
			}
			btnNewButton_3.setEnabled(false);
		}
		if(btnNewButton_4.getText().equals(""))
		{
			//turno
			if(turno)
			{
				btnNewButton_4.setText("0");
				turno=false;
			}
			else
			{
				btnNewButton_4.setText("X");
				turno=true;
			}
			btnNewButton_4.setEnabled(false);
		}*/
		
	    
		
	

}
