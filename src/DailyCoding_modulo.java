//문제 : 두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴해야 합니다.

//주의사항 :
//나눗셈(/), 나머지(%) 연산자 사용은 금지됩니다.
//0은 어떤 수로 나누어도 나머지가 0입니다.
//어떤 수도 0으로 나눌 수 없습니다. 이 경우 null를 리턴해야 합니다.

//입출력 예시
//Integer output = modulo(25, 4);
//        System.out.println(output); // --> 1
//
//        output = modulo(25, 0);
//        System.out.println(output); // --> null

public class DailyCoding_modulo {
    public static void main(String[] args) {

        int num1 = 123456789;
        int num2 = 67;
        int result = 0;

        // while (num1 > 0)
        while (num1 > 0){
            // num1 = num1 - num2
            num1 = num1 - num2;
        }
        if (num1==0){
            System.out.println("0");
        } else {
            result = num1 + num2;
            System.out.println(result);
        }
    }
}
