import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);


                ArrayList<String> listA = new ArrayList<>();
                ArrayList<String> listB = new ArrayList<>();


                for (int i = 0; i < 5; i++) {                //список А
                    System.out.println("Введите строку для списка А : ");
                    listA.add(scanner.nextLine());
                }

                System.out.println("Список A:");
                for (String item : listA) {
                    System.out.println(item);
                }




                for (int i = 0; i < 5; i++) {
                    System.out.println("Введите строку для списка B : ");         //Список Б
                    listB.add(scanner.nextLine());

                }
                System.out.println("Список B :");
                for (String item : listB) {
                    System.out.println(item);
                }



                ArrayList<String> listC = new ArrayList<>();

                for (int i = 0; i < 5 ; i++) {   // А + Б = С
                    listC.add(listA.get(i));
                    listC.add(listB.get(4 - i));
                }

                System.out.println("Список C : ");
                for (String item : listC) {
                    System.out.println(item);
                }
                Collections.sort(listC, Comparator.comparingInt(String::length));


                System.out.println("Отсортированный список C:");
                for (String item : listC) {
                    System.out.println(item);
                }
            }

        }

    