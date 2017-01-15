package ie.gmit.sw;

import java.io.*;

import ie.gmit.sw.View.AppWindow;

/**
 * @author Sean Fitzpatrick
 */
public class Runner {
	
	public static void main(String[] args) throws IOException {	
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AppWindow();
				//Start Application
			}
		});
					
	}
}
