import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;


public class NftTest {

    Nft nft;

    @BeforeEach
    public void setUp() {
        nft = new Nft();
    }

    @Test
    public void nftReturnsValue(){
        assertThat(nft.genNFT()).isNotNull();
    }

}
