package Shop;

import java.util.Date;

public interface Product {
    double getPrice();
    boolean isAvailable(Date date);
}
