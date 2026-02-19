package oop.lsp;

public class Eagle implements Flyable {

    @Override
    public void move() {
        System.out.println("Eagle is walking along a large branch.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }
}