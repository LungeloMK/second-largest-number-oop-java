/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondlargestoop;

class NumberProcessor {
    private int[] numbers;

    public NumberProcessor(int[] numbers) {
        this.numbers = numbers;
    }

    public int findSecondLargest() {
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public void displaySecondLargest() {
        System.out.println("The second largest number is: " + findSecondLargest());
    }
}

public class SecondLargestOOP {
    public static void main(String[] args) {
        int[] data = {12, 35, 1, 10, 34, 1};

        NumberProcessor processor = new NumberProcessor(data);
        processor.displaySecondLargest();
    }
}

