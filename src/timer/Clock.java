package timer;

import java.util.Calendar; 
import java.util.Date;

import controlesPatio.Scheduler;
import interfaz.GUI;

public class Clock extends Thread {
	private static boolean running = true;
	private static Date currentTime;
	
	private Scheduler scheduler;
	
	public Clock(Scheduler pScheduler) {
		scheduler = pScheduler;
	}
	
	public void stopTimer() {
		running = false;
	}
	
	public void run(GUI frame) {
		while (running) {
			try {
				currentTime = Calendar.getInstance().getTime();
				scheduler.processTasks(frame);
				Thread.sleep(5000);	// escala tiempo
				System.out.println("A");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
		}
	}
	
	public static int getSecondsToNow(Date pBaseTime) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(pBaseTime);
        
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        
        // total seconds
        return (hours * 3600) + (minutes * 60) + seconds;		
	}
	
	public static Date getTime() {
		return currentTime;
	}
}