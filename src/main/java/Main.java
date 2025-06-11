import View.ViewConsole;
import Controller.*;
import Model.*;

public class Main {
    public static void main(String[] args) {


        LinkedList<Contact> listaContactos = new LinkedList<>();

        Contact contacto1 = new Contact("Pedrito", "123456789");
        Contact contacto2 = new Contact("Piñas", "987654321");
        Contact contacto3 = new Contact("Jonnathan", "456789123");
        Contact contacto4 = new Contact("Brandi", "345678943");
        Contact contacto5 = new Contact("Erick", "987654367");

        listaContactos.appendToTail(contacto1);
        listaContactos.appendToTail(contacto2);
        listaContactos.appendToTail(contacto3);
        listaContactos.appendToTail(contacto4);
        listaContactos.appendToTail(contacto5);


        LinkedList<Contact> list = new LinkedList<>();
        ViewConsole view = new ViewConsole();
        ContactManager manager = new ContactManager();
        MenuController menu = new MenuController(manager, view);
        menu.showMenu();

    }
}
