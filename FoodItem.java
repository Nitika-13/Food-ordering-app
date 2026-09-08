public class FoodItem {
    String fi_name;
    double fi_price;
    boolean fi_availability;

    FoodItem(String name, double price) {
        this.fi_name = name;
        this.fi_price = price;
    }

    FoodItem(String name, double price, boolean availability) {
        this.fi_name = name;
        this.fi_price = price;
        this.fi_availability = availability;
    }

    String getfi_name() {
        return fi_name;
    }

    double getfi_price() {
        return fi_price;
    }

    boolean getfi_availability() {
        return fi_availability;
    }

    void setAvailability(boolean fi_availability){
        this.fi_availability = fi_availability;
    }
}
