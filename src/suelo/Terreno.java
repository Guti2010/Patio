package suelo;

public class Terreno {
	private int extension;
	private boolean aptoParaPlantar;
	private boolean fertil;

	public void asignarMetros(int pExtension) {
		extension = pExtension;
		System.out.println("La extesnión del terreno es de " + extension + " metros");
	}

	public void fertilizar(boolean pFertil) {
		fertil = pFertil;
		if (fertil == true) {
			System.out.println("El terreno es fertil");
		} else {
			System.out.println("El terreno es infertil");
		}
	}

	public void poderPlantar(boolean pInundado) {
		aptoParaPlantar = pInundado;
		if (aptoParaPlantar == true) {
			System.out.println("Se puede plantar en el terreno, no está inundado");
		} else {
			System.out.println("El terreno está inundado, no se puede plantar");
		}
	}

	public void filtrarAgua() {
		if (aptoParaPlantar == false) {
			System.out.println("El agua ha sido filtrada por el terreno");
			aptoParaPlantar = true;
		} else {
			System.out.println("El agua ya está filtrada, el terreno es apto para plantar.");
		}
	}
}