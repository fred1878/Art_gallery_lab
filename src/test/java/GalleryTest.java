import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork1;
    Artwork artwork2;
    Artwork artwork3;
    Customer customer;
    Artist artist1;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Gallery1");
        artist1 = new Artist("Artist1");
        artwork1 = new Artwork("Artwork1",artist1.getArtistname(),5);
        artwork2 = new Artwork("Artwork2","Artist2",11);
        artwork3 = new Artwork("Artwork3","Artist3",20);
        customer = new Customer("Customer1", 5);
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        artist1.addArtistArtwork(artwork1);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Gallery1");
    }

    @Test
    public void hasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void hasArtwork(){
        assertThat(gallery.getArtworks().size()).isEqualTo(2);
    }

    @Test
    public void artworkHasTitle(){
        assertThat(artwork1.getTitle()).isEqualTo("Artwork1");
    }

    @Test
    public void tillReceivesWallet(){
        gallery.addMoney(5);
        assertThat(gallery.getTill()).isEqualTo(5);
    }

    @Test
    public void tillReceivesMoneyForArtwork(){
        gallery.addMoney(artwork1.getPrice());
        assertThat(gallery.getTill()).isEqualTo(5);
    }

    @Test
    public void customerPaysForArtwork1(){
        customer.walletPay(artwork1.getPrice());
        assertThat(customer.getWallet()).isEqualTo(0);
    }

    @Test
    public void hasStock_take(){
        assertThat(gallery.stock_take()).isEqualTo(16);
    }

    @Test
    public void removeArtworkFromGallery(){
        gallery.removeArtwork(artwork2);
        assertThat(gallery.getArtworks().size()).isEqualTo(1);
    }

    @Test
    public void purchaseWithCollection(){
        gallery.customerPurchase(artwork1,customer,artist1);
        assertThat(artist1.getArtistartworks().size()).isEqualTo(0);
        assertThat(gallery.getArtworks().size()).isEqualTo(1);
        assertThat(customer.getCustomerartworks().size()).isEqualTo(1);
        assertThat(customer.getWallet()).isEqualTo(0);
        assertThat(gallery.getTill()).isEqualTo(5);
    }

    @Test
    public void noDuplicateNft(){

    }

}
