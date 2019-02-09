import java.util.Random;
import java.util.Scanner;

public class HighAndLowGame {
    public static void main(String[] args) {
        int score = 0;
        boolean flag = true;

        while (flag) {
            Random rdm = new Random();
            int num1 = rdm.nextInt(13)+1;
            int num2 = rdm.nextInt(13)+1;
            System.out.println(num1);
            System.out.println("次の数値が高い（H）か低い（L）かを選んで入力してください");
            Scanner sc = new Scanner(System.in);
            String predict = sc.nextLine().toUpperCase();
            switch (predict) {
                case "H":
                    if (num1 < num2) {
                        score++;
                        System.out.println(num2 + "だったので当たり。＋１点！");
                    }
                    else if(num1==num2){
                        System.out.println(num2+"だったので引き分け！");
                    }
                    else{
                        System.out.println(num2+"だったのではずれ。残念。");
                        System.out.println("あなたのスコア"+score+"点！");
                        flag = false;
                    }
                    break;

                case "L":
                    if(num1 < num2){
                        System.out.println(num2+"だったのではずれ。残念。");
                        System.out.println("あなたのスコア"+score+"点！");
                        flag = false;
                    }
                    else if(num1==num2){
                        System.out.println(num2+"だったので引き分け！");
                    }
                    else{
                        score++;
                        System.out.println(num2 + "だったので当たり。＋１点！");
                    }
                    break;

                default:
                    System.out.println("HかLを入力してください");

            }

        }
    }
}