import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(new Dishes("Lagman", 225, "1"));
        menu.add(new Dishes("Pasta", 300, "0,7"));
        menu.add(new Dishes("Pizza", 250, "30 cm"));
        menu.add(new Drinks("Coca-cola", 70, "0.3 l"));
        menu.add(new Drinks("Tea", 30, "1 l"));
        menu.add(new Drinks("Coffee", 150, "0.4 l"));
        menu.add(new Salad("Cesar", 120, "0.4"));
        menu.add(new Salad("Shakarap", 100, "0.4"));
        menu.add(new Salad("Olivie", 130, "0.4"));
        menu.add(new Disert("Bliny", 80,"2 pieces"));
        menu.add(new Disert("Ice Cream", 50,"1 pieces"));
        menu.add(new Disert("Krasnyi barhat", 100,"1 pieces"));


    getByName(menu,"Tea");
    sortByPrice(menu);
    getAll(menu);
    remove(menu,"Pasta");
    }
    public static void create(ArrayList<Menu>menu){
        User officiat = new User("oficiant");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dishes: ");
        String dishes = sc.nextLine();
        System.out.println("Drinks: ");
        String drinks = sc.nextLine();
        System.out.println("Salad: ");
        String salad = sc.nextLine();
        System.out.println("Disert: ");
        String disert = sc.nextLine();
        for (int i = 0; i < menu.size(); i++) {
        if(menu.get(i).getName().equals(dishes) || drinks.equals(menu.get(i).getName()) || salad.equals(menu.get(i).getName()) || disert.equals(menu.get(i).getName())){
        }
            System.out.println("the ordering food succesfully added" + menu.get(i));
        }
    }
    public static void remove(ArrayList<Menu>menu, String name){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.size(); i++) {
            if(menu.remove(menu.get(i).getName().equals(name))){
            }
            System.out.println(menu.get(i));
        }
    }
    public static void getByName(ArrayList<Menu>menu,String name){
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getName().equals(name)){
                System.out.println(menu.get(i));
            }
        }
    }
    public static void getAll(ArrayList<Menu>menu){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("All products of our restaurant");
            System.out.println(menu.get(i));
        }
    }
    public static void sortByPrice(ArrayList<Menu>menu){
        menu.sort(Comparator.comparing(Menu::getPrice));
        System.out.println("Sorting by price: ");
        menu.forEach(System.out::println);
        }
    }
