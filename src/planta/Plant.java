package planta;

public class Plant {
	private String fruto;
	private String color;
	private boolean conPlagas;
	private String tipo;
	private String name;
	private boolean humedad;

	public Plant(String pFruto, String pName, String pColor, boolean pConPlagas, String pTipo) {
		name = pName;
		color = pColor;
		fruto = pFruto;
		tipo = pTipo;

		System.out.println("En el patio de la casa hay " + this.name + "s sin plagas");
	}

	public void Florecer() {
		if (tipo == "planta") {
			System.out.println("La planta " + this.name + " tiene flores de color " + color);
		}
		if (tipo == "arbol") {
			System.out.println("El árbol " + this.name + " tiene flores de color " + color);
		}
	}

	public void DarFruto() {
		if (tipo == "planta") {
			System.out.println("La planta " + this.name + " tiene frutos de " + fruto);
		}
		if (tipo == "arbol") {
			System.out.println("El árbol " + this.name + " tiene frutos de " + fruto);
		}

	}

	public void relacionConPlagas(boolean pConPlagas) {
		conPlagas = pConPlagas;
		if (conPlagas == true) {
			System.out.println("La planta " + this.name + " tiene plagas");
		} else {
			System.out.println("La planta " + this.name + " no tiene plagas, ha sido fumigada con exito");
		}
	}

	public void humedecer(boolean pHumedad) {
		humedad = pHumedad;
		if (humedad == false) {
			System.out.println("A las plantas les falta agua");

		} else {
			System.out.println("Las plantas han sidor regadas");
			humedad = true;
		}
	}

	public String getName() {
		return name;
	}

	public boolean getStatePlague() {
		return conPlagas;
	}

	public boolean getHumedad() {
		return humedad;
	}

}
