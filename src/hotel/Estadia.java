package hotel;

/**
 * Laboratório de Programação 2 - Lab git
 * 
 * @author Bruno Andrade Fernandes - 119110378
 */
public class Estadia {
	private Animal animal;
	private Double valor;
	private int dias;

	public Estadia(String nome, String tipo, int idade, int dias, Double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public double getValor() {
		return this.valor;
	}

	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}

	public String toString() {
		return this.getNome() + ", " + this.getTipo() + ", " + this.dias + " dias com o preço de R$ " + this.getValor();
	}
}
