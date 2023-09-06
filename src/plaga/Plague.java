package plaga;

import planta.Plant;

public class Plague {
	private boolean activar;
	private Plant plantas;

	public void activarPlagas(boolean pActivar) {
		activar = pActivar;

		if (activar == true) {
			System.out.println("Las plagas están afectando a las plantas ");
			plantas.relacionConPlagas(true);
		} else {
			System.out.println("Las plagas han dejado de afectar las plantas");
			plantas.relacionConPlagas(false);
		}

	}
}
