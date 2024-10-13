package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class view_tela3 extends JFrame {

	private ImageIcon foto = new ImageIcon("img/madruga.jpg");
	private Image fotoRedi = foto.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
	private ImageIcon novaFoto = new ImageIcon(fotoRedi);

	public view_tela3() {
		super();

		JLabel labelFoto = new JLabel(novaFoto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(labelFoto);
		setSize(350,350);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new view_tela3();
	}
}
