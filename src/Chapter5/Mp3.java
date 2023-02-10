package Chapter5;
public class Mp3 {
    private boolean login;
    public void isLogin(boolean condition) {
        this.login = login;
        if (condition = true)
            login = true;
    }

    public boolean isLogin() {
        return login;
    }

    public String showMyPlayList() {
        String playlist = """
                1.My Favourite
                2.Recently Added
                3.Recently Added
                4.My Top Tracks
                """;
        return playlist;
    }

    public String showMySongs() {
        String songs = """
                1. Tope Alabi - Hallelujah
                2. Yinka Ayefele - New Dawn
                3. Obesere - Egungun Be Careful
                4. Portable - Zazuu
                """;
        return songs;

    }

    public String displayMyGenre() {
        String genre = """
                1. Fuji
                2. gospel
                3. HipHop
                4. Apala
                """;
        return genre;
    }
}
