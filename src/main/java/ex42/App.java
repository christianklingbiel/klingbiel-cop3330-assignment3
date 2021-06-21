package ex42;
import java.io.File;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 42 - Parsing a Data File

Sometimes data comes in as a structured format that you have to break down and turn into records
so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file
yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Process the records and display the results formatted as a table, evenly spaced, as shown
in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500
Constraints
Write your own code to parse the data. Don't use a CSV parser.
 */

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
        Scanner in = new Scanner(file);
        List<String> input = new ArrayList<>();
        while(in.hasNextLine()){
            input.add(in.nextLine());
        }
        List<String[]> inputParts = new ArrayList<>();
        for(int i = 0;i < input.size();i++){
            inputParts.add(input.get(i).split(","));
        }
        System.out.println("Last\tFirst\tSalary");
        System.out.println("-----------------------");
        for(int i = 0;i < inputParts.size();i++){
            for(int j = 0;j < 3;j++){
                System.out.print(inputParts.get(i)[j] + "   \t");
                if(j%3==2){
                    System.out.println();
                }
            }
        }
    }
}
