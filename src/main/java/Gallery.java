import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    public ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(double paid){
        till += paid;
    }

    public double stock_take(){
        double stock_total = 0;
        for(Artwork artwork : artworks){
            stock_total += artwork.getPrice();
        } return stock_total;
    }

    public void removeArtwork(Artwork a){
        artworks.remove(a);
    }

    public void customerPurchase(Artwork artwork,Customer customer,Artist artist){
        removeArtwork(artwork);
        artist.removeArtistArtwork(artwork);
        addMoney(artwork.getPrice());
        customer.walletPay(artwork.getPrice());
        customer.addCustomerArtwork(artwork);
    }
}
