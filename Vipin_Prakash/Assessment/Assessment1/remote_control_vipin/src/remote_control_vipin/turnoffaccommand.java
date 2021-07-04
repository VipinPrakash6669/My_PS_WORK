package remote_control_vipin;

public class turnoffaccommand implements Icommand{
	AC ac;
	 
    public turnoffaccommand(AC ac) {
        super();
        this.ac = ac;
    }
 
    public void execute() {
        //System.out.println("AC stopped.");
        ac.stop();
    }
}
