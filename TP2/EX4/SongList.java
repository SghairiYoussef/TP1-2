import java.util.List;
import java.util.ArrayList;
public abstract class SongList {
    List<Song> Set = new ArrayList<>();
    private String listTitle;
    public void addSong(Song S) {
        Set.add(S);
    }
    public SongList(String T) {
        listTitle=T;
    }
    public int songCount() {
        return Set.size();
    }
    public void removeSong(Song S) {
        if (!Set.contains(S)) {
            System.out.println("This song doesn't exist in list");
        } else {
            Set.remove(S);
        }
    }
    public String ListGenre() {
        String ch="";
        for (int i =0;i<Set.size();i++) {
            if (!ch.contains((Set.get(i)).getGenre())) {
                ch+=","+(Set.get(i)).getGenre();
            }
        }
        return ch;
    }
    public abstract void listDisplay();
    public String getListTitle() {
        return listTitle;
    }
}