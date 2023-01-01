package com.faith.model;

public class DivMediaPlayer extends VideoMediaPlayer{
	
	public void output() {
		System.out.println("------------DivMediaPlayer-----------");
		super.playAudio();
		super.playVideo();
	}

}
