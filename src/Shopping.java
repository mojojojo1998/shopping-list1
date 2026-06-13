import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Введите название товара");
                String productName = scanner.next();

                boolean found = shoppingList.contains(productName);

                if (found) {
                    System.out.println("Такой товар уже есть в корзине");
                } else {
                    shoppingList.add(productName);
                    String first = shoppingList.get(0);
                    System.out.println("Добавлен товар: " + productName);
                }
            } else if (actionNumber == 2) {
                for (int index = 0; index < shoppingList.size(); index++) {
                    System.out.println((index + 1) + ". " + shoppingList.get(index));
                }
            } else if (actionNumber == 3) {
                shoppingList.clear();
                System.out.println("Список очищен");
            }  else if (actionNumber == 4) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Такого варианта нет. Попробуйте еще раз");
            }
        }
    }
}



