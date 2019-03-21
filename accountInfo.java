

import java.util.Observable;
import java.util.Observer;

public class accountInfo implements Observer {
	
	public void update(Observable o, Object arg) {
		System.out.println(o.toString() + "\n" + arg);
		
	}

}
