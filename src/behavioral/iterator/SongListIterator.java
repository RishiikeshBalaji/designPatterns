package behavioral.iterator;

import java.util.List;

class SongListIterator implements Iterator {
    private List<String> songs;
    private int position;

    public SongListIterator(List<String> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public String next() {
        return hasNext() ? songs.get(position++) : null;
    }
}