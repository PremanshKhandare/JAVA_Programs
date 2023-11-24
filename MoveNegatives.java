public class MoveNegatives {

    public static void main(String[] args) {
        int[] originalArray = {2, -7, 4, -1, 8, -3, 5};

        int[] rearrangedArray = moveNegatives(originalArray);

        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nRearranged Array with Negatives on One Side: ");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] moveNegatives(int[] array) {
        int[] rearrangedArray = new int[array.length];
        int negIndex = 0;
        int posIndex = array.length - 1;

        for (int num : array) {
            if (num < 0) {
                rearrangedArray[negIndex] = num;
                negIndex++;
            } else {
                rearrangedArray[posIndex] = num;
                posIndex--;
            }
        }

        return rearrangedArray;
    }
}

