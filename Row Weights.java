public class Solution {
    public static int[] rowWeights(int[] weights) {
        int team1 = 0;
        int team2 = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                team1 += weights[i];
            } else {
                team2 += weights[i];
            }
        }

        return new int[]{team1, team2};
    }

    public static void main(String[] args) {
        int[] weights = {50, 60, 70, 80};
        int[] result = rowWeights(weights);
        System.out.println("Team 1: " + result[0]);
        System.out.println("Team 2: " + result[1]);
    }
}