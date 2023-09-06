package planta;
import java.util.ArrayList;
import controlesPatio.Util;
public class Plant {
	public ArrayList<String> tasks;
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

		Util.report("En el patio de la casa hay " + this.name + "s sin plagas");
	}

	public void Florecer() {
		if (tipo == "planta") {
			Util.report("La planta " + this.name + " tiene flores de color " + color);
		}
		if (tipo == "arbol") {
			Util.report("El árbol " + this.name + " tiene flores de color " + color);
		}
	}

	public void DarFruto() {
		if (tipo == "planta") {
			Util.report("La planta " + this.name + " tiene frutos de " + fruto);
		}
		if (tipo == "arbol") {
			Util.report("El árbol " + this.name + " tiene frutos de " + fruto);
		}

	}

	public void relacionConPlagas(boolean pConPlagas) {
		conPlagas = pConPlagas;
		if (conPlagas == true) {
			Util.report("La planta " + this.name + " tiene plagas");
		} else {
			Util.report("La planta " + this.name + " no tiene plagas, ha sido fumigada con exito");
		}
	}

	public void humedecer(boolean pHumedad) {
		humedad = pHumedad;
		if (humedad == false) {
			Util.report("A las plantas les falta agua");

		} else {
			Util.report("Las plantas han sidor regadas");
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
