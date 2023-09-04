package cesped;

public class Grass {
	private boolean humedad;
	private boolean largo;

	public void crecer(boolean pLargo) {
		largo = pLargo;
		if (largo == true) {
			System.out.println("El cesped ha crecido mucho");

		} else {
			System.out.println("El cesped ha sido podado");
			largo = false;
		}
	}

	public void humedecer(boolean pHumedad) {
		humedad = pHumedad;
		if (humedad == false) {
			System.out.println("El cesped está seco");

		} else {
			System.out.println("El cescped ha sido regado");
			humedad = true;
		}
	}

	public boolean getHumedad() {
		return humedad;
	}

	public boolean getLargo() {
		return largo;
	}

}
