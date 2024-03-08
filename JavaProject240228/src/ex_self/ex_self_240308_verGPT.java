package ex_self;

import java.util.Arrays;
import java.util.Random;

public class ex_self_240308_verGPT {
	
	public static void main(String[] args) {
        // 중복 없는 랜덤한 6개의 자연수를 담을 배열 생성
        int[] lottoNumbers = generateLottoNumbers();
        
        // 생성된 6개의 숫자 배열 출력
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }
    
    // 중복 없는 랜덤한 6개의 자연수 생성 메서드
    public static int[] generateLottoNumbers() {
        Random random = new Random();
        int[] numbers = new int[6]; // 6개의 자연수를 담을 배열
        
        int index = 0;
        
        while (index < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1부터 45 사이의 랜덤한 수 생성
            
            // 중복 확인을 위한 변수
            boolean isDuplicate = false;
            
            // 생성된 숫자가 이전에 생성된 숫자와 중복되는지 확인
            for (int i = 0; i < index; i++) {
                if (numbers[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // 중복되지 않은 경우에만 배열에 추가
            if (!isDuplicate) {
                numbers[index++] = randomNumber;
            }
        }
        
        return numbers;
    }
}