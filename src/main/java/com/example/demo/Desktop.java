package com.example.demo;

public class Desktop extends Dispositivo implements ComportamentoReproducaoDesktop{
	private ComportamentoReproducaoDesktop reproducaoDesktop;
	@Override
	public void reproduzir() {
		reproducaoDesktop.reproduzir();
		
	}

}
