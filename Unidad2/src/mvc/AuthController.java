package mvc;

import javax.swing.JFrame;

public class AuthController {
	private JFrame frame;
	private AuthView view;
	public AuthController()
	{
		frame=new JFrame();
		
		frame.setBounds(120, 50,750, 650);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		view=new AuthView();
	}
	public void login()
	{
		frame.add(view.login());
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}
