package ex43;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 43 - Website Generator
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and
the author in a <meta> tag.

Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.
 */

public class App {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        //gather inputs

        System.out.print("Site name: ");
        String siteName = in.next();
        System.out.print("Author: ");
        String author = in.next();
        System.out.print("Do you want a folder for JavaScript? (Y/N) ");
        String javaScript = in.next();
        System.out.print("Do you want a folder for CSS? (Y/N) ");
        String css = in.next();

        //generate html file

        String html = "<div><h1>"+siteName+"</h1><p>"+author+"</p></div>";
        File f = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3" +
                "\\src\\main\\java\\index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        if(javaScript.equalsIgnoreCase("y")){
            File g = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3" +
                    "\\src\\main\\java\\js");
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(g));
            String html2 = "<div>JavaScript</div>";
            bw2.write(html2);
            bw2.close();
        }
        if(css.equalsIgnoreCase("y")){
            File h = new File("C:\\Users\\chris\\IdeaProjects\\klingbiel-cop3330-assignment3" +
                    "\\src\\main\\java\\css");
            BufferedWriter bw3 = new BufferedWriter(new FileWriter(h));
            String html3 = "<div>CSS</div>";
            bw3.write(html3);
            bw3.close();
        }
        bw.write(html);
        bw.close();
    }
}
