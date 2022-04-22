import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;
    Artwork artwork1;
    Artwork artwork2;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Customer1",5);
        artwork1 = new Artwork("Artwork1","Artist1",5);
        artwork2 = new Artwork("Artwork2","Artist2",11);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Customer1");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(5);
    }

    @Test
    public void walletCanPay(){
        customer.walletPay(5);
        assertThat(customer.getWallet()).isEqualTo(0);
    }

    @Test
    public void customerReceivesArtwork(){
        customer.addCustomerArtwork(artwork1);
        assertThat(customer.getCustomerartworks().size()).isEqualTo(1);
    }

}
