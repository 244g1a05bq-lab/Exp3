  ##3a                                                                              Student.java
class Student {
    String name;
    int age;
    double marks;

    // Default constructor
    Student() {
        name = "Not Assigned";
        age = 0;
        marks = 0.0;
    }

    // Parameterized constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }
}

class Main {
    public static void main(String[] args) {

        // Using default constructor
        Student std = new Student();
        std.display();

        System.out.println();

        // Using parameterized constructor
        Student std1 = new Student("Usha", 40, 67.8);
        std1.display();
    }
}
<img width="230" height="133" alt="3a" src="https://github.com/user-attachments/assets/d368b753-baa9-4585-a60f-53c7df5a6bf2" />


##3b
import java.util.Scanner;

// Logic Class
class BinarySearch {

    // Method to sort array (Bubble Sort)
    void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform Binary Search
    int search(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid + 1; // 1-based position
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    // Display array
    void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
<img width="227" height="201" alt="3b" src="https://github.com/user-attachments/assets/2cf246f4-50b3-4311-8b94-de37d8b0959d" />

##3c
import java.util.Scanner;

// Logic Class
class BubbleSort {

    void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {          // Number of passes
            for (int j = 0; j < n - i - 1; j++) {  // Comparisons
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void display(int[] arr, int n) {
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Main Class
public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          // Create object of BubbleSort class
        BubbleSort bs = new BubbleSort();

        // Sort and display
        bs.sort(arr, n);
        bs.display(arr, n);

        sc.close();
    }
}
<img width="228" height="151" alt="3c" src="https://github.com/user-attachments/assets/320a5ad8-2c53-4e13-ae73-d58f77b1453f" />


