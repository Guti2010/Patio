package herramienta;

public class Tool {
	private boolean activado;
	private String objetivo;
	private int tiempoFuncionamiento;
	private String accion;
	
	
	public Herramienta(String pFruto, String pFlor, String pcolor, boolean pConPlagas,String pTipo ) {
		locked = true;
		name = pName;
		cantidadAtaques = pAtaques;
		alcance = pAlcance;
		capacidadDestructiva = pCapacidad;
		
		System.out.println("Se inicializa el arma "+this.name+" bloqueda");
	}
	
	public void Florecer(int pCarga) {
		cantidadAtaques+=pCarga;
	}
	
	public void DarFruto() {
		if (cantidadAtaques>0 && !locked) {
			System.out.println("Weapon "+name+" shooting");
			cantidadAtaques--;
		}
		else {
			System.out.println("Weapon "+name+" NO HAY CARGA O ESTA CON SEGURO");
		}
	}

}
