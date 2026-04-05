package main;

import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Manages the inventory of RPG Loot.
 */
public class LootManager {
    private ArrayList<Loot> inventory;

    private LootManager() {
        this.inventory = new ArrayList<>();
    }

    public static LootManager load(String filePath) throws FileNotFoundException {
        return null;
    }

    public void save(String filePath) throws FileNotFoundException {
        return;
    }

    public void add(Loot loot) {
        return;
    }

    /**
     * Polymorphically displays all items in the inventory.
     */
    public void displayInventory() {
        System.out.println();
        System.out.println("--- Current Inventory ---");
        for (Loot item : inventory) {
            // TODO: Step 4 - Uncomment the line below
            // System.out.println(item.getName() + " [" + item.getRarity() + "] - " +
            // item.getEffectDescription());
        }
        System.out.println("-------------------------");
        System.out.println();
    }
}