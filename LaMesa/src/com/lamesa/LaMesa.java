package com.lamesa;

public class LaMesa {

	public static void main(String[] args) {
<<<<<<< Upstream, based on origin/methmal
		
		if(args.length < 2) {
			System.err.println("Grr....");
			return;
		}
		
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		
		try {
			Client c = new Client(host, port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
=======
		// ...
		//TODO setup UI
>>>>>>> e7162a1 merge
	}
	
	
	
	
}
