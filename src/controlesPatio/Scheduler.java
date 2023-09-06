package controlesPatio;


import java.util.Date;
import java.util.ArrayList;

public class Scheduler extends Thread {
	private ArrayList<Task> listatest = new ArrayList<Task>();
	private TaskPatio patioManager;
	
	public void TestPlan() {
		listatest = new ArrayList<Task>();
		patioManager = new TaskPatio();
	}
	
	public void loadTests() {
		// 06:00
		listatest.add(new Task(new Date(), patioManager, Action.ActivarElectricidad));
		listatest.add(new Task(new Date(), patioManager, Action.ActivarAgua));
		
		// 06:30
		//test.add(new Test(new Date(), devicesManager, Action.quitarElectricidad));
		
		// 07:00
		listatest.add(new Task(new Date(), patioManager, Action.crearPlantas));
	
		// 07:30
		listatest.add(new Task(new Date(), patioManager, Action.regarPatio));
				
		// 10:45
		listatest.add(new Task(new Date(), patioManager, Action.enviarPlagas));
				
		// 12:10
		listatest.add(new Task(new Date(), patioManager, Action.fumigar));
		
		// 15:30
		listatest.add(new Task(new Date(), patioManager, Action.inundarSuelo));
		
		// 15:30
		listatest.add(new Task(new Date(), patioManager, Action.inundarSuelo));
		listatest.add(new Task(new Date(), patioManager, Action.crecercesped));
		
		// 17:00
		listatest.add(new Task(new Date(), patioManager, Action.filtrarSuelo));
		
		// 18:20
		listatest.add(new Task(new Date(), patioManager, Action.cortarCesped));
		
	}
	
	public void run() {
		// recorriendo la lista de pruebas 
		for (Task task : listatest) {
			// if para ver si ya es hora para mandar la prueba test.time
			task.getTask().execute(task.getAction());
		}
	}
}