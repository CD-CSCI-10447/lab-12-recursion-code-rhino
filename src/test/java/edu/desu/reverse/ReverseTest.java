package edu.desu.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void wordRevTest01(){
        Reverse reverse = new Reverse();
        String word = "hello";
        String expected = "olleh";
        String actual = reverse.wordRev(word);
        Assertions.assertEquals(expected, actual);

    }
}
