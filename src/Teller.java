import java.util.*;

public class Teller {
	private int waitTime=0;
	private boolean available=true;
	private int customersHelped=0;
	private int idleTime=0;
	
	public Teller(){	
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getCustomersHelped() {
		return customersHelped;
	}

	public void setCustomersHelped(int customersHelped) {
		this.customersHelped = customersHelped;
	}

	public int getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(int idleTime) {
		this.idleTime = idleTime;
	}
	
	
}
