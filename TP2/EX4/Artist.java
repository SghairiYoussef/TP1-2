import java.util.List;
import java.util.ArrayList;
public class Artist {
    List<Album> Discography = new ArrayList<>();
    private String name;
    public Artist(String n) {
        name=n;
    }
    public String getName() {
        return name;
    }
    public void addAlbum(Album A) {
        Discography.add(A);
    }
    public void removeAlbum(Album A) {
        if (!Discography.contains(A)) {
            System.out.println("Album "+A.getListTitle()+"is not in"+name+"'s discography");
        } else {
            Discography.remove(A);
        }
    }
    public void ListAlbums() {
        System.out.println(name+"'s Discography: ");
        for (int i=0;i<Discography.size();i++) {
            System.out.println(Discography.get(i).getListTitle());
        }
    } 
}