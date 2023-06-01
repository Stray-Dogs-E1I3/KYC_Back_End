package e1.i3.e1i3.util;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.math.BigInteger;
public class gasToEtherConverter {

    public static double convertGasToEther(String gasHex) {
        double gasUsed = new BigInteger(gasHex.substring(2), 16).doubleValue();
        double wei = Convert.toWei(Double.toString(gasUsed), Convert.Unit.GWEI).doubleValue();
        double ether = Convert.fromWei(BigDecimal.valueOf(wei), Convert.Unit.ETHER).doubleValue();
        return ether;
    }

}
