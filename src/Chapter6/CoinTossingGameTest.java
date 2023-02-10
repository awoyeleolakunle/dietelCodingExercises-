package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossingGameTest {
    private CoinTossGame coinTossGame;

    @BeforeEach
    public void setUp(){
        coinTossGame = new CoinTossGame();
    }

        @Test
        public void testThatGameExist(){
            CoinTossGame coinTossGame  = new CoinTossGame();
            assertNotNull(coinTossGame);
        }
        @Test
        public void testMenuOption(){
      String menu = CoinTossGame.getGameMenu();
     // assertNotNull(menu);
            assertTrue(menu.equals("""
                    1. Toss Coin
                    2. Exit Game
                    """));
        }
        @Test
        public void flip(){
        String outcome = coinTossGame.flip();
        assertNotNull(outcome);
        }

        @Test
        public void testCountOutCome(){
        coinTossGame.flip();
        assertTrue(coinTossGame.getHeadsCount()==1||coinTossGame.getTailsCount()==1);
        }

    }


