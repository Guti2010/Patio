package herramienta;

import cesped.Grass;
import planta.Plant;

public class Aspersor extends Tool {
	private Tool currentTool;
	private Grass zacate;
	private Plant Plantas;

	public Aspersor() {
		super("Aspersor", "regar");
	}

	public void regarCesped() {
		boolean activado = currentTool.getActivacion();
		boolean cespedHumedo = zacate.getHumedad();
		if (activado == true) {
			if (cespedHumedo == false) {
				zacate.humedecer(true);
			} else {
				System.out.println("Aún no es necesario regar el pasto");
			}
		} else {
			System.out.println("No se puede ultilizar el aspersor");
		}

	}

	public void regarPlantas() {
		boolean activado = currentTool.getActivacion();
		boolean plantasConAgua = Plantas.getHumedad();
		if (activado == true) {
			if (plantasConAgua == false) {
				Plantas.humedecer(true);
			} else {
				System.out.println("Aún no es necesario regar las plantas");

			}
		}

		else {
			System.out.println("No se puede ultilizar el aspersor");
		}
	}

}
