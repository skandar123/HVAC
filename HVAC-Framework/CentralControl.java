//
// Stub for CentralControl <<control>> class
// Sends commands to Temperature Control and sets desired temperature
// Update run() method and add methods as needed to test TemperatureCtrl implementation
// 
// R. Pettit - 2016
//

import java.util.concurrent.BlockingQueue;

public class CentralControl extends Thread {
	
	protected BlockingQueue<Mode> queue = null; 
	
	// Constructor assigns queue
	public CentralControl(BlockingQueue<Mode> queue){
		this.queue = queue;
	}
	
	public void run(){
		
		//Stub to show thread was started -- Can remove
		System.out.println("CentralControl Started");
		
		while(true){
			
			// See Producer / Consumer examples.
			// This would be the producer for TemperatureCtrl by placing
			//   messages on the queue
			
			try{
				// For right now, this just prints the current temperature
				//   every second just to show the thread is working.  
				System.out.println("CentralControl: Current Temp is "+Temperature.getCurrent());
				Thread.sleep(1000);
			}catch (InterruptedException ex){
				// Just ignore any exceptions
			}
		}	
		
	}

}
