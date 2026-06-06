import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");
        String[] shoppingList = new String[5];
        int productCount = 0;
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
                if (productCount < 5) {
                    String productName = scanner.next();
                    shoppingList[productCount++] = productName;
                    System.out.println("Добавлен товар:" + productName);
                } else {
                    System.out.println("Корзина полна. Отложите покупку до следующего раза");
                }
            } else if (actionNumber == 2) {
                boolean found = false;
                for (int index = 0; index < productCount; index++) {
                    System.out.println(index + ". " + shoppingList[index]);
                }
            } else if (actionNumber == 3) {
                for (int index = 0; index < productCount; index++) {
                    shoppingList[index] = null;
                    System.out.println("Список очищен");
                }
            } else if (actionNumber == 4) {
                System.out.println("Программа завершена");
                break;
            }
        }
        System.out.println("я");
    }
}



