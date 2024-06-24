package behavioral.iterator;
import java.util.ArrayList;
import java.util.List;

class SongList implements SongCollection {
    private List<String> songs;

    public SongList() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    @Override
    public Iterator createIterator() {
        return new SongListIterator(songs);
    }
}