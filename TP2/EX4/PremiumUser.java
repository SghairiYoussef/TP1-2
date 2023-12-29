public class PremiumUser implements User{
    private String Username;
    private Playlist PUplaylist;
    public PremiumUser(String username,String pn) {
        Username=username;
        PUplaylist=new Playlist(pn,this);
    }
    public void listen(Song S) {
        S.playSong();
    }
    public void listen() {
        PUplaylist.shuffle();
        for(int i=0;i<PUplaylist.Set.size();i++) {
            PUplaylist.Set.get(i).playSong();
        }
    }
    public void addToPlaylist(Song S) {
        PUplaylist.addSong(S);
    }
    public String getUsername() {
        return Username;
    }
    public void removeFromPlaylist(Song S) {
        if(PUplaylist.Set.contains(S)) {
            PUplaylist.removeSong(S);
        } else {
            System.out.println(S.getTitle()+"not in "+PUplaylist.getListTitle());
        }
    }
}