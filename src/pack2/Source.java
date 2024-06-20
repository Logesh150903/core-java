package pack2;
public class Source {

    // Method to find and return the second smallest element in an array
    public int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        // Initialize the smallest and second smallest elements
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Traverse the array to find the first and second smallest elements
        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        // Return the second smallest element
        return secondMin;
    }

    public static void main(String[] args) {
        Source source = new Source();
        int[] arr = {23, 45, 32, 22, 20, 96};
        int result = source.getSecondSmallest(arr);
        System.out.println("Second smallest element: " + result);
    }
}
