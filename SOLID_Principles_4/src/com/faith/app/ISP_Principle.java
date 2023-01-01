package com.faith.app;

import com.faith.model.JumpingAthlete;
import com.faith.model.JumpingAthleteImpl;
import com.faith.model.SwimmingAthlete;
import com.faith.model.SwimmingAthleteImpl;

public class ISP_Principle {
	public static void main(String[] args) {
		
		//instantiating objects for Swimming and jumping classes
		JumpingAthlete jumpingPlayer = new JumpingAthleteImpl();
		jumpingPlayer.compete();
		jumpingPlayer.highJump();
		jumpingPlayer.longJump();
		
		SwimmingAthlete swimmingPlayer = new SwimmingAthleteImpl();
		swimmingPlayer.compete();
		swimmingPlayer.swim();
	}
}
