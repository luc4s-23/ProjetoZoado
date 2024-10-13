package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class view_tela1 extends JFrame {

	private JLabel placeholder = new JLabel("Digite a quantidade de faltas:");
	private JTextField qntFaltas = new JTextField(15);
	private JButton btnEnviar = new JButton("Calcular");

	public view_tela1() {
		super("Tela 1");

		JPanel painel = new JPanel();

		painel.add(placeholder);
		painel.add(qntFaltas);
		painel.add(btnEnviar);

		add(painel);

		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public int getQntFaltas() {
		return Integer.parseInt(qntFaltas.getText());
	}
	
	public void addCalculaListenner(ActionListener listenner) {
		btnEnviar.addActionListener(listenner);
	}
}
