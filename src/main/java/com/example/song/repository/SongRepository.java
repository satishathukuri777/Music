// Write your code here

import java.util.List;

public interface SongRepository {
    List<Song> getAllSongs();

    Song getSongById(int songId);

    Song addSong(Song song);

    Song updateSong(int songId, Song song);

    void deleteSong(int songId);
}
