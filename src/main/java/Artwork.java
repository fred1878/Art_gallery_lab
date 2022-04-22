public class Artwork {
    private String title;
    private String artist;
    private double price;
    private double nft;

    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = Nft.genNFT();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public double getNft() {
        return nft;
    }
}
