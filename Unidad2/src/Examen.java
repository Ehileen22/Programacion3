import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Examen extends JFrame {
	public Examen()
	{
		
		this.setSize(660, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("EXAMEN");
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
		this.examen();
		this.repaint();
		this.validate();
	}
	public void examen()
	{
		JPanel facturaPanel= new JPanel();
		facturaPanel.setSize(this.getWidth(),this.getHeight());
		facturaPanel.setLocation(0, 0);
		facturaPanel.setBackground(Color.white);
		facturaPanel.setLayout(null);
		
		//titulo
		
		
		
		JLabel title=new JLabel("     Factura en Java - NetBeans - ArrayList y POO");
		title.setSize(660, 50);
		title.setFont(new Font("Georgia",Font.BOLD ,20));
		title.setForeground(Color.white);
		title.setLocation(0, 0);
		title.setOpaque(false);
		title.setBackground(new Color(23, 110, 167));
		facturaPanel.add(title);
		
		JLabel sinBase=new JLabel("          [Sin Base de datos]");
		sinBase.setSize(650, 40);
		sinBase.setFont(new Font("Georgia",Font.PLAIN ,14));
		sinBase.setForeground(Color.white);
		sinBase.setLocation(0, 25);
		sinBase.setOpaque(false);
		facturaPanel.add(sinBase);
		
		JLabel fondo=new JLabel();
		fondo.setSize(650,75);
		fondo.setLocation(0, 0);
		fondo.setOpaque(true);
		fondo.setBackground(new Color(23, 110, 167));
		facturaPanel.add(fondo);
		
		
		//Datos del cliente
		JLabel datos=new JLabel("Datos del cliente");
		datos.setFont(new Font("Georgia",Font.PLAIN ,17));
		datos.setForeground(Color.black);
		datos.setSize(130,15);
		datos.setLocation(17, 83);
		datos.setOpaque(true);
		datos.setBackground(Color.white);
		facturaPanel.add(datos);
		
		JPanel panelClientes= new JPanel();
		panelClientes.setSize(622,95);
		panelClientes.setLocation(10, 90);
		panelClientes.setBackground(Color.white);
		panelClientes.setBorder(BorderFactory.createLineBorder(new Color(221, 222, 223), 2));
		panelClientes.setLayout(null);
		
		JLabel doc=new JLabel("Documento: ");
		doc.setBounds(27,15, 100, 30);
		doc.setFont(new Font("Georgia",Font.PLAIN ,17));
		panelClientes.add(doc);
		
		JTextField docResponse = new JTextField("123456");
		docResponse.setBounds(145,20, 130, 23);
		docResponse .setFont(new Font("Marker felt",Font.PLAIN ,17));
		panelClientes.add(docResponse );
		
		JLabel nombres=new JLabel("Nombres: ");
		nombres.setBounds(320,20, 100, 20);
		nombres.setOpaque(false);
		nombres.setFont(new Font("Georgia",Font.PLAIN ,17));
		nombres.setForeground(Color.black);
		panelClientes.add(nombres);
		
		JTextField nomResponse = new JTextField("Jhoe Doe");
		nomResponse.setBounds(420,20, 170, 23);
		nomResponse .setFont(new Font("Marker felt",Font.PLAIN ,15));
		panelClientes.add(nomResponse);
		
		JLabel dire=new JLabel("Dirección: ");
		dire.setBounds(27,55, 100, 30);
		dire.setFont(new Font("Georgia",Font.PLAIN ,17));
		panelClientes.add(dire);
		
		JTextField direResponse = new JTextField("Calle 1 # 123");
		direResponse.setBounds(145,60, 130, 23);
		direResponse .setFont(new Font("Marker felt",Font.PLAIN ,17));
		panelClientes.add(direResponse );
		
		JLabel tel=new JLabel("Teléfono: ");
		tel.setBounds(320,60, 100, 20);
		tel.setOpaque(false);
		tel.setFont(new Font("Georgia",Font.PLAIN ,17));
		tel.setForeground(Color.black);
		panelClientes.add(tel);
		
		JTextField telResponse = new JTextField("5554433");
		telResponse.setBounds(420,60, 170, 23);
		telResponse .setFont(new Font("Marker felt",Font.PLAIN ,15));
		panelClientes.add(telResponse);
		
		//datos de factura
		JLabel datosFact=new JLabel("Datos de factura");
		datosFact.setFont(new Font("Georgia",Font.PLAIN ,17));
		datosFact.setForeground(Color.black);
		datosFact.setSize(130,15);
		datosFact.setLocation(17, 193);
		datosFact.setOpaque(true);
		datosFact.setBackground(Color.white);
		facturaPanel.add(datosFact);
		
		JPanel panelFactura= new JPanel();
		panelFactura.setSize(622,75);
		panelFactura.setLocation(10, 200);
		panelFactura.setBackground(Color.white);
		panelFactura.setBorder(BorderFactory.createLineBorder(new Color(221, 222, 223), 2));
		panelFactura.setLayout(null);
		
		JLabel noFact=new JLabel("N° Factura: ");
		noFact.setForeground(Color.black);
		noFact.setBounds(27,20, 100, 30);
		noFact.setFont(new Font("Georgia",Font.PLAIN ,17));
		panelFactura.add(noFact);
		
		
		JLabel nu=new JLabel("1");
		nu.setBounds(150,25, 100, 20);
		nu.setOpaque(false);
		nu.setFont(new Font("Marker felt",Font.BOLD ,17));
		nu.setForeground(Color.black);
		panelFactura.add(nu);
	
		
		JLabel fecha=new JLabel("Fecha: ");
		fecha.setForeground(Color.black);
		fecha.setBounds(323,20, 100, 30);
		fecha.setFont(new Font("Georgia",Font.PLAIN ,17));
		panelFactura.add(fecha);
	
		
		JLabel fechaResp=new JLabel("2021/50/21 ");
		fechaResp.setBounds(400,25, 100, 20);
		fechaResp.setOpaque(false);
		fechaResp.setFont(new Font("Marker felt",Font.BOLD ,17));
		fechaResp.setForeground(Color.black);
		panelFactura.add(fechaResp);
		
	
		
		//listado de facturas
		JPanel listado= new JPanel();
		listado.setBounds(10,290,622,48);
		listado.setBackground(Color.white);
		listado.setBorder(BorderFactory.createLineBorder(new Color(221, 222, 223), 2));
		listado.setLayout(null);
		
		JButton ver= new JButton("      Ver listado de facturas");
		ver.setBounds(10,5, 250, 40);
		ver.setFont(new Font("Georgia",Font.PLAIN ,17));
		ver.setForeground(Color.black);
		ver.setBorderPainted(false);
		ver.setOpaque(true);
		ver.setBackground(Color.white);
		listado.add(ver);
		
		JLabel logoVer=new JLabel();
		logoVer.setIcon(new ImageIcon(getClass().getResource("list.png")));
		logoVer.setBounds(2, 2, 25, 25);
		ver.add(logoVer);
		
		JButton anadir= new JButton("      Añadir");
		anadir.setForeground(Color.black);
		anadir.setBounds(350,5, 130, 40);
		anadir.setFont(new Font("Georgia",Font.PLAIN ,17));
		anadir.setBorderPainted(false);
		anadir.setOpaque(true);
		anadir.setBackground(Color.white);
		listado.add(anadir);
		
		JLabel logoAdd=new JLabel();
		logoAdd.setIcon(new ImageIcon(getClass().getResource("addIcon.png")));
		logoAdd.setBounds(2, 1, 25, 25);
		anadir.add(logoAdd);
		
		JButton eliminar= new JButton("      Eliminar");
		eliminar.setForeground(Color.black);
		eliminar.setBounds(480,5, 130, 40);
		eliminar.setFont(new Font("Georgia",Font.PLAIN ,17));
		eliminar.setBorderPainted(false);
		eliminar.setOpaque(true);
		eliminar.setBackground(Color.white);
		listado.add(eliminar);

		JLabel logoEli=new JLabel();
		logoEli.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
		logoEli.setBounds(2, 2, 20, 20);
		eliminar.add(logoEli);
		
		//Cuadro
		String tableTitle[]={"Producto", "Cantidad", "Valor", "Sub Total"};
		String tableData[][]={
							{"Agua", "2", "500", "1000.0"},
							{"Cereal", "5", "1000", "5000.0"},
							{"Leche", "2", "300", "600.0"}};                           
		                               
		JTable productoTable= new JTable(tableData, tableTitle);
		productoTable.setAlignmentX(LEFT_ALIGNMENT);
		JScrollPane tableScroll=new JScrollPane(productoTable);
		tableScroll.setBounds(10,355,622,100);
		
		
		

		//subtotal y demas
		JLabel sub=new JLabel("Subtotal: ");
		sub.setFont(new Font("Georgia",Font.PLAIN ,17));
		sub.setForeground(Color.black);
		sub.setSize(110,15);
		sub.setLocation(28, 480);
		sub.setOpaque(false);
		facturaPanel.add(sub);
		
		JLabel subResp=new JLabel("6600.0");
		subResp.setForeground(Color.black);
		subResp.setBounds(145,470, 100, 30);
		subResp.setFont(new Font("Marker Felt",Font.BOLD ,17));
		facturaPanel.add(subResp);
		
		JLabel desc=new JLabel("% Descuento: ");
		desc.setFont(new Font("Georgia",Font.PLAIN ,17));
		desc.setForeground(Color.black);
		desc.setBounds(28, 515,110,15);
		desc.setOpaque(false);
		facturaPanel.add(desc);
		
		JTextField desResp=new JTextField("5");
		desResp.setForeground(Color.black);
		desResp.setBounds(145,507, 60, 30);
		desResp.setFont(new Font("Marker Felt",Font.PLAIN ,17));
		facturaPanel.add(desResp);
		
		JCheckBox item= new JCheckBox();
		item.setBounds(205,498,60,50);
		item.setHorizontalAlignment(0);
		item.setOpaque(true);
		item.setBackground(Color.white);
		facturaPanel.add(item);
		
		JLabel valor=new JLabel("Valor descontado: ");
		valor.setFont(new Font("Georgia",Font.PLAIN ,17));
		valor.setForeground(Color.black);
		valor.setBounds(280, 515,150,15);
		valor.setOpaque(false);
		facturaPanel.add(valor);
		
		JLabel valorResp=new JLabel("330.0");
		valorResp.setForeground(Color.black);
		valorResp.setBounds(440,507, 60, 30);
		valorResp.setFont(new Font("Marker Felt",Font.BOLD ,17));
		facturaPanel.add(valorResp);
		
		JLabel iva=new JLabel("IVA 19%: ");
		iva.setFont(new Font("Georgia",Font.PLAIN ,17));
		iva.setForeground(Color.black);
		iva.setBounds(28, 550,110,15);
		iva.setOpaque(false);
		facturaPanel.add(iva);
		
		JLabel ivaResp=new JLabel("1254.0");
		ivaResp.setBounds(145,540, 60, 30);
		ivaResp.setFont(new Font("Marker Felt",Font.BOLD ,17));
		ivaResp.setForeground(Color.black);
		facturaPanel.add(ivaResp);
		
		JLabel total=new JLabel("Total Factura: ");
		total.setFont(new Font("Georgia",Font.PLAIN ,17));
		total.setForeground(Color.black);
		total.setBounds(28, 585,120,15);
		total.setOpaque(false);
		facturaPanel.add(total);
		
		JLabel totalResp=new JLabel("7524.0");
		totalResp.setBounds(145,575, 60, 30);
		totalResp.setFont(new Font("Marker Felt",Font.BOLD ,17));
		totalResp.setForeground(Color.black);
		facturaPanel.add(totalResp);
		
				
		JButton fin= new JButton("Finalizar factura");
		fin.setForeground(Color.black);
		fin.setBounds(330,600, 170, 30);
		fin.setFont(new Font("Georgia",Font.PLAIN ,17));
		fin.setBorderPainted(true);
		fin.setOpaque(true);
		fin.setBackground(new Color(195, 227, 248));
		fin.setBorder(BorderFactory.createLineBorder(new Color(11, 118, 188), 2));
		facturaPanel.add(fin);
		
		JButton limpiar= new JButton("Limpiar");
		limpiar.setForeground(Color.black);
		limpiar.setBounds(510,600, 100, 30);
		limpiar.setFont(new Font("Georgia",Font.PLAIN ,17));
		limpiar.setBorderPainted(true);
		limpiar.setOpaque(true);
		limpiar.setBackground(new Color(214, 220, 223));
		limpiar.setBorder(BorderFactory.createLineBorder(new Color(177, 177, 177), 2));
		facturaPanel.add(limpiar);
		
		JLabel fondo2=new JLabel();
		fondo2.setBounds(0,645,660, 20);
		fondo2.setOpaque(true);
		fondo2.setBackground(new Color(23, 110, 167));
		facturaPanel.add(fondo2);
		
		//añadiduras
		facturaPanel.add(tableScroll);
		facturaPanel.add(panelFactura);
		facturaPanel.add(panelClientes);
		facturaPanel.add(listado);
		this.add(facturaPanel);
		
		
	}

}
