public class Song {
    private int songLength;
    private String genre;
    private String Title;
    private int playCount;
    private Artist artist;
    private SongList album;
    private String ReleaseDate;
    public Song(int sl,String T, String g,int pc,Artist A,Album Al,String Rd) {
        songLength=sl;
        Title=T;
        genre=g;
        playCount=pc;
        artist=A;
        album=Al;
        ReleaseDate=Rd;
    }
    public void playSong() {
        System.out.println("Now playing :"+Title+" - "+artist.getName());
        playCount++;
    }
    public int getSongLength() {
        return songLength;
    }
    public String getGenre() {
        return genre;
    }
    public String getTitle() {
        return Title;
    }
    public String artistName() {
        return artist.getName();
    }
    public String albumName() {
        return album.getListTitle();
    }
    public int getPlayCount() {
        return playCount;
    }
    public String getReleaseDate() {
        return ReleaseDate;
    }
}