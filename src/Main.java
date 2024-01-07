public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко",100,1,1);
        vasyaBasket.add("Кефир",100,1,1);
        vasyaBasket.print("\n" +  " Корзина пользователя: " + "\n" + "Васи");
        System.out.println();

        Basket katiaBasket = new Basket();
        katiaBasket.add("Вода", 100, 1, 1);
        katiaBasket.add("Квас", 100, 1, 1);
        katiaBasket.add("Сок", 100, 1,1);
        katiaBasket.print(" Корзина пользователя: " + "\n" + "Кати");
        System.out.println();

        System.out.println("Стоимость всех корзин: " + Basket.getCommonPrice());
        System.out.println("Количество всех товаров: " + Basket.getCommonCount());
        System.out.println("Средняя цена товаров во всех корзинах: " + Basket.getAveragePrice());


        System.out.println();

    }
}
