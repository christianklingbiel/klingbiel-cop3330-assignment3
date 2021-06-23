package ex42;

import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    @DisplayName ("The program should read values separated by commas and format them")
    void sort() throws Exception{
        List<String> strings = new ArrayList<>();
        strings.add("Christian,Klingbiel,100000");
        strings.add("Michael,Jackson,20500");
        strings.add("Benjamin,Franklin,650000");
        strings.add("Peter,Parker,55000");

        List<String[]>expected = new ArrayList<>();

    }
}
