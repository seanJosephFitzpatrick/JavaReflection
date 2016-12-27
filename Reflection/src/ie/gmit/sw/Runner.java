package ie.gmit.sw;

import java.io.*;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) throws IOException {
			
		//swing-sample runner
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AppWindow();
			}
		});
					
	}
}
