import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerartworks;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerartworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet(){
        return wallet;
    }

    public void walletPay(double pay){
        wallet -= pay;
    }

    public ArrayList<Artwork> getCustomerartworks(){
        return customerartworks;
    }

    public void addCustomerArtwork(Artwork artwork){
        customerartworks.add(artwork);
    }
}
