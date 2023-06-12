import java.util.Scanner;
public class Guess_Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Угадай число от 0 до 10");
        int num = (int) (Math.random() * 10);
        int i = 0;
        while (i < 3){
            i++;
            int input_number = scan.nextInt();
            if (input_number == num) {
                System.out.println("Угадал");
                break;
            } else  {
                System.out.println("Не угадал");
                
            }
        }
        }





    }
