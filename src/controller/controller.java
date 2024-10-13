package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.calcular;
import view.view_tela1;
import view.view_tela2;
import view.view_tela3;

public class controller {

	private view_tela1 view1 = new view_tela1();

	private calcular calcular = new calcular();

	public controller() {
		this.view1.addCalculaListenner(new CalcularListtenner());
		this.view1.setVisible(true);
	}

	class CalcularListtenner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {

				int faltasRestantes = calcular.calculaFaltas(view1.getQntFaltas());
				
				if(view1.getQntFaltas() < 30) {
					view_tela2 view2 = new view_tela2(faltasRestantes);
				}else {
					view_tela3 view3 = new view_tela3();
				}
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

	public static void main(String[] args) {
		new controller();
	}

}
