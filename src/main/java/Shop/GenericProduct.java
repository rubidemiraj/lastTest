package Shop;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product {
    private Supplier<Double>priceSupplier;
 private Function<Date,Boolean>availability;
    public GenericProduct(Supplier<Double> supplier){
        this.priceSupplier=supplier;
    }
    @Override
    public double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public boolean isAvailable(Date date) {
        return availability.apply(date);
    }
}
