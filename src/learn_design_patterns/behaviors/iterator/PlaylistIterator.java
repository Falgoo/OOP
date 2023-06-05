package learn_design_patterns.behaviors.iterator;

public class PlaylistIterator implements SongIterator {

    Playlist playlist;
    private int currentSong;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
        this.currentSong = 0;
    }

    @Override
    public boolean hasNext() {
        return currentSong < playlist.getSize();
    }

    @Override
    public Song next() {
        if (hasNext()) {
            Song song = playlist.getSong(currentSong);
            currentSong++;
            return song;
        } else {
            return null;
        }
    }
}
