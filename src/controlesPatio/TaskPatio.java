package controlesPatio;

public class TaskPatio implements ITask {
	Patio manager = new Patio();
	
	@Override
	public void execute(Action pAction) {
		if (pAction==Action.ActivarElectricidad) {
			manager.ActivarDesactivarElectricidad(true);
		}
		if (pAction==Action.DesactivarElectricidad) {
			manager.ActivarDesactivarElectricidad(false);
		}
		if (pAction==Action.ActivarAgua) {
			manager.ActivarDesactivarAgua(true);
		}
		if (pAction==Action.DesactivarAgua) {
			manager.ActivarDesactivarAgua(false);
		}
		
		if (pAction==Action.crearPlantas) {
			manager.crearPlantas();
		}
		if (pAction==Action.crecercesped) {
			manager.crecercesped();
		}
		if (pAction==Action.crearPlantas) {
			manager.crearPlantas();
		}
		if (pAction==Action.inundarSuelo) {
			manager.inundarSuelo();
		}
		
		if (pAction==Action.filtrarrSuelo) {
			manager.filtrarSuelo();
		}
		if (pAction==Action.enviarPlagas) {
			manager.enviarPlagas();
		}
		if (pAction==Action.cortarCesped) {
			manager.cortarCesped();
		}
		if (pAction==Action.regarPatio) {
			manager.regarPatio();
		}
		if (pAction==Action.fumigar) {
			manager.fumigar();
		}
	}
}
