import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private Dibujo panel_dibujo=new Dibujo();
	
	public Ventana() {
		super("Panel - KeyListener");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel_dibujo.setPreferredSize(new Dimension(100,100));

		add(panel_dibujo,BorderLayout.CENTER);
		addMouseListener(panel_dibujo);
		addKeyListener(panel_dibujo);
		Thread hilo =new Thread(panel_dibujo);
		hilo.start();

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ventana();
	}
	
}
