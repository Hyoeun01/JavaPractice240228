package ex_240311_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Phone {
    private String name;
    private String[] telAndAddr;

    public Phone(String name, String[] telAndAddr) {
        this.name = name;
        this.telAndAddr = telAndAddr;
    }

    public String getName() {
        return name;
    }

    public String[] getTelAndAddr() {
        return telAndAddr;
    }
}

public class PhoneManager {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        Map<String, Phone> contacts = new HashMap<String, Phone>();

	        System.out.println("인원수를 입력하세요 >> ");
	        int n = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 0; i < n; i++) {
	        	
	            System.out.println("이름,전화번호(번호는 연속적으로 입력), 주소 >> ");
	            String info = scanner.nextLine();
	            
	            String[] infoArray = info.split(" ");

	            String name = infoArray[0];
	            String[] telAndAddr = {infoArray[1], infoArray[2]};

	            contacts.put(name, new Phone(name, telAndAddr));
	            
	        }

	        System.out.println("저장되었습니다.");
	        System.out.println();
	        
	        while (true) {
	        	
	            System.out.print("검색할 이름 >> ");
	            String searchName = scanner.next();

	            if (searchName.equals("exit")) {
	            	
	                System.out.println("프로그램을 종료합니다");
	                
	                break;
	                
	            } else {
	                
	            	if (contacts.containsKey(searchName)) {
	            		
	                    Phone phone = contacts.get(searchName);
	                    String[] telAndAddr = phone.getTelAndAddr();
	                    
	                    System.out.println(searchName + "의 번호와 주소는 " + telAndAddr[0] + ", " + telAndAddr[1] + "입니다.");
	                    System.out.println();
	                } 
	            	else {
	            		
	                    System.out.println(searchName + "는(은) 존재하지 않는 이름입니다.");
	                    System.out.println();
	                    
	                }
	            }
	        }
	        scanner.close();
	    }
	}

