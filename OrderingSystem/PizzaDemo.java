
public class PizzaDemo {
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
        Pizza pizza3 = new Pizza();

        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(3);
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        order1.setPizza3(pizza3);
        double total1 = order1.calcTotal();

        System.out.println(order1.getPizza1().getDescription());
        System.out.println(order1.getPizza2().getDescription());
        System.out.println(order1.getPizza3().getDescription());
        System.out.printf("Total cost1: $ %.2f",total1);
        System.out.println();

        PizzaOrder order2 = new PizzaOrder(order1);
        order2.getPizza1().setNumCheeseToppings(3);
        double total2 = order2.calcTotal();

        System.out.println(order2.getPizza1().getDescription());
        System.out.println(order2.getPizza2().getDescription());
        System.out.println(order2.getPizza3().getDescription());
        System.out.printf("Total cost2: $ %.2f",total2);
        System.out.println();

        double origTotal = order1.calcTotal();
        System.out.printf("Total cost1: $ %.2f",origTotal);
    }
}
