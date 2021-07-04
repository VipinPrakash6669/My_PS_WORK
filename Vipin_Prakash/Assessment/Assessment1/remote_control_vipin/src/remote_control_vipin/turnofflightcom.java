package remote_control_vipin;

public class turnofflightcom implements Icommand {
	 Bulb light;
	 
	    public turnofflightcom(Bulb light) {
	        super();
	        this.light = light;
	    }
	 
	    public void execute() {
	        System.out.println("Turning off light.");
	        light.turnOff();
	    }
}
