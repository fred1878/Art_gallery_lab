import java.util.ArrayList;

public class Artist {

    private ArrayList<Artwork> artistartworks;
    private String artistname;

    public Artist(String artistname) {
        this.artistartworks = new ArrayList<>();
        this.artistname = artistname;
    }

    public ArrayList<Artwork> getArtistartworks() {
        return artistartworks;
    }

    public String getArtistname() {
        return artistname;
    }

    public void addArtistArtwork(Artwork artwork){
        artistartworks.add(artwork);
    }

    public void removeArtistArtwork(Artwork artwork){
        artistartworks.remove(artwork);
    }
}
