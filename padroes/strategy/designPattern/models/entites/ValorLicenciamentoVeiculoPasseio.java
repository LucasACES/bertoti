package designPattern.models.entites;

import designPattern.models.interfaces.ValorLicenciado;

public class ValorLicenciamentoVeiculoPasseio implements ValorLicenciado{

	@Override
	public void licenciamento() {
		System.out.println("Valor de R$ 300");
		
	}

}
