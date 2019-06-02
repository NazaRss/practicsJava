/* mainmenu()
 *  1 - Работа со строкой
 *      work_strk()
 *      1 - Ввод вручную                                ?
 *      2 - Читать из файла
 *          advanced_menu()
 *          1 - Посчитавть колво знаков препинания
 *          2 - Найти в строке слова по условию
 *          3 - Изменить строку                         ?
 *          4 - Вывести строку
 *          5 - сохранить в файл
 *          0 - главное меню
 *  2 - Работа с Фибоначчи
 *      fibmenu()
 *      1 - Сгенерировать до указанного значения
 *      2 - Прочитать из файла
 *      3 - Сохранить в файл
 *      0 - главное меню
 *  0 - Выход
 *  
 *  //1 ввод строки вручную, подсчёт количества знаков препинания, поиск по условию, вывод строки, сохранение в файл      0
 *  //2 ввод из файла, подсчёт, поиск, изменение строки, вывод и сохранение 0
 *  //3 1 3
 *  //4 2 3 
 * 
 */
package lab1;

import java.util.Scanner;

public class Menu {

    static Text txt = new Text();
    static Fibonaci fib;

    public static String scan() {
        Scanner sc = new Scanner(System.in, "CP1251"); // кодировка чтобы можно было писать русские буквы
        String sh = sc.nextLine();
        return sh;
    }

    public static void mainmenu() {
        char choice = 0;

        do {
            System.out.println("Меню: \n 1. Работа со строкой \n 2. Работа с Фибоначчи \n 0. Выход");
            choice = scan().charAt(0);

            switch (choice) {
                case ('1'): {
                    work_strk();
                }
                break;

                case ('2'): {
                    fibmenu();
                }
                break;
            }
        } while (choice != '0');
    }

    public static void work_strk() {
        char choice = 0;
        do {
            System.out.println("Работа со строкой: \n 1. Ввод вручную \n 2. Читать из файла \n 0. Выход");
            choice = scan().charAt(0);

            switch (choice) {
                case ('1'): {
                    System.out.println("Введите строку");
                    txt.setText(scan());
                    advanced_menu();
                }
                break;

                case ('2'): {
                    txt.setText(flss.read("test.txt"));
                    System.out.println("Прочитано из файла. Строка: ");
                    txt.print();
                    System.out.println("");
                    advanced_menu();
                }
                break;
            }
        } while (choice != '0');
    }

    public static void advanced_menu() {
        char choice = 0;

        System.out.println("Меню: \n 1. Посчитавть колво знаков препинания \n 2. Найти в строке слова по условию "
                + "\n 3. Изменить строку \n 4. Вывести строку \n 5. сохранить в файл \n 0. Главное меню\n");


        do {

            choice = scan().charAt(0);

            switch (choice) {
                case ('1'): {
                    txt.calcPunct();
                    txt.printPunct();
                }
                break;

                case ('2'): {
                    txt.strk();
                }
                break;

                case ('3'): {
                    txt.setText(scan());
                }
                break;

                case ('4'): {
                    txt.print();
                }
                break;

                case ('5'): {
                    flss.write("test.txt", txt.getStr());
                    System.out.println("Сохранено в файл");
                }
                break;
            }
        } while (choice != '0');
    }

    public static void fibmenu() {
        char choice = 0;

        System.out.println("Работа с Фибоначчи: \n 1. Сгенерировать до указанного значения \n 2. Прочитать из файла \n 3. Сохранить в файл \n 0. Выход");
        do {
            choice = scan().charAt(0);

            switch (choice) {
                case ('1'): {
                    System.out.println("Введите значение:");
                    int kolvo = Integer.parseInt(scan());
                    fib = new Fibonaci();
                    fib.fib(kolvo);
                    System.out.println("");
                }
                break;

                case ('2'): {
                    int kolvo = Integer.parseInt(flss.read("test.txt"));
                    fib = new Fibonaci();
                    fib.fib(kolvo);
                    System.out.println("Прочитано из файла.");
                }
                break;    

                case ('3'): {
                    if (fib != null) {
                        flss.write("test.txt", fib.getStr());
                        System.out.println("Сохранено в файл");
                    } else {
                        System.out.println("Вначале сгенерируйте");
                    }
                }
                break;
            }
        } while (choice != '0');
    }
}
