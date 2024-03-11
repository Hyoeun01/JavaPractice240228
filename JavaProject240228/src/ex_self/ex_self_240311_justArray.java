package ex_self;

import java.util.Scanner;

class PhoneInfo {
    private String name;
    private String[] telAndAddr;

    public PhoneInfo(String name, String[] telAndAddr) {
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


public class ex_self_240311_justArray {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("인원수를 입력하세요 >> ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        PhoneInfo[] contacts = new PhoneInfo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("이름,전화번호(번호는 연속적으로 입력), 주소 >> ");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

            String name = inputArray[0];
            String[] telAndAddr = {inputArray[1], inputArray[2]};

            contacts[i] = new PhoneInfo(name, telAndAddr);
        }

        System.out.println("저장되었습니다.");
        System.out.println();

        while (true) {
            System.out.println("검색할 이름 >> ");
            String searchName = scanner.next();

            if (searchName.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                boolean found = false;
                for (PhoneInfo contact : contacts) {
                    if (contact.getName().equals(searchName)) {
                        String[] telAndAddr = contact.getTelAndAddr();
                        System.out.println(searchName + "의 번호와 주소는 " + telAndAddr[0] + ", " + telAndAddr[1] + "입니다.");
                        System.out.println();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(searchName + "는(은) 존재하지 않는 이름입니다.");
                    System.out.println();
                }
            }
        }

        scanner.close();
    }
}