package brain.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainTest(){
        String text = Main.reString();
        assertEquals("a", text);
    }

}