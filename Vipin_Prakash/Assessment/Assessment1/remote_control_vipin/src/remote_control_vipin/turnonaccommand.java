package remote_control_vipin;

public class turnonaccommand implements Icommand {
	AC ac;
	 
    public turnonaccommand(AC ac) {
        super();
        this.ac = ac;
    }
 
    public void execute() {
        System.out.println("Starting AC at "+ac.getTemp()+" temperature");
        ac.start();
    }
}
