package Shop;

public class OrderService {
    protected Basket basket;
    private Object Double;

    public OrderService(Basket basket) {
        this.basket = basket;
    }

    public double getTotal() {
        //entryset kthen set me map te tipit entry
        return basket.getProductList().entrySet().stream()
                .mapToDouble(o -> o.getValue() * o.getKey().getPrice())
                .reduce(0d,(o,a)->a=a+o);


    }
