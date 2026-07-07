import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    void displayMeal();
}

class VegetarianMeal implements MealPlan {
    public void displayMeal() {
        System.out.println("Vegetarian Meal: Paneer, Rice, Salad");
    }
}

class VeganMeal implements MealPlan {
    public void displayMeal() {
        System.out.println("Vegan Meal: Tofu, Quinoa, Vegetables");
    }
}

class KetoMeal implements MealPlan {
    public void displayMeal() {
        System.out.println("Keto Meal: Chicken, Eggs, Avocado");
    }
}

class HighProteinMeal implements MealPlan {
    public void displayMeal() {
        System.out.println("High Protein Meal: Fish, Brown Rice, Broccoli");
    }
}

class Meal<T extends MealPlan> {

    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

public class PersonalizedMealPlanGenerator {

    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        meal.getMeal().displayMeal();
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> protein = new Meal<>(new HighProteinMeal());

        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

        mealPlans.add(veg);
        mealPlans.add(vegan);
        mealPlans.add(keto);
        mealPlans.add(protein);

        System.out.println("Personalized Meal Plans:");

        for (Meal<? extends MealPlan> meal : mealPlans) {
            generateMeal(meal);
        }
    }
}