package com.walking.lesson16_abstract_class_interface.task2;

import com.walking.lesson16_abstract_class_interface.task2.Answer;
import com.walking.lesson16_abstract_class_interface.task2.impl.*;

import java.util.Scanner;


/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3/Task2SwitchCase.java">...</a>
 * с использованием интерфейсов. Каждая реализация должна возвращать свое сообщение.
 */
public class Main {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();
        Answer a;

//        Используем конструкцию switch-case для переменной s
        switch (s) {

            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                a=new HiAnswer();
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                a = new ByeAnswer();
                break;

            case "How are you":
                a = new HowAreYouAnswer();
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                a = new UnknownAnswer();
        }
        a.answer();
    }
}
