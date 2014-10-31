import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class TheFDIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = null;
		   // Create a file-selection dialog object
        JFileChooser chooser = new JFileChooser();
        
        try {   
            // Display the dialog, and wait for return value.  If they cancel
            // out of the selection, throw an error -- no file to read
            if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
                throw new Error("Input file not selected");
            
            // Grab the selected File info
           inFile = chooser.getSelectedFile();
        } catch (Exception e) {
            System.err.println("A mysterious error occurred.");
            e.printStackTrace(System.err);
        }
        
        Bank bMoney$$$$$ = new Bank(3, inFile);
        
        
	}

}
