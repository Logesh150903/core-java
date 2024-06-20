package pack1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningAverage {
    
    public static void main(String[] args) {
        double[] inputArray = {10, 20, 10, 10, 10, 20, 20, 20, 10};
        double[] runningAverages = computeRunningAverage(inputArray, 3);
        
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Running Averages: " + Arrays.toString(runningAverages));
    }
    
    public static double[] computeRunningAverage(double[] array, int windowSize) {
        if (array == null || windowSize <= 0 || array.length < windowSize) {
            throw new IllegalArgumentException("Invalid input array or window size");
        }
        
        List<Double> averagesList = new ArrayList<>();
        for (int i = 0; i <= array.length - windowSize; i++) {
            double average = calculateAverage(Arrays.copyOfRange(array, i, i + windowSize));
            averagesList.add(average);
        }
        
        // Convert List to array
        double[] averagesArray = new double[averagesList.size()];
        for (int i = 0; i < averagesList.size(); i++) {
            averagesArray[i] = averagesList.get(i);
        }
        
        return averagesArray;
    }
    
    public static double calculateAverage(double[] subArray) {
        double sum = 0.0;
        for (double num : subArray) {
            sum += num;
        }
        return sum / subArray.length;
    }
}
