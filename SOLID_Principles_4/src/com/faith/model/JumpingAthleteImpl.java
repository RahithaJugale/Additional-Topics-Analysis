package com.faith.model;

public class JumpingAthleteImpl implements JumpingAthlete {

	@Override
	public void compete() {
		System.out.println("Athlete started competing for jumping competitions");

	}

	@Override
	public void highJump() {
		System.out.println("Athlete starting high Jump");

	}

	@Override
	public void longJump() {
		System.out.println("Athlete starting long Jump");

	}

}
