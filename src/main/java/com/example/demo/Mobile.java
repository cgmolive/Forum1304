package com.example.demo;

public class Mobile extends Dispositivo implements ComportamentoReproducaoMobile {

	private ComportamentoReproducaoMobile reproducaoMobile;
	@Override
	public void reproduzir() {
		reproducaoMobile.reproduzir();
		
	}
	
}
