import java.util.Collections;
public class Playlist extends SongList{
    private User user;
    public Playlist(String T,User u) {
        super(T);
        user=u;
    }
    public void listDisplay() {
        System.out.println(getListTitle()+" - "+user.getUsername()+" Tracklist: ");
        for (int i =0;i<Set.size();i++) {
            System.out.println(Set.get(i).getTitle());
        }
    }
    public void shuffle() {
        Collections.shuffle(Set);
    }
}