package controlesPatio;


import planta.*;
import herramienta.*;
import plaga.*;
import suelo.*;
import cesped.*;

public class Patio {
	private boolean Electricidad;
	private boolean Agua;
	private Grass zacate;
	private Plague plagas;
	private Terreno suelo;
	private Aspersor aspersor1 = new Aspersor();
	private Podadora podador1 = new Podadora();
	private Fumigador fumigador1 = new Fumigador();
	
	
	public void ActivarDesactivarElectricidad(boolean pElectricidad) {
		Electricidad = pElectricidad;
	}

	public void ActivarDesactivarAgua(boolean pAgua) {
		Agua = pAgua;
	}
	
	
	public Plant[] crearPlantas() {
		Cerezo cerezo1  = new Cerezo();;
		Rosa rosa1 = new Rosa();;
		Manzano manzano1 = new Manzano();
		Tulipan tulipan1 = new Tulipan();
		Girasol girasol1 = new Girasol();
		Naranjo naranjo1 = new Naranjo();
		
		Plant todasPlantas[] = {cerezo1, rosa1, manzano1,tulipan1,girasol1,naranjo1};
		return todasPlantas;
		
	}
	
	public void crecercesped() {
		zacate.crecer(true);
	}
	
	public void inundarSuelo() {
		suelo.inundar(true);
	}
	public void filtrarrSuelo() {
		suelo.inundar(false);
		suelo.filtrarAgua();
		suelo.fertilizar(true);
	}
	
	public void enviarPlagas() {
		plagas.activarPlagas(true);
		for (Plant x: crearPlantas()){
			x.relacionConPlagas(true);
		}
		
	}
	
	public void cortarCesped(){
		podador1.Funcionar(Electricidad,Agua);
		podador1.podarCesped();
		podador1.dejarFuncionar();	
	}
	public void regarPatio(){
		aspersor1.Funcionar(Electricidad,Agua);
		aspersor1.regarCesped();
		for (Plant x: crearPlantas()){
			aspersor1.regarPlantas(x);
		}
		aspersor1.dejarFuncionar();	
	}
	public void fumigar(){
		fumigador1.Funcionar(Electricidad,Agua);
		
		for (Plant x: crearPlantas()){
			fumigador1.fumigar(x);
		}
		fumigador1.dejarFuncionar();	
	}
	
}

