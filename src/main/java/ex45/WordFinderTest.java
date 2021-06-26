package ex45;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFinderTest {
    void sort() throws Exception{
        List<String> input = new ArrayList<>();
        input.add("utilize utilize utilize");

        List<String> expected = new ArrayList<>();
        expected.add("use use use");

        assertEquals(WordFinder.replaceWord(input),expected);
    }
}
