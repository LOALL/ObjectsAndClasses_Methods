public class Basket {
    private String items = "";
    public int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    //Static
    private static int count = 0;
    private static int commonPrice = 0;
    private static int commonCount = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров: ";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    //Static methods

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }


    public static int getCommonPrice() {
        return commonPrice;
    }

    public static void allPrice(int totalPrice, int count) {
        Basket.commonPrice = Basket.commonPrice + totalPrice * count;
    }

    public static int getCommonCount() {
        return commonCount;
    }

    public static void allCount(int count) {
        Basket.commonCount = Basket.commonCount + count;
    }

    public static int getAveragePrice() {
        return Basket.commonPrice / Basket.commonCount;
    }




    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);
    }
    public void add(String name, int price, int count, double weight) {
        totalWeight = totalWeight + count * weight;


        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + " руб. " + "- " + weight + " кг.";

        totalPrice = totalPrice + count * price;
        allCount(count);
        allPrice(price, count);

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }

        System.out.println("Общая стоимость: " + totalPrice + " руб. " + "\n" + "Общий вес: " + totalWeight + " кг. " );
    }
}
