package remote_control_vipin;

public class AC {
	private int temp;
	public AC(int temp) {
		super();
		this.temp = temp;
	}
	void start() {
        //System.out.println("AC Started..");
        
    }
     void stop() {
        System.out.println("AC stopped..");
 
    }
	public int getTemp() {
		System.out.println("new teperature is "+ temp);
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int changetemp(int temp) {
		this.temp += temp;
		return this.temp;
	}
}
