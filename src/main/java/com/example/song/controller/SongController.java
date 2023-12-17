/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @PostMapping
    public ResponseEntity<Song> addSong(@RequestBody Song song) {
        Song addedSong = songService.addSong(song);
        return new ResponseEntity<>(addedSong, HttpStatus.CREATED);
    }

    @GetMapping("/{songId}")
    public ResponseEntity<Song> getSongById(@PathVariable int songId) {
        Song song = songService.getSongById(songId);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @PutMapping("/{songId}")
    public ResponseEntity<Song> updateSong(@PathVariable int songId, @RequestBody Song song) {
        Song updatedSong = songService.updateSong(songId, song);
        return new ResponseEntity<>(updatedSong, HttpStatus.OK);
    }

    @DeleteMapping("/{songId}")
    public ResponseEntity<Void> deleteSong(@PathVariable int songId) {
        songService.deleteSong(songId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
