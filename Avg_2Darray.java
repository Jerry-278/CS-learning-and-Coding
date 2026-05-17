public class Avg_2Darray {
    public static void main(String[] args) {
        int[][] arr = {{15, 21, 39}, {44, 54, 67}, {67, 87, 19}};
        double avg = calculateAverage(arr);
        System.out.println("Average: " + avg);
    }

    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        
        double average = (double) sum / count;
        return (average);
    }
}
