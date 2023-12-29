public class App {
    public static void main(String[] args) {

        Artist artist = new Artist("John Doe");
        Album album = new Album("Album Title", artist, "2023-01-01");
        Song song = new Song(180, "Song Title", "Pop", 0, artist, album, "2023-01-01");
        artist.addAlbum(album);
        album.addSong(song);
        artist.ListAlbums();
        FreeUser freeUser = new FreeUser("FreeUser123","Paragon");
        freeUser.addToPlaylist(song);
        freeUser.listen();
        PremiumUser premiumUser=new PremiumUser("Premium", "Haja");
        premiumUser.addToPlaylist(song);
        premiumUser.listen();
        premiumUser.listen(song);
    }
}