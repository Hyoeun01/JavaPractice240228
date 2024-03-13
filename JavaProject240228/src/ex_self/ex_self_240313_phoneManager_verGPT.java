package ex_self;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Phone2 {
    private String name;
    private String[] telAndAddr;

    public Phone2(String name, String[] telAndAddr) {
        this.name = name;
        this.telAndAddr = telAndAddr;
    }

    public String getName() {
        return name;
    }

    public String[] getTelAndAddr() {
        return telAndAddr;
    }

    public void setTel(String tel) {
        this.telAndAddr[0] = tel;
    }

    public void setAddr(String addr) {
        this.telAndAddr[1] = addr;
    }
}

public class ex_self_240313_phoneManager_verGPT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Phone2> contacts = new HashMap<String, Phone2>();

        System.out.println("인원수를 입력하세요 >> ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("이름,전화번호(번호는 연속적으로 입력), 주소 >> ");
            String info = scanner.nextLine();

            String[] infoArray = info.split(" ");

            String name = infoArray[0];
            String[] telAndAddr = { infoArray[1], infoArray[2] };

            contacts.put(name, new Phone2(name, telAndAddr));

        }

        System.out.println("저장되었습니다.");
        System.out.println();

        while (true) {

            System.out.print("검색 또는 수정할 이름(exit 입력 시 종료) >> ");
            String inputName = scanner.nextLine();

            if (inputName.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                if (contacts.containsKey(inputName)) {
                    Phone2 phone = contacts.get(inputName);
                    String[] telAndAddr = phone.getTelAndAddr();
                    System.out.println(inputName + "의 번호와 주소는 " + telAndAddr[0] + ", " + telAndAddr[1] + "입니다.");
                    System.out.print("수정할 정보 입력 >> ");
                    String newInfo = scanner.nextLine();
                    if (containsDigit(newInfo)) {
                        phone.setTel(newInfo);
                        System.out.println("전화번호가 수정되었습니다.");
                    } else {
                        phone.setAddr(newInfo);
                        System.out.println("주소가 수정되었습니다.");
                    }
                    System.out.println();
                } else {
                    System.out.println(inputName + "는(은) 존재하지 않는 이름입니다.");
                    System.out.println();
                }
            }
        }
        scanner.close();
    }

    // 숫자 포함 여부 확인
    private static boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}