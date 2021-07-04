package remote_control_vipin;

public class startfancommand implements Icommand {
	Fan fan;
	 
    public startfancommand(Fan fan) {
        super();
        this.fan = fan;
    }
 
    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }
}
