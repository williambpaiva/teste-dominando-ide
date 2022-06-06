
public class Carro {
	
	private String marca;
	private boolean ligado;
	
	public Carro(String marca, boolean ligado) {//método construtor
		this.marca = marca;
		this.ligado = ligado;
	}
	
	public String getMarca() { //retorna valor do atributo privado 'marca'
		return marca;
	}

	public void setMarca(String marca) { //altera valor de 'marca'
		this.marca = marca;
	}
	
	public boolean isLigado() {//retorna valor do atributo privado 'ligado'
		return ligado;
	}
	
	public void setLigado(boolean ligado) {//altera valor de 'ligado'
		this.ligado = ligado;
	}
	
	public static void main(String [] args) {
		Carro meuCarro = new Carro("Ford", false); //instancia Carro
		System.out.println("Marca: " + meuCarro.getMarca()); //retorna valor
		System.out.println("Ligado: " + (meuCarro.isLigado()==true?"Ligado":"Desligado"));
		
		meuCarro.setMarca("Renault"); //altera valor de atributo privado
		meuCarro.setLigado(true); //altera valor de atributo privado
		
		System.out.println("Marca: " + meuCarro.getMarca()); //retorna valor
		System.out.println("Ligado: " + (meuCarro.isLigado()==true?"Ligado":"Desligado"));
	}
}
