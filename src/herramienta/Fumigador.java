package herramienta;

import planta.Plant;
import plaga.Plague;

public class Fumigador extends Tool {
	private Tool currentTool;
	private Plant Plantas;
	private Plague plagas;

	public Fumigador() {
		super("Fumigador", "fumigar");
	}

	public void regarCesped() {
		boolean activado = currentTool.getActivacion();
		boolean plagasActivadas = Plantas.getStatePlague();
		if (activado == true) {
			if (plagasActivadas == true) {
				Plantas.relacionConPlagas(false);
				plagas.activarPlagas(false);
			} else {
				System.out.println("Las plantas no tienen plagas, no es neceario la fumigación");

			}
		}

		else {
			System.out.println("No se puede ultilizar el fumigador");
		}
	}

}
