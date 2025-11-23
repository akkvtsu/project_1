package org.example;

import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF\u200D";
    private final int x, y;
    Random r = new Random();

    Monster(int sizeBoard){
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    Scanner sc = new Scanner(System.in);

    public boolean conflictPerson(int perX, int perY){
        return perY - 1 == this.y && perX - 1 == this.x;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        while (true) {

                int x = r.nextInt(100);
                int y = r.nextInt(100);
                int trueAnswer = x + y;
                System.out.println("Реши пример: " + x + " + " + y + " = ?");
            if (sc.hasNextInt()) {
                Scanner sc = new Scanner(System.in);
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

