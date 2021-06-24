package ex42;

import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @DisplayName ("The program should read values separated by commas and format them")
    void sort() throws Exception{
        List<String> strings = new ArrayList<>();
        strings.add("Christian,Klingbiel,100000");
        strings.add("Michael,Jackson,20500");
        strings.add("Benjamin,Franklin,650000");
        strings.add("Peter,Parker,55000");

        List<String[]>expected = new ArrayList<>();
        //expected.get(1) = ["Christian"]["Klingbiel"]["100000"];     (having trouble adding to a list of string arrays)
        //expected.get(2) = ["Michael"]["Jackson"]["20500"];
        //expected.get(3) = ["Benjamin"]["Franklin"]["650000"];
        //expected.get(4) = ["Peter"]["Parker"]["55000"];

        assertEquals(App.conversion(strings), expected);
    }
}
