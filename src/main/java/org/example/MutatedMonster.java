package org.example;

import java.util.Scanner;
import java.util.Random;

public class MutatedMonster extends Monster {
    private String image = "\uD83D\uDC09";


    MutatedMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        if (difficultGame == 1) {
            return taskMonster();
        } else {
            while (true) {
                Random r = new Random();
                Scanner sc = new Scanner(System.in);
                int x = r.nextInt(120);
                if (x >= 50 && x < 100) {
                    System.out.println("В каком году закончилась Великая Отечественная Война?");
                    if (sc.hasNextInt()) {
                        int ans = sc.nextInt();
                        int ans1 = 1945;
                        if (ans == ans1) {
                            System.out.println("Ты победил");
                            return true;
                        }
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    } else {
                        System.out.println("Неккоректный ход");

                    }
                }


                if (x < 50) {
                    System.out.println("в каком году распался СССР?");
                    if (sc.hasNextInt()) {
                        int ans2 = 1991;
                        int ans = sc.nextInt();
                        if (ans == ans2) {
                            System.out.println("Ты победил");
                            return true;
                        }
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    } else {
                        System.out.println("Неккоректный ход");
                    }

                }
                if (x >= 100) {
                    if (sc.hasNextInt()) {
                        int x1 = r.nextInt(10);
                        int x2 = r.nextInt(10);
                        int sum = x1 + x2;
                        System.out.println("Внимание! Сложный Вопрос!");
                        System.out.println(x1 + " + " + x2 + " = ?");
                        int ans = sc.nextInt();
                        if (sum == ans) {
                            System.out.println("Ого, ты ответил правильно, Босс побежден!" + "");
                            return true;
                        }
                        System.out.println("Ты проиграл эту битву!");
                        return false;
                    } else {
                        System.out.println("Неккоректный ход");
                    }

                }
            }

        }

    }

        public boolean taskMonster () {
            return super.taskMonster(0);
        }

}