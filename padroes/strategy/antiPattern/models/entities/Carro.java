package antiPattern.models.entities;

public abstract class Carro{
	
	
	private String marca;
	private String modelo;
	private Double preco;
	
	
	public Carro() {
	}

	public Carro(String marca, String modelo, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;

		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

	public void ValorLicenciamentoTeste() {
		System.out.println("500");
		
	}


	@Override
	public String toString() {
		return "Carro [valorLicenciado=" +", marca=" + marca + ", modelo=" + modelo + ", preco="
				+ preco + "]";
	}

	public void ValorLicenciamento() {
		// TODO Auto-generated method stub
		
	}
}