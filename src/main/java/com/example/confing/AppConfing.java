package com.example.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.services.Guitariste;
import com.example.services.IMusicien;



@Configuration
@ComponentScan({"com.example.*"})

public class AppConfing {
	@Bean(name = "iMusicien")
	public IMusicien getIMusicien() {
	return new Guitariste();
	}

}
