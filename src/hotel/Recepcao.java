package hotel;

import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @author Davi Andrade Pontes - 119110411
 *
 */
public class Recepcao {
	private HashMap<String, Estadia> estadias;

	public Recepcao() {
		estadias = new HashMap<String, Estadia>();
	}

	public void checkIn(String nomeAnimal, String tipoAnimal, int idadeAnimal, int diasEstadia, Double valorEstadia) {
		estadias.put(nomeAnimal, new Estadia(nomeAnimal, tipoAnimal, idadeAnimal, diasEstadia, valorEstadia));
	}

	public void checkOut(String nomeAnimal) {
		estadias.remove(nomeAnimal);
	}

	public int getNumDeHospedes() {
		return this.estadias.size();
	}

	public double getLucroTotal() {
		double lucro = 0.0;

		Set<String> keys = estadias.keySet();

		for (String key : keys) {
			lucro += ((Estadia) estadias.get(key)).getValor();
		}

		return lucro;
	}

	@Override
	public String toString() {
		int contador = 1;
		String retorno = "Estadias:\n";

		Set<String> keys = estadias.keySet();

		for (String key : keys) {
			if (contador < estadias.size()) {
				retorno += ((Estadia) estadias.get(key)).getNome() + "(" + ((Estadia) estadias.get(key)).getTipo()
						+ "): " + ((Estadia) estadias.get(key)).getDias() + " dias com o preço de R% "
						+ ((Estadia) estadias.get(key)).getValor() + "\n";
			}

			else {
				retorno += ((Estadia) estadias.get(key)).getNome() + "(" + ((Estadia) estadias.get(key)).getTipo()
						+ "): " + ((Estadia) estadias.get(key)).getDias() + " dias com o preço de R% "
						+ ((Estadia) estadias.get(key)).getValor();
			}

			contador++;
		}

		return retorno;
	}
}
