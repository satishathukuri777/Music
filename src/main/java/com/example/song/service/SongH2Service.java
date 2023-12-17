import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

import java.util.List;
@Service
public class SongH2Service {
    private final SongRepository songRepository;

    @Autowired
    public SongH2Service(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs() {
        return songRepository.getAllSongs();
    }

    public Song getSongById(int songId) {
        return songRepository.getSongById(songId);
    }

    public Song addSong(Song song) {
        return songRepository.addSong(song);
    }

    public Song updateSong(int songId, Song song) {
        return songRepository.updateSong(songId, song);
    }

    public void deleteSong(int songId) {
        songRepository.deleteSong(songId);
    }
}