package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();

        System.out.println("--- Moveable (All Birds) ---");
        List<Moveable> moveableBirds = new ArrayList<>();
        moveableBirds.add(penguin);
        moveableBirds.add(ostrich);
        moveableBirds.add(sparrow);
        moveableBirds.add(eagle);

        for (Moveable bird : moveableBirds) {
            bird.move(); // ทุกตัวทำงานได้ปกติ ไม่มีตัวไหนพังหรือโยน Exception
        }

        System.out.println("\n--- Flyable (Flying Birds Only) ---");
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        for (Flyable bird : flyingBirds) {
            bird.fly(); // เรียกใช้ฟังก์ชันบิน
        }
    }
}