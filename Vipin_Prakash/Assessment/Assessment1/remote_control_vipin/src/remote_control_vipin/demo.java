package remote_control_vipin;

public class demo {

	public static void main(String[] args) {
		Bulb bulb = new Bulb();    
 
        Fan fan = new Fan(); 
        
        AC ac =new AC(25);
 
        homeautomationremote remote = new homeautomationremote();  
 
        remote.setCommand(new turnonlightcom( bulb ));
        remote.buttonPressed();
        
        remote.setCommand(new turnofflightcom( bulb ));
        remote.buttonPressed();
 
        remote.setCommand(new startfancommand( fan ));
        remote.buttonPressed();
 
        remote.setCommand(new stopfancom( fan ));
        remote.buttonPressed();
        
        remote.setCommand(new turnonaccommand(ac));
        remote.buttonPressed();
        
        remote.setCommand(new turnoffaccommand(ac));
        remote.buttonPressed();
        
        remote.change_ac_temp(5);
	}

}
