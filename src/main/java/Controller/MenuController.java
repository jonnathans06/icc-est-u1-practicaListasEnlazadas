package Controller;

import Model.Contact;
import View.ViewConsole;

public class MenuController {

    private ContactManager contactManager;
    private ViewConsole consoleView;


    public MenuController(ContactManager contactManager, ViewConsole consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        String option;

        do {
            consoleView.displayMenu(); // Muestra el menú
            option = consoleView.getInput("Seleccione una opción:");

            switch (option) {
                case "1":
                    String name = consoleView.getInput("Ingrese el nombre:");
                    String phone = consoleView.getInput("Ingrese el teléfono:");
                    contactManager.addContact(new Contact(name, phone));
                    consoleView.showMessage("Contacto añadido exitosamente.");
                    break;

                case "2":
                    String searchName = consoleView.getInput("Ingrese el nombre a buscar:");
                    Contact found = contactManager.findContactByName(searchName);
                    if (found != null) {
                        consoleView.showMessage("Contacto encontrado: " + found);
                    } else {
                        consoleView.showMessage("Contacto no encontrado.");
                    }
                    break;

                case "3":
                    String deleteName = consoleView.getInput("Ingrese el nombre del contacto a eliminar:");
                    contactManager.deleteContactByName(deleteName);
                    break;

                case "4":
                    contactManager.printList();
                    break;

                case "5":
                    consoleView.showMessage("Saliendo del programa...");
                    break;

                default:
                    consoleView.showMessage("Opción inválida. Intente nuevamente.");
            }

        } while (!option.equals("5"));
    }
}