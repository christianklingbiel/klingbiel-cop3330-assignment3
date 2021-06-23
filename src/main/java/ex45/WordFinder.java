package ex45;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {
    public static List<String> replaceWord(List<String> input){
        List <String> output = new ArrayList<>();
        //replaces utilize with use
        for(int i = 0;i < input.size();i++){
            output.add(input.get(i).replace("utilize","use"));
        }
        return output;

    }

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3\\src\\main\\java\\exercise45_input.txt");
        Scanner in = new Scanner(f);
        List<String> line = new ArrayList<>();
        while(in.hasNextLine()){
            line.add(in.nextLine());
        }

        promptOutputFileName(replaceWord(line));


    }
    public static void promptOutputFileName(List<String> line) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the name of your output file? ");
        File f = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3" +
                "\\src\\main\\java\\"+in.nextLine());
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        for(int i = 0;i < line.size();i++){
            bw.write(line.get(i));
        }

        bw.close();
    }
}
