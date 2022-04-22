import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    Artist artist1;
    Artwork artwork1;

    @BeforeEach
    public void setUp() {
        artist1 = new Artist("Artist1");
        artwork1 = new Artwork("Artwork1",artist1.getArtistname(),5);
    }

    @Test
    public void artistHasName(){
        assertThat(artist1.getArtistname()).isEqualTo("Artist1");
    }

    @Test
    public void artistCanAddArtwork(){
        artist1.addArtistArtwork(artwork1);
        assertThat(artist1.getArtistartworks().size()).isEqualTo(1);
    }
}
