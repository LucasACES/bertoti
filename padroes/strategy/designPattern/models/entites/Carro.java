package designPattern.models.entites;

import designPattern.models.interfaces.ValorLicenciado;

public  class Carro{
	
	private ValorLicenciado valorLicenciado;
	
	private String marca;
	private String modelo;
	private Double preco;
	
	
	public Carro() {
	}

	public Carro(String marca, String modelo, Double preco, ValorLicenciado x) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.valorLicenciado = x;
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
	

	public ValorLicenciado getValorLicenciado() {
		return valorLicenciado;
	}

	public void setValorLicenciado(ValorLicenciado valorLicenciado) {
		this.valorLicenciado = valorLicenciado;
	}
	
	public void verValor() {
		this.valorLicenciado.licenciamento();
		
	}

	@Override
	public String toString() {
		return "Carro [valorLicenciado=" + valorLicenciado + ", marca=" + marca + ", modelo=" + modelo + ", preco="
				+ preco + "]";
	}



	
	
}
