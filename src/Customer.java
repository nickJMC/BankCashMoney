import java.util.Queue;


public class Customer{
	private int arrivalTime;
	private int neededTime;
	public int getArrivalTime() {
		return arrivalTime;
	}

	public int getNeededTime() {
		return neededTime;
	}

	public boolean isWalkIn() {
		return walkIn;
	}

	private boolean walkIn;
	
	public Customer(String input){
		String[] hold = input.split("\t");
		
		this.arrivalTime = Integer.parseInt(hold[0]);
		this.neededTime = Integer.parseInt(hold[1]);
		this.walkIn = Boolean.parseBoolean(hold[2]);
	}
	
	
}
