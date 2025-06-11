package Controller;
import Model.Contact;
import Model.LinkedList;
import Model.Node;
import View.ViewConsole;

public class ContactManager {
    private LinkedList<Contact> contacts;
    private ViewConsole cV = new ViewConsole();

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact contact){
        contacts.appendToTail(contact);

    }

    public Contact findContactByName(String name){
        Node<Contact> current = contacts.getHead();

        while (current != null) {
            Contact contact = current.getValue();
            if (contact.getName().equals(name)) {
                return contact;
            }
            current = current.getNext();
        }

        return null;
    }

    public void deleteContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        Node<Contact> previous = null;

        while (current != null) {
            Contact contact = current.getValue();
            if (contact.getName().equals(name)) {
                if (previous == null) {
                    contacts.setHead(current.getNext());
                } else {
                    previous.setNext(current.getNext());
                }
                contacts.setSize(contacts.getSize() - 1);
                cV.showMessage("Contacto eliminado: " + contact);
                return;
            }
            previous = current;
            current = current.getNext();
        }

        cV.showMessage("Contacto no encontrado.");
    }

    public void printList() {
        Node<Contact> current = contacts.getHead();

        if (current == null) {
            cV.showMessage("La lista de contactos está vacía.");
            return;
        }

        cV.showMessage("Lista de contactos:");

        while (current != null) {
            cV.showMessage(current.getValue().toString());
            current = current.getNext();
        }
    }



}