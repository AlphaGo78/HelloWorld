package demo01;

public class Array2D {
    public static void main(String[] args) {
        //行主顺序
        int[][] binary = {
                {0, 1, 0, 1},
                {1, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        int onesCount = 0;
        for (int[] b : binary) {
            for (int s : b) {
                if (s == 1) {
                    onesCount++;
                }
            }
        }
        System.out.println(onesCount);

        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        int l = 0;
        int j = 0;
        while (l < wordData.length) {
            j = 0;
            while (j < wordData[l].length) {
                System.out.println(wordData[l][j] + ": [" + l + "]" + "[" + j + "]");
                j++;
            }
            l++;
        }


        // Given runner lap data
        double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};

        double runnerTime = 0.0;
        for (int outer = 0; outer < times.length; outer++) {
            runnerTime = 0.0;
            for (int inner = 0; inner < times[outer].length; inner++) {
                System.out.println("Runner index: " + outer + ", Time index: " + inner);
                // Add a line to sum up the values in each row.
                runnerTime += times[outer][inner];

            }
            double averageVal = runnerTime / times[outer].length;

            System.out.println("Sum of runner " + outer + " times: " + runnerTime);
            System.out.println("Average of runner " + outer + ": " + averageVal);

        }

        //列主顺序
        double[][] times2 = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};

        double lapTime = 0.0;
        for(int outer = 0; outer < times2[0].length; outer++){
            lapTime = 0.0;
            for(int inner = 0; inner < times2.length; inner++){
                System.out.println("Lap index: " + outer + ", Time index: " + inner);
                // Add a line to sum up the values
                lapTime += times2[inner][outer];
            }
            double averageVal = lapTime / times2.length;

            System.out.println("Sum of lap " + outer + " times: " + lapTime);
            System.out.println("Average time for lap " + outer + ": " + averageVal);
        }
    }
}
