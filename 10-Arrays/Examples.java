/**
 * Examples
 */
public class Examples {

    public static void main(String[] args) {
        // create an array of ints
        int[] myArray = { 2, 6, 15, -3, 12 };
        // print each element of the array on a new line
        for (int i = 0; i < myArray.length; i++) {
            // System.out.println(myArray[i]);
        }

        // find the sum of the array
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        System.out.println("total is: " + total);

        // find the highest number in the array
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > myArray[max]) {
                max = i;
            }
        }
        System.out.println("the maximum value is in position " + max);
        System.out.println("the maximum value is " + myArray[max]);
    }
}