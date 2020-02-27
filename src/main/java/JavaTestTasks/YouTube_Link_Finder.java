package JavaTestTasks;

import java.util.Scanner;

/*
You and your friends like to share YouTube links all throughout the day.
You want to keep track of all the videos you watch in your own personal notepad,
but you find that keeping the entire link is unnecessary.
Keep the video ID (the combination of letters and numbers at the end of the link)
in your notepad to slim down the URL.

Task:
Create a program that parses through a link, extracts and outputs the YouTube video ID.

Input Format:
A string containing the URL to a YouTube video.
The format of the string can be in "https://www.youtube.com/watch?v=kbxkq_w51PM"
or the shortened "https://youtu.be/KMBBjzp5hdc" format.

Output Format:
A string containing the extracted YouTube video id.

Sample Input:   https://www.youtube.com/watch?v=RRW2aUSw5vU

Sample Output:  RWW2aUSwvU

Note that the input can be in two different formats.
*/

public class YouTube_Link_Finder {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        String scString = sc.nextLine();

        if (scString.indexOf("=") != -1) {

            String[] id_eq = scString.split("=");
            int i = id_eq.length-1;
            System.out.println(id_eq[i]);
        }else {
            String[] id_sl = scString.split("/");
            int j = id_sl.length-1;
            System.out.println(id_sl[j]);
        }
    }
}
