package antiPattern.models.entities;

public class ValorLicenciamentoGeral extends Carro{
	private Double taxa;

	public ValorLicenciamentoGeral(String marca, String modelo, Double preco, Double taxa) {
		super(marca, modelo, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public void ValorLicenciamento() {
		System.out.println(700 + taxa);
	}

}
