
package remote_control_vipin;

public class turnonlightcom implements Icommand {
	Bulb light;
	 
    public turnonlightcom(Bulb light) {
        super();
        this.light = light;
    }
 
    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
