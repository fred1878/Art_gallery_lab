import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Artwork1","Artist1",0);
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Artwork1");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Artist1");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(0);
    }

    @Test
    public void hasNft(){
        assertThat(artwork.getNft()).isNotNull();
    }
}
