import java.util.ArrayList;
import java.util.List;

public class Nft {
    private static List<Double> allNFTs = new ArrayList<>();

    public static double genNFT() {
        double newNFT = Math.random();
        if(!allNFTs.contains(newNFT)){
            allNFTs.add(newNFT);
            return newNFT;
        } else {
            return genNFT();
        }
    }
}
