import java.util.concurrent.BlockingQueue;

//
// This is the <<control>> class for TemperatureCtrl
// This class will be the primary focus for the implementation assignment
// You will need to override the run() method and add other methods as necessary
// TemperatureCtrl should check the queue from Central Control for mode change messages
// While in any mode other than OFF, you will be monitoring current/desired temperatures
//    and controlling the fan, cooling, primary heating, and backup heating units
//    through the respective <<boundary>> classes.


public class TemperatureCtrl extends Thread {

protected BlockingQueue<Mode> queue = null; 
	
	// Constructor assigns queue
	public TemperatureCtrl(BlockingQueue<Mode> queue){
		this.queue = queue;
	}	
	
	public void run(){
		//  Need to override this
		//  Need to keep track of your state (don't use the SystemState enum or SystemStatus class - those are for instructor use only
		//  Need to check the queue, but if no messages are waiting (you can wait up to 
		//     1 second), then continue checking the current/desired temperatures 
		//     every second.  You can Google for patterns on how to do this.
		//   
		
		// Temporary stub to show thread was started - can remove
		System.out.println("TemperatureCtrl Started");
	}
}
