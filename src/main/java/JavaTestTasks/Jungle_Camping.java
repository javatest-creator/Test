package JavaTestTasks;

import java.util.Scanner;

/*

Jungle Camping

You are camping alone out in the jungle and
you hear some animals in the dark nearby.
Based on the noise they make, determine which animals they are.

Task:
You are given the noises made by different animals
that you can hear in the dark, evaluate each noise
to determine which animal it belongs to.
Lions say 'Grr', Tigers say 'Rawr', Snakes say 'Ssss', and Birds say 'Chirp'.

Input Format:
A string that represent the noises that you hear with a space between them.

Output Format:
A string that includes each animal that you hear with a space after each one.
(animals can repeat)

Sample Input:
Rawr Chirp Ssss

Sample Output:
Tiger Bird Snake

Explanation:
You heard the noise made by a tiger, then a bird, and then a snake.

*/

public class Jungle_Camping {
    public static void main(String[] args) {

        String L = "Lion", T = "Tiger", S = "Snake", B = "Bird";
        String[] Animals = new String[10];

        Scanner sc = new Scanner((System.in));
        String scString = sc.nextLine();
        String[] Sounds = scString.split (" ");

        for (int i = 0; i < Sounds.length; i++ ){
            if (Sounds[i].equals("Grr")) {Animals[i] = L;}
            else if (Sounds[i].equals("Rawr")) {Animals[i] = T;}
            else if (Sounds[i].equals("Ssss")) {Animals[i] = S;}
            else if (Sounds[i].equals("Chirp")) {Animals[i] = B;}
        }
        for (int i = 0; i < Sounds.length; i++) {
            System.out.print(Animals[i] + " ");}
    }
}
