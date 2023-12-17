/*
 * 
 * You can use the following import statements
 * import org.springframework.jdbc.core.RowMapper;
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * 
 */

// Write your code here

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song> {
    @Override
    public Song mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Song song = new Song();
        song.setSongId(resultSet.getInt("songId"));
        song.setSongName(resultSet.getString("songName"));
        song.setLyricist(resultSet.getString("lyricist"));
        song.setSinger(resultSet.getString("singer"));
        song.setMusicDirector(resultSet.getString("musicDirector"));
        return song;
    }
}
