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


##ADDITIONAL EXPIREMENTS
#add exp 1
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        // Input substring
        System.out.print("Enter the substring to insert: ");
        String subString = sc.nextLine();

        // Input position
        System.out.print("Enter the position to insert the substring: ");
        int position = sc.nextInt();

        // Check valid position
        if (position < 0 || position > mainString.length()) {
            System.out.println("Invalid position!");
        } else {
            // Extract parts of the main string
            String firstPart = mainString.substring(0, position);
            String secondPart = mainString.substring(position);

            // Insert substring
            String resultString = firstPart + subString + secondPart;

            // Display result
            System.out.println("Resulting string: " + resultString);
        }

        sc.close();
    }
}
<img width="323" height="73" alt="ADD exp 1" src="https://github.com/user-attachments/assets/c44099b3-73f3-44a0-b188-78de570d7022" />

##add exp 3
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Initialize pointers
        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        sc.close();
    }
}

<img width="184" height="32" alt="add exp 3" src="https://github.com/user-attachments/assets/34f8b562-de63-4e2c-bc82-687a9ebebdb2" />

##add exp 4

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i <= num - 1; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        // Check perfect number
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }

        sc.close();
    }
}
<img width="206" height="39" alt="add exp 4" src="https://github.com/user-attachments/assets/330fb209-b6d9-4943-86ae-548cbf3d1a88" />
