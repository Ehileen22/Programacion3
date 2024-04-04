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
import java.util.Timer;
import java.util.TimerTask;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

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

	
	private JButton button= new JButton();
	private static final long serialVersionUID = 1L;
	private final JPanel panel_1 = new JPanel();
	private JPanel panel = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private JLabel tiempo= new JLabel("", SwingConstants.LEFT);
	private final JButton reiniciar = new JButton("Reiniciar tablero");
	private JLabel etiquetaContador = new JLabel();
	private String btns[]={"1","2","3","4","5","6","7","8","9","10","11","12", "13", "14", "15"," "};
	private String btns2[]={"1","2","3","4","5","6","7","8","9","10","11","12", "13", "14", "15"," "};
	private LocalTime currentTime = LocalTime.now();
	private Timer timer;
	private int contadorJugadas=0;
	private LocalTime tiempoInicio;
	private boolean seguir=true;
	private TimerTask timerTask;
	private boolean pausaJuego;
	private boolean juegoPausado = false;
	private LocalTime tiempoPausado;
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
		
		JFrame frmRompecabezas=new JFrame();
		frmRompecabezas.setTitle("Rompecabezas");
		frmRompecabezas.setBounds(100, 100, 400,500);
		frmRompecabezas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRompecabezas.getContentPane().setLayout(new BorderLayout());
		frmRompecabezas.setVisible(true);
		LocalTime iniciar= LocalTime.now();
		
		JLabel lblNewLabe2 = new JLabel("   ");
		JLabel lblNewLabel3 = new JLabel("   ");
		etiquetaContador.setText("Contador de jugadas: " + contadorJugadas);
		
		panel_1.setBackground(new Color(164, 224, 193 ));
		panel_2.setBackground(new Color(164, 224, 193 ));
		panel_3.setBackground(new Color(164, 224, 193 ));
		panel_4.setBackground(new Color(164, 224, 193 ));
		
		frmRompecabezas.getContentPane().add(panel_1,BorderLayout.NORTH);
		frmRompecabezas.getContentPane().add(panel,BorderLayout.CENTER);
		frmRompecabezas.getContentPane().add(panel_3,BorderLayout.WEST);
		frmRompecabezas.getContentPane().add(panel_4,BorderLayout.EAST);
		
		
		panel_4.setBackground(new Color(164, 224, 193 ));
		tiempo.setVerticalAlignment(SwingConstants.BOTTOM);

		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		etiquetaContador.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(etiquetaContador);
		panel_1.add(tiempo);
		
		JButton pausa= new JButton("   Pausa   ");
		pausa.setPreferredSize(new Dimension(100,30));
		pausa.setBackground(new Color(21, 117, 179));
		pausa.setForeground(Color.white);
		pausa.setBorderPainted(true);
		pausa.setBorder(BorderFactory.createLineBorder(new Color(0, 53, 88),2));
		panel_2.add(pausa);
		pausa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Component [] elementos=panel.getComponents();
				for(int i=0; i<elementos.length;i++)
		    	{
		    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
		    		{
		    			JButton button=(JButton)elementos[i];
		    			button.setEnabled(false);
		    							    		
		    		}
		    	}
				pausaJuego();
					
			}
			
		});
		
		reiniciar.setPreferredSize(new Dimension(100,30));
		reiniciar.setBackground(new Color(129, 245, 182));
		reiniciar.setForeground(new Color(0, 0, 0));
		reiniciar.setBorderPainted(true);
		reiniciar.setBorder(BorderFactory.createLineBorder(new Color(0, 53, 88),2));
		
		panel_2.add(reiniciar);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
	
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
		
		
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contadorJugadas=0;
				etiquetaContador.setText("Contador de Jugadas: "+contadorJugadas);
				
				Collections.shuffle(Arrays.asList(btns));
				Component [] elementos=panel.getComponents();
				for(int i=0; i<elementos.length;i++)
		    	{
		    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
		    		{
		    			JButton button=(JButton)elementos[i];
		    			button.setText(btns[i]);
		    			button.setBackground(Color.white);
		    			button.setEnabled(true);
		    							    		
		    		}
		    	}
				tiempoInicio = LocalTime.now();
					
								
			}
			
			
		});
		frmRompecabezas.getContentPane().add(panel_2,BorderLayout.SOUTH);
		JButton reanudar= new JButton("Reanudar");
		panel_2.add(reanudar);
		reanudar.setPreferredSize(new Dimension(100,30));
		reanudar.setBackground(new Color(21, 117, 179));
		reanudar.setForeground(Color.white);
		reanudar.setBorderPainted(true);
		reanudar.setBorder(BorderFactory.createLineBorder(new Color(0, 53, 88),2));
		
		reanudar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Component [] elementos=panel.getComponents();
				for(int i=0; i<elementos.length;i++)
		    	{
		    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
		    		{
		    			JButton button=(JButton)elementos[i];
		    			button.setEnabled(true);
		    							    		
		    		}
		    	}
				reanudarJuego();
					
			}
			
		});
		temporizador();		    
	}
	
	public void click(JButton button) {	

		Component [] elementos=panel.getComponents();
		int contador=-1;
		for(int i=0; i<elementos.length;i++)
    	{
			if(elementos[i]==button)
			{
				contador=i;
				break;
			}
			
    	}
		
		
		
		JButton cambio=null;
		//Arriba
		if(contador-4>=0 && ((JButton) elementos[contador-4]).getText().equals(" "))
		{
			cambio=(JButton)elementos[contador-4];
		}
		//abajo
		else if(contador+4< elementos.length && ((JButton) elementos[contador+4]).getText().equals(" "))
		{
			cambio=(JButton)elementos[contador+4];
		}
		//izquierda
		else if(contador%4!=0 &&((JButton) elementos[contador-1]).getText().equals(" "))
		{
			cambio=(JButton)elementos[contador-1];
		}
		//derecha
		else if((contador+1)%4!=0 &&((JButton) elementos[contador+1]).getText().equals(" "))
		{
			cambio=(JButton)elementos[contador+1];
		}
		
		if(cambio!=null)
		{
			String newText= button.getText();
			button.setText(cambio.getText());
			cambio.setText(newText);
			contadorJugadas++;
			etiquetaContador.setText("Contador de Jugadas: "+contadorJugadas);
			finJuego();
		}
	    
	   //Intercambio
		/*if(button.getText().equals("1"))
		{
			button.setBackground(Color.red);
		}*/
	}
	
	public void finJuego() {
		
		Component [] elementos=panel.getComponents();
		String[] arregloAhora=new String[16];
		
		for(int i=0; i<elementos.length;i++)
		{
			arregloAhora[i]=((JButton)elementos[i]).getText();
		}
		if(Arrays.equals(btns2, arregloAhora))
		{
			pausaJuego();
			JOptionPane.showMessageDialog(null,"Ganaste!!!"+"\n"+tiempo.getText(), null, JOptionPane.WARNING_MESSAGE);
			Collections.shuffle(Arrays.asList(btns));
			contadorJugadas=0;
			etiquetaContador.setText("Contador de Jugadas: "+contadorJugadas);
			for(int i=0; i<elementos.length;i++)
	    	{
	    		if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
	    		{
	    			JButton button=(JButton)elementos[i];
	    			button.setText(btns[i]);
	    			button.setBackground(Color.white);	
	    			
	    						    		
	    		}
	    	}
			 
		    
		        
			
			
			
			
		}
		
		/*for(int i=0; i<elementos.length-1;i++)
    	{
			JButton button=(JButton) elementos[i];
			int
			if(elementos[i]==button)
			{
				contador=i;
				break;
			}
			
    	}*/
		
	}
	public void temporizador()
	{
		tiempoInicio = LocalTime.now();
		TimerTask task = new TimerTask() {
            @Override
            public void run() {
            	
            	if (!juegoPausado) {
            		LocalTime tiempoActual = LocalTime.now();
            		if(tiempoPausado!=null)
            		{
            			
						long pausaDuracion = tiempoPausado.until(tiempoActual, ChronoUnit.MILLIS);
                        tiempoInicio = tiempoInicio.plus(pausaDuracion, ChronoUnit.MILLIS);
                        tiempoPausado = null;
            		}
	              
	                long miliTranscurridos= tiempoInicio.until(tiempoActual, ChronoUnit.MILLIS);
	                long segundosTranscurridos=miliTranscurridos/1000;
	                long horas =segundosTranscurridos/3600;
	                long minutos=(segundosTranscurridos%3600)/60;
	                long segundos= segundosTranscurridos%60;
	                long milisegundos=miliTranscurridos%1000;
	                String milisegundosStr=String.format("%03d", milisegundos);
	                milisegundosStr=milisegundosStr.substring(0, 2);
	                tiempo.setText(String.format("Tiempo: %02d:%02d:%02d:%s", horas, minutos, segundos, milisegundosStr));
            	}
            	
            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 0,100);
	
	}
	private void pausaJuego() {
        juegoPausado=true;
        tiempoPausado=LocalTime.now();
    }

    private void reanudarJuego() {
        juegoPausado=false;
    }
    
		
		
		
		
	

		
		
		
	    
		
	

}
