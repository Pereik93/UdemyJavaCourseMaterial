import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<>();

    public void addGroceryItem(String item){
        groceries.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceries.size() + " items on the list");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println(i + 1 + ". " + groceries.get(i));
        }
    }
        public void updateGroceryItem(int position, String newItem){
            groceries.set(position, newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified");
     }

     public void removeGroceryItem(int position){
            String theItem = groceries.get(position);
            groceries.remove(position);
         System.out.println(theItem + " has been removed");
     }
}
