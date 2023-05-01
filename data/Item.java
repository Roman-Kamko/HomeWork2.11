package edu.skypro.hamework2_11.data;

public class Item {
    private int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "товар id: " + this.id;
    }
}
