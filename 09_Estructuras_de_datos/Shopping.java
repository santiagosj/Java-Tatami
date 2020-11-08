import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        // this code will not work
       /* String[] groceryItems = {"steak", "milk", "jelly beans"};
        double[] prices = {25.00, 2.95, 2.50};
        
        // Adding ham to the groceries
        groceryItems[3] = "ham";
        prices[3] = 4.99;*/

        ArrayList<String> shoppingCart = new ArrayList<String>();

        shoppingCart.add("Trench Coat");
        System.out.println(shoppingCart.size());
        // 1 is printed
        shoppingCart.add("Tweed Houndstooth Hat");
        System.out.println(shoppingCart.size());
        // 2 is printed
        shoppingCart.add("Magnifying Glass");
        System.out.println(shoppingCart.size());
        // 3 is printed
        
        // modifing a value
        shoppingCart.set(0, "Tweed Cape");
        shoppingCart.add("Beer");
        shoppingCart.remove(1);
        
        int indexList = shoppingCart.indexOf("Beer");
        
        System.out.println(indexList);
    }
}
