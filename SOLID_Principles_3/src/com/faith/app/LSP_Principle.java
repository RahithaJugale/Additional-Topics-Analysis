package com.faith.app;

import com.faith.model.DivMediaPlayer;
import com.faith.model.VlcMediaPlayer;
import com.faith.model.WinampMediaPlayer;

public class LSP_Principle {

	public static void main(String[] args) {
		
		//creating object for each classes
		VlcMediaPlayer vlc = new VlcMediaPlayer();
		vlc.output();
	
		
		DivMediaPlayer divMedia = new DivMediaPlayer();
		divMedia.output();
		
		WinampMediaPlayer winamp = new WinampMediaPlayer();
		winamp.output();
		
	}

}
