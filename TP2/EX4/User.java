public interface User {
    void listen();
    void addToPlaylist(Song S);
    void removeFromPlaylist(Song S);
    String getUsername();
}