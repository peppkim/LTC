import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        // 입력받는 두 수의 구구단을 출력
        // 입력값 갯수는 2개
        // 각각의 1부터 9까지 곱셈 구구단 별개 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 고르기 (2~9): ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 고르기 (2~9): ");
        int num2 = sc.nextInt();
        System.out.print("첫 번째 정수: "+num1+"\n두 번째 정수: "+num2);
        System.out.println("\n>>>> "+num1 + " 단");
        for (int i = 1; i < 10; i++) {
            System.out.println(num1 + "*"+i+"="+num1*i);
        }
        System.out.println("\n>>>> "+num2 + " 단");
        for (int i = 1; i < 10; i++) {
            System.out.println(num2 + "*"+i+"="+num2*i);
        }

        System.out.println("끝!");
        sc.close();



    }
}
