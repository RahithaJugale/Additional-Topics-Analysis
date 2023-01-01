package com.faith.model;

public class VlcMediaPlayer extends VideoMediaPlayer{

	public void output() {
		System.out.println("--------------VlcMediaPlayer---------------");
		super.playAudio();
		super.playVideo();
	}
}
