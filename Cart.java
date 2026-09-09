// A public (means any method in any class can call this method) class - Cart, for object items and item count has been created.
public class Cart{

    // The two private (Data Encapsulation - only methods that can access these instance fields are the methods of the Cart class itself) instance variables required are its items and itemCount.
    // By placing an array of FoodItem class into Cart class we are establishing a HAS-A relationship between them.
    private FoodItem[] items; //--> HAS-A relation.
    private int itemCount;

    // A constructor has been created to initialize all the objects of class Cart.
    Cart() {
        this.items = new FoodItem[20];
        this.itemCount = 0;
    }

    // Setter methods - basically methods with just rules.
    void addItem(FoodItem item) {
        if (item.getAvailability()) {
            if (itemCount < items.length) {
                items[itemCount] = item;
                itemCount++;
            }
            else {
                System.out.println(item.getName() + "is currently unavailable.");
            }
        }
    }

    void removeItem(FoodItem item) {
        int index =-1;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] == item) {
                index = i;
                break;
            }
        }

        // Shifting all the items in cart to proper index after removing an item.
        if (index != -1) {
            for (int i = index; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }
            items[itemCount - 1] = null;
            itemCount--;
        }
    }
    
    // Getter method for Data Encapsulation (no one can modify the instance field once its entered).
    FoodItem[] getItems() {
        return items;
    }

    int getItemCount() {
        return itemCount;
    }

    double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    void viewCart() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getName() + " : ₹" + items[i].getPrice());
        }
    }

    // Method to clear cart.
    void clearCart() {
        for (int i = 0; i < itemCount; i++) {
            items[i] = null;
        }
        itemCount = 0;
    }
}

}