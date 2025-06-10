Bubble Sort is a straightforward sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. It "bubbles up" the largest (or smallest) values to their correct position with each pass.

📝 Example: Bubble Sort in Java
Let’s sort an array:
{5, 3, 8, 4, 2} in ascending order.

🚀 Java Code
java
Copy
Edit
public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // To optimize if the array is already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps happened in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
🔍 Explanation
1️⃣ Outer loop (i) runs n-1 times (n is array length).
2️⃣ Inner loop (j) compares adjacent pairs.
3️⃣ If arr[j] > arr[j+1], swap them.
4️⃣ At the end of each pass, the largest element among the unsorted part is in its correct place.
5️⃣ Optimization: If no swaps occur in a pass (swapped == false), the array is already sorted, so we can stop early.

