package ComplexCalc.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import ComplexCalc.controller.CalcNumberController;
import ComplexCalc.model.ComplexNumber;

public class CalcNumberView {
    CalcNumberController calcNumberController = new CalcNumberController();
    Logger logger = Logger.getLogger(CalcNumberView.class.getName());
    CalcNumberController result;

    public void addComplexNumber() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter sFormat = new SimpleFormatter();
            fileHandler.setFormatter(sFormat);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите действительную часть первого числа: ");
            int real = scanner.nextInt();
            System.out.print("Введите мнимую часть первого числа: ");
            int imaginary = scanner.nextInt();
            ComplexNumber num1 = new ComplexNumber(real, imaginary);
            System.out.print("Введите действительную часть второго числа: ");
            real = scanner.nextInt();
            System.out.print("Введите мнимую часть второго числа: ");
            imaginary = scanner.nextInt();
            ComplexNumber num2 = new ComplexNumber(real, imaginary);

            logger.log(Level.INFO, "Пользователь ввёл два числа: первое " + num1 + ", второе " + num2);
            char operation = addChoiceView();
            logger.log(Level.INFO, "Пользователь выбрал операцию: " + operation);
            calcNumberController.checkOperation(operation, num1, num2);
            scanner.close();
        } catch (IOException e) {
            logger.warning("Ошибка записи в файл");
        } catch (NumberFormatException e){
            logger.warning("Неверный ввод числа. Преобразование к целому числу невозможно");
        } catch (Exception e){
            logger.warning(e.getMessage());
        }
    }

    public char addChoiceView() {
        System.out.println("Введите число соответствующее операции: \n 1. Сложение. \n 2. Вычитание \n 3. Умножение");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 | choice > 3) {
            try {
                choice = scanner.nextInt();
                if (choice < 1 | choice > 3){
                    System.out.println("Вы неверно ввели операцию. Поробуйте снова!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
                logger.log(Level.WARNING, "Пользователь ввёл некорректную операцию для действий с числами");
            }
        }
        scanner.close();

        return checkChoice(choice);
    }

    public char checkChoice(int choice) {
        switch (choice) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
        }
        return '0';
    }

}
