package ex44;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    void sort() throws Exception{
        String expected = "What is the product name?";
        ProductSearch test = new ProductSearch();
        assertEquals(test.readProductName(),expected);
    }
}
