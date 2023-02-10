package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3AppTest {
    @Test
    public void loginIntoAppTest() {
        Mp3 oraimo = new Mp3();
        oraimo.isLogin(true);
        boolean loginToOraimo = oraimo.isLogin();
        assertTrue(loginToOraimo);
    }

    @Test
    public void playlistTest() {
        Mp3 oraimo = new Mp3();
        //oraimo.playlist("playlist");
        String myPlayList = oraimo.showMyPlayList();
        assertNotNull(myPlayList);
    }
    @Test
    public void mySongsTest(){
        Mp3 oraimo = new Mp3();
        String mySongs = oraimo.showMySongs();
        assertNotNull(mySongs);
    }
    @Test
    public void batteryPercentageTest(){
        Mp3 oraimo = new Mp3();
        String genre = oraimo.displayMyGenre();
    }
}

