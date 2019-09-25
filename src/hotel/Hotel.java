package hotel;

/**
 * 
 * @author Davi Andrade Pontes - 119110411
 *
 */
public class Hotel {
	Recepcao recepcao;

	public Hotel() {
		this.recepcao = new Recepcao();
	}

	public void checkin(String nome, String tipo, int idade, int dias, double valor) {
		recepcao.checkIn(nome, tipo, idade, dias, valor);
	}

	public void checkOut(String nome) {
		recepcao.checkOut(nome);
	}

	public int getNumHospedes() {
		return recepcao.getNumDeHospedes();
	}

	public double getLucroTotal() {
		return recepcao.getLucroTotal();
	}

	@Override
	public String toString() {
		return recepcao.toString();
	}
}
