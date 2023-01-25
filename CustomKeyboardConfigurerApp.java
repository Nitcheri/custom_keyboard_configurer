package custom_keyboard_configurer;

package custom_keyboard_configurer;

import org.project.repository.AccountRepository;
import org.project.repository.OrderRepository;
import org.project.repository.ProductRepository;
import org.project.repository.impl.AccountRepositoryImpl;
import org.project.repository.impl.OrderRepositoryImpl;
import org.project.repository.impl.ProductRepositoryImpl;

import custom_keyboard_configurer.repository.KeycapsRepository;
import custom_keyboard_configurer.repository.SetRepository;
import custom_keyboard_configurer.repository.SwitchesRepository;
import custom_keyboard_configurer.repository.impl.KeycapsRepositoryImpl;
import custom_keyboard_configurer.repository.impl.SwitchesRepositoryImpl;
import custom_keyboard_configurer.repository.impl.SetRepositoryImpl;

import java.io.IOException;
import java.util.Scanner;

public class CustomKeyboardConfigurerApp {
    private static final KeycapsRepository KEYCAPS_REPOSITORY = KeycapsRepositoryImpl.getInstance();
    private static final SwitchesRepository SWITCHES_REPOSITORY = SwitchesRepositoryImpl.getInstance();
    private static final SetRepository SET_REPOSITORY = SetRepositoryImpl.getInstance();


    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("1 - Найти пользователя по id,  2 - Найти пользователя по имени, 3 - Найти продукт по id, 4 - Найти продукт по названию, 5 - Найти заказ по id\n");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Введите id пользователя: ");
                    int idAccount = in.nextInt();
                    System.out.println(KEYCAPS_REPOSITORY.findAccountById(idAccount));
                }
                case 2 -> {
                    System.out.println("Введите имя пользователя: ");
                    String nameAccount = in.nextLine();
                    System.out.println(ACCOUNT_REPOSITORY.findAccountByName(nameAccount));
                }
                case 3 -> {
                    System.out.println("Введите id продукта: ");
                    int idProduct = in.nextInt();
                    System.out.println(PRODUCT_REPOSITORY.findProductById(idProduct));
                }
                case 4 -> {
                    System.out.println("Введите название продукта: ");
                    String nameProduct = in.nextLine();
                    System.out.println(PRODUCT_REPOSITORY.findProductByName(nameProduct));
                }
                case 5 -> {
                    System.out.println("Введите id заказа: ");
                    int idOrder = in.nextInt();
                    System.out.println(ORDER_REPOSITORY.findOrderById(idOrder));
                }
            }
        }
    }
}
