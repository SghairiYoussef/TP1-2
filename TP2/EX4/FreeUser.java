public class FreeUser implements User {
    private String Username;
    private Playlist FUplaylist;
    public FreeUser(String username,String pn) {
        Username=username;
        FUplaylist=new Playlist(pn,this);
    }
    public void listen() {
        FUplaylist.shuffle();
        for(int i=0;i<FUplaylist.Set.size();i++) {
            FUplaylist.Set.get(i).playSong();
        }
    }
    public void addToPlaylist(Song S) {
        if (FUplaylist.Set.size()<100) {
            FUplaylist.addSong(S);
        } else {
            System.out.println("Playlist is full, upgrade to Premium to add unlimited songs");
        } 
    }
    public String getUsername() {
        return Username;
    }
    public void removeFromPlaylist(Song S) {
        if(FUplaylist.Set.contains(S)) {
            FUplaylist.removeSong(S);
        } else {
            System.out.println(S.getTitle()+"not in "+FUplaylist.getListTitle());
        }
    }
}