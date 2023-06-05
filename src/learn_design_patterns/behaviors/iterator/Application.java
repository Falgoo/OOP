package learn_design_patterns.behaviors.iterator;

public class Application {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Son Tung", "Co chac yeu la day"));
        playlist.addSong(new Song("Son Tung", "Con mua ngang qua"));
        playlist.addSong(new Song("Son Tung", "Dung ve tre"));
        playlist.addSong(new Song("Son Tung", "Nang am xa dan"));
        playlist.addSong(new Song("Son Tung", "Anh sai roi"));

        SongIterator songIterator = playlist.createIterator();
        while (songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }
    }

}
