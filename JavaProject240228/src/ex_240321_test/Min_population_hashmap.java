package ex_240321_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 5개의 나라이름과 인구를 입력받아 해시맵에 저장하고,
 * 가장 인구가 적은 나라를 검색해서 출력하는 프로그램 작성.
 * HashMap<String, Integer> nations = new HashMap<String, Integer>(); 이용하기
 */
public class Min_population_hashmap {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> nations = new HashMap<String, Integer>();
		 Scanner scanner = new Scanner(System.in);
	     
		 System.out.println("나라 이름과 인구를 5개 입력하세요. (예 : Korea 5000)");
		 for (int i = 0; i < 5; i++) {
			 
	            System.out.print("나라이름, 인구 >> " );
	            String input = scanner.nextLine();
	            
	            String[] values = input.split(" ");
	    		
	    		String country = values[0];
	    		int population = Integer.parseInt(values[1]);
	    		
	    		 nations.put(country, population);
	    		
	        }
		 
		 String smallestCountry = null;
	     int smallestPopulation = Integer.MAX_VALUE;
	    
	     for (Iterator<String> iterator = nations.keySet().iterator(); iterator.hasNext();) {
	    	 
	    	    String country = iterator.next();
	    	    int population = nations.get(country);
	    	    
	    	    if (population < smallestPopulation) {
	    	    	
	    	        smallestPopulation = population;
	    	        smallestCountry = country;
	    	        
	    	    }
	    	}

	     System.out.println("제일 인구가 적은 나라는 ("+smallestCountry+","+smallestPopulation+")");
	     System.out.println();
	    
	     scanner.close();
	}

}
