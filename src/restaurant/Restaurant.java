package restaurant;

public class Restaurant {
    public static void main(String[] args){
        MenuItem pizza = new MenuItem("Pizza", 10.00, "Cheese Pizza", "main course");
        MenuItem potatoSkins = new MenuItem("Potato Skins", 8.00, "Cheese Bacon Potato Skins", "appetizer");
        MenuItem cheeseCake = new MenuItem("Cheese Cake", 5.00, "Cheery Cheese Cake", "dessert");

        Menu menu1 = new Menu();

        menu1.addMenuItem(pizza);
        menu1.addMenuItem(potatoSkins);
        menu1.addMenuItem(cheeseCake);

        menu1.removeMenuItem(potatoSkins);
        System.out.println(menu1.toString());

    }

}
