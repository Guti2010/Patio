package controlesPatio;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
	private Date hora;
	private ITask task;
	private Action action;
	
	
	public Task(Date pTime, ITask task, Action pAction) {
		this.hora = pTime;
		this.task = task;
		this.action = pAction;
		String dateString = "2023-09-06 "+pTime+":00";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            pTime = dateFormat.parse(dateString);		
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
	}
	
	public Date getHora() {
		return hora;
	}

	public ITask getTask() {
		return task;
	}

	public Action getAction() {
		return action;
	}
	
	}
