// Write your code here

public class Song {
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    // Constructors

    // Getter methods
    public int getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public String getLyricist() {
        return lyricist;
    }

    public String getSinger() {
        return singer;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    // Setter methods
    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
}
