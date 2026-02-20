  ##3a                                                                              Student.java
class Student {
    String name;
    int age;
    double marks;
    Student() {
        name = "Not Assigned";
        age = 0;
        marks = 0.0;
    }
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student std = new Student();
        std.display();
        System.out.println();
        Student std1 = new Student("Usha", 40, 67.8);
        std1.display();
    }
}
<img width="230" height="133" alt="3a" src="https://github.com/user-attachments/assets/d368b753-baa9-4585-a60f-53c7df5a6bf2" />


##3b
import java.util.Scanner;
class BinarySearch {
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
    int search(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }
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


## exp 5a
 Interface definition
interface Sortable {
    void sort(int[] arr);
}

// BubbleSort class implementing Sortable
class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// SelectionSort class implementing Sortable
class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

// Main class to test sorting
public class TestSort {
    // Method to display array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First array for BubbleSort
        int[] arr1 = {5, 2, 9, 1, 6};
        Sortable ref;

        ref = new BubbleSort();
        ref.sort(arr1);
        System.out.println("Array sorted using BubbleSort:");
        printArray(arr1);

        // Second array for SelectionSort
        int[] arr2 = {8, 3, 7, 4, 2};
        ref = new SelectionSort();
        ref.sort(arr2);
        System.out.println("Array sorted using SelectionSort:");
        printArray(arr2);
    }
}
<img width="252" height="81" alt="5a" src="https://github.com/user-attachments/assets/76ac2667-2048-47e1-8023-cb3dedee51ea" />


## exp 5b

// Base class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Overriding method
    void run() {
        System.out.println("Car is running on four wheels");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    // Overriding method
    void run() {
        System.out.println("Bike is running on two wheels");
    }
}

// Main class
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v;

        // Reference to Car object
        v = new Car();
        v.run();   // calls Car's run()

        // Reference to Bike object
        v = new Bike();
        v.run();   // calls Bike's run()

        // Reference to Vehicle object
        v = new Vehicle();
        v.run();   // calls Vehicle's run()
    }
}
<img width="213" height="70" alt="5b" src="https://github.com/user-attachments/assets/d289db1f-3748-4aaa-86a6-d08f294d000e" />


##exp 5c

public class StringBufferDeleteDemo {
    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Java Programming");

        // Display original string
        System.out.println("Original String: " + sb);

        // Delete single character at index 4
        sb.deleteCharAt(4);
        System.out.println("After deleting character at index 4: " + sb);

        // Delete characters from index 0 to 4
        sb.delete(0, 4);
        System.out.println("After deleting characters from index 0 to 4: " + sb);
    }
}
<img width="411" height="60" alt="5c" src="https://github.com/user-attachments/assets/d2850b30-15bd-4e3d-a1de-73ba7bc9b703" />

##exp 6a
import java.util.Scanner;
public class ExceptionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter index between 0 and " + (n - 1));
        }
        sc.close();
    }
} 

<img width="475" height="164" alt="6a" src="https://github.com/user-attachments/assets/c4e19f8d-1508-42f7-851b-c4c02c2b27b5" />

## 6b
import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
            System.out.print("Enter index to access array element: ");
            int index = sc.nextInt();
            System.out.println("Element at index = " + arr[index]);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }
        System.out.println("Program continues...");
        sc.close();
    }
} 
<img width="425" height="117" alt="6b4" src="https://github.com/user-attachments/assets/d52b2299-9494-46ff-84d7-20ee61861d65" />
<img width="433" height="145" alt="6b3" src="https://github.com/user-attachments/assets/ddf6b6a0-63eb-46c8-81d9-d6d12d0068ec" />
<img width="373" height="154" alt="6b2" src="https://github.com/user-attachments/assets/93adad22-ff9f-46df-aa56-1db057de57b4" />
<img width="357" height="140" alt="6b" src="https://github.com/user-attachments/assets/93adea67-3c0c-4f27-99e5-ca539f9efa25" />

##6c

import java.util.Scanner;
public class MultipleExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer to divide 100: ");
            int n = sc.nextInt();
            int result = 100 / n;
            System.out.println("Result = " + result);
            int[] arr = new int[3];
            System.out.println("Accessing element: " + arr[5]);
            System.out.print("Enter a number as text: ");
            String s = sc.next();
            int num = Integer.parseInt(s);
            System.out.println("Converted number = " + num);
        }
        catch (ArithmeticException e) { 
            System.out.println("ArithmeticException: division by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: invalid index.");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: invalid numeric format.");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
        System.out.println("Program continues...");
        sc.close();
<img width="519" height="124" alt="6c" src="https://github.com/user-attachments/assets/d9a59c39-9678-4dcb-939d-fda3427c8008" />


##7a
class UserRegion {
    void registerUser(String userName, String userCountry)
            throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException(
                "User outside India cannot be registered"
            );
        } else {
            System.out.println("User registration done successfully");
        }
    }
}
public class UserRegistration {
    public static void main(String[] args) {
        UserRegion ur = new UserRegion();
        try {
            ur.registerUser("Ravi", "USA");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        try {
            ur.registerUser("Anita", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}

<img width="366" height="77" alt="7a" src="https://github.com/user-attachments/assets/63bc671f-9c35-47c9-ac33-c56a231e8feb" />

##7b

class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception in GoodMorningThread: " + e);
class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception in HelloThread: " + e);
            }
        }
    }
}
class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Exception in WelcomeThread: " + e);
public class TestThreads {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();
        t1.start();
        t2.start();
        t3.start();
    }
}

<img width="420" height="452" alt="7b" src="https://github.com/user-attachments/assets/8676c350-60ab-4232-99a4-6abd1b4aa4a5" />

##7c


class LongRunningTask extends Thread {
    public void run() {
        System.out.println("Long running task started...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Working... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e);
            }
        }
        System.out.println("Long running task completed!");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        LongRunningTask task1 = new LongRunningTask();
        System.out.println("Before starting task1: " + task1.isAlive());
        task1.start();
        System.out.println("After starting task1: " + task1.isAlive());
        System.out.println("Main thread waiting for task1 to complete using join()...");
        try {
            task1.
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
        System.out.println("After join(): " + task1.isAlive());
        System.out.println("Main thread continues after task1 completed");
    }
}

<img width="728" height="336" alt="7c" src="https://github.com/user-attachments/assets/b82021a4-cd8d-42b8-9dd6-077df05e9460" />




