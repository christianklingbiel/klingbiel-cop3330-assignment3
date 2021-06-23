package ex41;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @DisplayName("Names should be sorted alphabetically from A to Z")
    void sort() throws Exception {
        //Given
        List<String> names = new ArrayList<>();
        names.add("Zach");
        names.add("Fred");
        names.add("Susan");
        names.add("Arya");

        List<String> expected = new ArrayList<>();
        expected.add("Arya");
        expected.add("Fred");
        expected.add("Susan");
        expected.add("Zach");

        App nameSorter = new App();

        //nameSorter.sort();

        assertEquals(expected, names);
    }
}
