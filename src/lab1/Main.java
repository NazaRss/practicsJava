package lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu.mainmenu();

//        oks_rab();

//       Student iv = new Student("Ivan");
//       Student pe = new Student("Petr");
//       iv.setPomoshnik(pe);
//       iv.printInf();


    }

    public static String scan() {
        Scanner sc = new Scanner(System.in, "CP1251"); // кодировка чтобы можно было писать русские буквы
        String sh = sc.nextLine();
        return sh;
    }

    public static void fibonaci() {
        int lo = 1;
        int hi = 1;
        System.out.println("Rad fibonaci, chetniie chilsa so znakom '*'");
        System.out.print("1 ");
        while (hi < 56) {

            hi = lo + hi;
            lo = hi - lo;

            String mark;
            if ((hi % 2) == 0) {
                mark = "*";
            } else {
                mark = "";
            }
            System.out.print(hi + mark + " ");
        }
        System.out.println();
    }

    public static void signs() {
        int kol = 0;
        String stroka = "lal, ooo. sss, ...";
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == (',') | stroka.charAt(i) == ('.')) {
                kol++;
            }
        }
        System.out.println("Начальная строка = " + stroka);
        System.out.println("Кол-во знаков препинания = " + kol);
    }

    public static void strk() {

        String stroka = " oko . rofl, olo kok";
        System.out.println("Начальная строка:" + stroka);

        String tr = new String(stroka.trim());
        tr = tr + " ";

        String fst = "";
        String result = "";
        int pr = 0;

        tr = tr.replaceAll("\\.", " ");
        tr = tr.replaceAll(",", " ");

        while (tr.indexOf("  ") > 0) {
            tr = tr.replaceAll("  ", " ");
        }

        System.out.print("Строка преобразованная:");
        for (int i = 0; i < tr.length(); i++) {
            if (tr.charAt(i) == (' ')) {

                fst = tr.substring(pr, i);

                if (fst.charAt(0) == fst.charAt(fst.length() - 1)) {

                    result = result + " " + fst;
                }
                pr = i + 1;
                fst = "";
            }
        }
        System.out.print(result);
    }

    public static void oks_rab() {

        String stroka = "lol okiyu";
        System.out.println("Начальная строка:" + stroka);

        String tr = new String(stroka.trim());
        tr = tr + " ";

        String fst = "";
        String result = "";
        int pr = 0;

        tr = tr.replaceAll("\\.", " ");
        tr = tr.replaceAll(",", " ");

        while (tr.indexOf("  ") > 0) {
            tr = tr.replaceAll("  ", " ");
        }

        System.out.print("Найденное(ые) слово(а):");

        int kol = 0;
        int i = 0;

        for (int hol = tr.length() / 2; hol > i; hol--) {

            if (tr.charAt(i) == (' ')) {

                fst = tr.substring(i, hol);

                System.out.println(fst);

            }

        }
    }

    public static void comments() {

        //        Fibonaci fib1 = new Fibonaci();
//        fib1.fib(5);
//        Fibonaci fib2 = new Fibonaci();
//        fib2.fib(15);

        //        Text txt = new Text("test,. ada fd.. ,fsf dd");
//
//        System.out.print("Изначальная строка: ");
//        txt.print();
//        txt.printPunct();
//        txt.strk();
//
//        System.out.print("\nСтрока преобразованная: ");
//        txt.print();
//
//        System.out.print("\nRad fibonaci, chetniie chilsa so znakom '*'");
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("\nВведите число до которого должен идти счёт фибоначи: ");
//        int n = in.nextInt();
//        Fibonaci.fib(n);

//       java.util.Scanner in = new java.util.Scanner(System.in); // сначала нужно указать in а потом a = in.nextInt()
    }
}
