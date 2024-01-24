//
// Driver class for the HVAC Smart Home implementation assignment
//
// R. Pettit 2016
//

import java.util.Timer;
import java.util.concurrent.*;

public class HVAC {
	
	// Setup queue between CentralControl and TemperatureControl
	// Implemented as a BlockingQueue (specifically ArrayBlockingQueue)
	//   with a capacity of 100 elements
		
	static BlockingQueue<Mode> tcQueue = new ArrayBlockingQueue<Mode>(100); 

	public static void main(String[] args) {

		Timer tempUpdate = new Timer(); // For the periodically activated Temperature Sensor
		tempUpdate.schedule(new TempSensor(),0, 1000); //1 Hz activation period
		
		CentralControl centralCtrl = new CentralControl(tcQueue);
		TemperatureCtrl tempCtrl = new TemperatureCtrl(tcQueue);
		
		// Start the tasks
		centralCtrl.start();
		tempCtrl.start();
	}

}
