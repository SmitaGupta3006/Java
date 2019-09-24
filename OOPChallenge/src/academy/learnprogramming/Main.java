package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White", "Sausage", "Basic", 3.56);
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon" , 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

    }
}
