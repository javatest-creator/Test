package JavaTestTasks;

import java.util.ArrayList;
import java.util.Scanner;

/*
You want to take a list of numbers and find the sum
of all of the even numbers in the list. Ignore any odd numbers.

Task:
Find the sum of all even integers in a list of numbers.

Input Format:
The first input denotes the length of the list (N).
The next N lines contain the list elements as integers.

Output Format:
An integer that represents the sum of only the even numbers in the list.

Sample Input:
9
1
2
3
4
5
6
7
8
9

Sample Output:
20

Explanation:
If you add together 2, 4, 6, and 8 from the list, you get a sum of 20.
*/

public class Thats_odd {
    public static void main(String[] args) {

        Scanner num = new Scanner((System.in));
        int sc = num.nextInt();

        ArrayList<Integer> numList = new ArrayList<Integer>();
            for (int i=0; i < sc; i++) {
            numList.add(num.nextInt());
        }
        num.close();

        ArrayList<Integer> numEven = new ArrayList<Integer>();

            for (int i=0; i <numList.size(); i++){
            if (numList.get(i)%2==0) {
                numEven.add(numList.get(i));
            }
        }

        int sum=0;
            for(int i=0; i< numEven.size(); i++) {
            sum += numEven.get(i);
        }
        System.out.println(sum);
    }
}
