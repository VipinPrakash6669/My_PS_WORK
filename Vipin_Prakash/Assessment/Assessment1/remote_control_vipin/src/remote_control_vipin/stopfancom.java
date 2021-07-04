package remote_control_vipin;

public class stopfancom implements Icommand {
	Fan fan;
	 
    public stopfancom(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}
