package cesped;

public class Grass {
	private int longtud;
	private boolean largo;
	
	public void crecer(int pCarga) {
		cantidadAtaques+=pCarga;
	}
	
	public void secarse() {
		if (cantidadAtaques>0 && !locked) {
			System.out.println("Weapon "+name+" shooting");
			cantidadAtaques--;
		}
		else {
			System.out.println("Weapon "+name+" NO HAY CARGA O ESTA CON SEGURO");
		}
	}
	
}
