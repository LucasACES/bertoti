package dsignPattern.models.entities;

import designPattern.models.interfaces.ValorLicenciado;

public class ValorLicenciadoVeiculoGrande implements ValorLicenciado {

	@Override
	public void licenciamento() {
		System.out.println("Valor de R$ 800,00");
		
	}
	
}
