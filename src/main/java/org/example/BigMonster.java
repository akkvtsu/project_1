package org.example;

import java.util.Scanner;

public class BigMonster extends Monster{

    private String image = "\uD83D\uDC79";

    BigMonster(int sizeBoard) {super(sizeBoard);
    }

    //    @Override
    public String getImage() {
        return image;
    }

    //    @Override
    public void setImage(String image) {
        this.image = image;
    }

    // переопредилим метод:
    @Override
    public boolean taskMonster(int difficultGame){
        System.out.println("Решите задачу:");
        if (difficultGame == 1){
            return taskMonster();
        }else {
            while (true) {
                int x = r.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
                int y = r.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
                int z = r.nextInt(100 * (difficultGame - 1), 100 * difficultGame);
                int trueAnswer = x * y - z;
                System.out.println("Реши пример: " + x + " * " + y + " - " + z + " = ?");
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    int ans = sc.nextInt();
                    if (trueAnswer == ans) {
                        System.out.println("Верно! Ты победил монстра");
                        return true;
                    }
                    System.out.println("Ты проиграл эту битву!");
                    return false;
                }
                System.out.println("Некорректный ввод, Введите число");
                sc.next();

            }
        }

    }

    public boolean taskMonster() {
        return super.taskMonster(0);
    }
}