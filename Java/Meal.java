public class Meal {

    public static double calculateTotalMealPrice(double MealPrice, double tipRate, double taxRate) {
        double tip = MealPrice * tipRate;
        double tax = MealPrice * taxRate;
        double total = MealPrice + tip + tax;
        return total;
    }
    public static void main(String[] args) {
        double groupTotal = calculateTotalMealPrice(200, 0.8, 0.5);
        double indvTotal = groupTotal / 5;
        System.out.println("Your individual total is: " + indvTotal);
    }
}
