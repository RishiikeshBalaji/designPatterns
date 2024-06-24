package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        SongList songList = new SongList();
        songList.addSong("Song 1");
        songList.addSong("Song 2");
        songList.addSong("Song 3");

        Iterator songIterator = songList.createIterator();

        while (songIterator.hasNext()) {
            System.out.println("Playing: " + songIterator.next());
        }
    }
}