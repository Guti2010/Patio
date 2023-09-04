package herramienta;

import cesped.Grass;

public class Podadora extends Tool {
	private Tool currentTool;
	private Grass zacate;

	public Podadora() {
		super("Podador", "podar");
	}

	public void podarCesped() {
		boolean activado = currentTool.getActivacion();
		boolean cespedLargo = zacate.getLargo();
		if (activado == true) {
			if (cespedLargo == true) {
				zacate.crecer(false);
			} else {
				System.out.println("Aún no es necesario podar el pasto");

			}
		}

		else {
			System.out.println("No se puede ultilizar el podador");
		}
	}
}
