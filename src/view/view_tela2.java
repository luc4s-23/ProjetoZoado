package view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class view_tela2 extends JFrame {
	private int podeFaltar;
	private ImageIcon foto = new ImageIcon("img/jesus.jpeg");
	private Image fotoRedi = foto.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
	private ImageIcon novaFoto = new ImageIcon(fotoRedi);

	public view_tela2(int podeFaltar) {
		super("Tela 2");

		JLabel labelFoto = new JLabel(novaFoto);

		JLabel totalAulas = new JLabel("Total de aulas: 120");
		totalAulas.setFont(new Font("Arial", Font.PLAIN, 25));
		JLabel frequenciaMin = new JLabel("Frequência mínima: 90");
		frequenciaMin.setFont(new Font("Arial", Font.PLAIN, 25));
		JLabel faltasPermitidas = new JLabel("Faltas permitidas: 30");
		faltasPermitidas.setFont(new Font("Arial", Font.PLAIN, 25));
		JLabel VocePodeFaltar = new JLabel("Você ainda pode faltar: " + podeFaltar);
		VocePodeFaltar.setFont(new Font("Arial", Font.PLAIN, 25));
		
		JPanel painel = new JPanel();
		painel.add(labelFoto);
		painel.add(totalAulas);
		painel.add(frequenciaMin);
		painel.add(faltasPermitidas);
		painel.add(VocePodeFaltar);

		add(painel);
		setSize(400, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public int getPodeFaltar() {
		return podeFaltar;
	}

	public void setPodeFaltar(int podeFaltar) {
		this.podeFaltar = podeFaltar;
	}
}
