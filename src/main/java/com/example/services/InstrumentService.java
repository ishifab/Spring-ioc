package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstrumentService {
	@Autowired
	private IMusicien iMusicien;
	
	public InstrumentService() {
		
	}
	public void ilJoue() {
		System.out.println("Il joue : " + iMusicien.getJouer());
	}

}
