import java.util.ArrayList;

public class Album extends SongList {
    private Artist artist;
    private String albumReleaseDate;
    public Album(String T,Artist A,String D) {
        super(T);
        Set=new ArrayList<>(30);
        artist=A;
        albumReleaseDate=D;
    }
    public void listDisplay() {
        System.out.println(artist.getName()+" - "+getListTitle()+"("+albumReleaseDate+") "+ "Tracklist: ");
        for (int i =0;i<Set.size();i++) {
            System.out.println(Set.get(i).getTitle());
        }
    }
}