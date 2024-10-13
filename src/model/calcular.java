package model;

public class calcular {

	private int FaltaPermitida = 30;
	private int podeFaltar;

	public int calculaFaltas(int qntFaltas) {
		podeFaltar = FaltaPermitida- qntFaltas;
		return podeFaltar;
	}

	public int getPodeFaltar() {
		return podeFaltar;
	}

	public int getFaltaPermitida() {
		return FaltaPermitida;
	}

	public void setFaltaPermitida(int faltaPermitida) {
		FaltaPermitida = faltaPermitida;
	}

	public void setPodeFaltar(int podeFaltar) {
		this.podeFaltar = podeFaltar;
	}

}
