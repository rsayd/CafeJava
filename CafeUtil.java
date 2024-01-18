import java.util.ArrayList;

class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;

        for (int i = 1; i <= 10; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s", i, menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) { 
        System.out.println("Please Enter your name:"); 
        String userName = System.console().readLine(); 
        System.out.println("Hello, " + userName); 
        System.out.printf("There are %s people infront of you", customer.size());
        customers.add(userName)
    }
}
