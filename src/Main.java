import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];



        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 31) - 10;
        }


        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        int maxCount = 0;
        int currentCount = 0;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                currentCount++;

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    startIndex = i - maxCount + 1;
                }
            } else {
                currentCount = 0;
            }
        }

        // вывод найденного фрагмента на консоль
        int[] fragment = Arrays.copyOfRange(arr, startIndex, startIndex + maxCount);
        System.out.println("Найденный фрагмент:");
        System.out.println(Arrays.toString(fragment));
    }
}