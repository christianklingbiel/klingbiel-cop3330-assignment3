package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordTable {
    private HashMap<String, WordCounter> wordCounts = new HashMap<>();
    private String inputPath;
    private int maxWordLength;

    public WordTable(String inputPath){
        this.inputPath = inputPath;
    }

    public void build(){
        String word;
        try(Scanner input = new Scanner(getClass().getClassLoader().getResourceAsStream(inputPath))){
            while(input.hasNext()){
                word = input.next();
                WordCounter currentWord = wordCounts.getOrDefault(word, new WordCounter(word));
                currentWord.count += 1;
                wordCounts.put(word, currentWord);

                if(word.length() > maxWordLength){
                    maxWordLength = word.length();
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void print(){
        List<WordCounter> counts = new ArrayList<>(wordCounts.values());
        counts.sort((x, y) -> y.count - x.count);
        for(WordCounter wc : counts){
            System.out.printf("%-"+maxWordLength+"s:%s%n",wc.word,"*".repeat(wc.count));
        }
    }
}
