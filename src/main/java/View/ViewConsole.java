package View;

import java.util.Scanner;

public class ViewConsole {

    public void displayMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-- LISTA DE CONTACTOS -- \n");
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Ver contactos");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Exit" );
    }

    public String getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        return input;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
