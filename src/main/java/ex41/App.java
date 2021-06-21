package ex41;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 41 - Name Sorter

Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable
manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt`
and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following
example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
Don't hard-code the number of names.
 */

public class App {
    public static void main(String[] args) throws Exception{
        //identify file
        File file = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3\\src\\main\\java\\exercise41_input.txt");
        List<String> list = new ArrayList<>();
        int count = 0;
        Scanner in = new Scanner(file);
        //scan file
        //add to list
        while(in.hasNextLine()){
            list.add(in.nextLine());
        }
        //sort list
        java.util.Collections.sort(list);
        System.out.println("Total of " + list.size() + " names");
        System.out.println("-----------------");
        //print list
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
