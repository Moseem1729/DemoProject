package com.BikkadIT;

public class Mobile {

	public static void main(String[] args) {
		
		 Vodaphone vodaphone = new Vodaphone();
		 vodaphone.calling();
		 vodaphone.browse();
		 
		 Airtel airtel = new Airtel();
		 airtel.calling();
		 airtel.browse();
		 
		 Sim sim = new Airtel();
		 sim.calling();
		 sim.browse();
		 
		 Sim sim1 = new Vodaphone();
		 sim1.calling();
		 sim1.browse();
	}
}
