package antiPattern.models.application;

import antiPattern.models.entities.ValorLicenciamentoGeral;
import antiPattern.models.entities.ValorLicenciamentoPasseio;

public class Program {

	public static void main(String[] args) {
		ValorLicenciamentoGeral car = new ValorLicenciamentoGeral("VW", "FOX" , 40.000, 7.00);
		ValorLicenciamentoPasseio car2 = new ValorLicenciamentoPasseio();
		car.ValorLicenciamento();
		car2.ValorLicenciamento();
		
	}

}
