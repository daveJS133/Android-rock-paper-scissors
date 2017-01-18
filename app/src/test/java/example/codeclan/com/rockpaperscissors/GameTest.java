package example.codeclan.com.rockpaperscissors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/01/2017.
 */
public class GameTest {

    Game game;
    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void make_choice() throws Exception {
        setUp();
        String com_C = game.make_choice();

        int made_choice = 0;

        if(com_C.equals("Rock")){
            made_choice += 1;
        }
        if(com_C.equals("Paper")){
            made_choice += 1;
        }
        if(com_C.equals("Scissors")){
            made_choice += 1;
        }

        assertEquals(1,made_choice);
    }

    @Test
    public void play() throws Exception {
        setUp();
        assertEquals("You Lose", game.play("Rock","Paper"));
    }

}