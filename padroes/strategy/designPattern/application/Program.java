package designPattern.application;

import designPattern.models.entites.Carro;
import designPattern.models.entites.ValorLicenciamentoVeiculoPasseio;

public class Program {

	public static void main(String[] args) {
		Carro car = new Carro();
		car.setValorLicenciado(new ValorLicenciamentoVeiculoPasseio());
		car.verValor();
		

	}

}
