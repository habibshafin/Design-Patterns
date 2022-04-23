public class vanillaShake extends shake {
    public vanillaShake() {
        rate = 190;
        ingredients.add("milk");
        ingredients.add("vanilla flavouring");
        ingredients.add("jello");
        ingredients.add("sugar");
    }

    @Override
    void baseIngredients() {
        System.out.println("vanilla shake");
        System.out.println("Price :" + rate);
        System.out.println("All basic ingredients");
        for (int i = 0; i < ingredients.size(); i++)
            System.out.print(ingredients.get(i) + " , ");
        System.out.println();
        System.out.print("added Ingredients:   ");
        for (int i = 0; i < addedIngredients.size(); i++)
            System.out.print(addedIngredients.get(i) + " , ");
        System.out.println();
    }

    @Override
    void addIngredient(String ing) {
        if (ing.equalsIgnoreCase("almond milk")) {
            ingredients.set(0, "almond milk");
            rate = rate + 60;
        } else if (ing.equalsIgnoreCase("candy")) {
            addedIngredients.add("candy");
            rate = rate + 50;
        }
        else if (ing.equalsIgnoreCase("cookie")){
            addedIngredients.add("cookie");
            rate = rate + 40;
        }
    }
}
