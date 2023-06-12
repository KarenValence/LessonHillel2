import com.sun.deploy.si.SingleInstanceImpl;

import java.util.Arrays;
import java.util.Random;
public class Regbi {
    public static void main(String[] args) {
        Random random = new Random();

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        for (int i = 0; i < 25; i++) {
            {
                team1[i] = random.nextInt(22) + 18;
            }   team2[i] = random.nextInt(22) + 18;
            System.out.println("Первая команда " + team1[i]);
            System.out.println("Вторая команда " + team2[i]);
       //     int[] average1 = team1 / 25;
        //    int[] average2 = team2 / 25;



        //        System.out.println(average1);

        }}}




