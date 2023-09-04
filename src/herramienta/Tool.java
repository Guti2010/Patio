package herramienta;

public class Tool {
	private String funcion;
	private String name;
	private boolean activado;
	private boolean electricidad;
	private boolean agua;

	public Tool(String pNmae, String pFuncion) {
		funcion = pFuncion;
		name = pNmae;

		System.out.println("En el patio de la casa hay " + name + "es para " + funcion);
	}

	public void ActivarDesactivarElectricidad(boolean pElectricidad) {
		electricidad = pElectricidad;
	}

	public void ActivarDesactivarAgua(boolean pAgua) {
		agua = pAgua;
	}

	public void Funcionar() {
		if (electricidad == true && name != "Aspesor") {
			System.out.println("En el patio de la casa se pueden usar los dispositivos");
			activado = true;
		} else {
			if (electricidad == true && agua == true) {
				System.out.println("En el patio de la casa se pueden usar los dispositivos");
				activado = true;
				return;
			} else {
				System.out.println("En el patio de la casa no se pueden usar los dispositivos");
				activado = false;
				return;
			}
		}

	}

	public void dejarFuncionar() {
		if (activado == true) {
			System.out.println("En el patio de la casa se han desactivado los dispositivos");
			activado = false;
		} else {
			System.out.println("En el patio de la casa los dispositivos no están activos");
		}

	}

	public String getHerramienta() {
		return name;
	}

	public String getFuncion() {
		return funcion;
	}

	public boolean getActivacion() {
		return activado;
	}

}
