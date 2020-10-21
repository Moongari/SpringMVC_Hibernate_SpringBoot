package com.moonDemo.noXml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// define a data Array
	private Random rd = new Random();
	private String myFile = "Info.txt";
	private File fileName = new File(myFile);
	private List<String> lstInfo ;
	
    
	public RandomFortuneService () {
		// initialize array list
		
		System.out.println(">> RandomFortuneService: inside Constructor");
	}
    
	public String[] data = {
			"Uppercute du droit ","Crochet du gauche","Esquive bien !!"
	};
	
	
	
	
	@PostConstruct
	private void LoadFile() {
		System.out.println(">> RandomFortuneService: inside method LoadFile");
		
		lstInfo = new ArrayList<String>();
		try {
			// Créer l'objet File Reader
			FileReader fr = new FileReader(fileName);
			 // Créer l'objet BufferedReader        
		      BufferedReader br = new BufferedReader(fr); 
		      String line ;
		      while ((line = br.readLine()) != null) {
		    	  
		    	  lstInfo.add(line);
				
			}
			
			
		} catch (IOException e) {
			
				e.printStackTrace();
		}
		
		
	}
	


	
	
	
	@Override
	public String getFortuneService() {
		
		int index = rd.nextInt(lstInfo.size());
		
		return lstInfo.get(index);
	}

}
