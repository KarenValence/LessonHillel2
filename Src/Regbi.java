import java.util.Arrays;
import java.util.Random;
public class Regbi {
    public static void main(String[] args) {
        Random random = new Random();

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        for (int i = 0; i < 25; i++) {
            team1[i] = random.nextInt(22) + 18;
            team2[i] = random.nextInt(22) + 18;
            sumTeam1 += team1[i];
            sumTeam2 += team2[i];
        }
            System.out.println(Arrays.toString(team1));
            System.out.println(Arrays.toString(team2));
            System.out.println((double)sumTeam1/team1.length);
            System.out.println((double)sumTeam2/team2.length);






        }}




