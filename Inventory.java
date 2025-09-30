import java.util.ArrayList;

public class Inventory {
  private ArrayList<Item>;
  public Inventory() {
    item = new ArrayList<>();
  }
  public void addItem(Item item) {
    item.add(item);
  }
  public void displayInventory() {
    for (Item item : items) {
      System.out.println(“Item: “ + item.getName() + “, Quantity: “ +
                         item.getQuantity());
    }
  }
