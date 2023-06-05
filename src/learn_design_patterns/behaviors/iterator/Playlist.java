package learn_design_patterns.behaviors.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public int getSize() {
        return songs.size();
    }

    public Song getSong(int index) {
        if (index >= 0 && index < songs.size()) {
            return songs.get(index);
        } else {
            return null;
        }
    }

    public SongIterator createIterator() {
        return new PlaylistIterator(this);
    }
}
