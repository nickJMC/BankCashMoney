import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;


public class Bank {
	Teller[] tellerArray;
	Queue<Customer> line = new LinkedList<Customer>();
	
	public Bank(int numTellers, File data){
		this.tellerArray= new Teller[numTellers];
		for(int i=0; i<numTellers; i++){
			this.tellerArray[i]=new Teller();
		}
		
		try{
		BufferedReader reader = new BufferedReader(new FileReader(data));
		
		String hold = reader.readLine();
		while(hold!=null){
			System.out.println(hold);
			line.offer(new Customer(hold));
			System.out.println(line.poll().getArrivalTime());
			hold=reader.readLine();
		}
		reader.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		System.out.println(this.line.size());
		
	}
}
