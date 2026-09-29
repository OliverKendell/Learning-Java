abstract class Pokemon{
    int health = 100;
    String name;
    public Pokemon(String name) {
        this.name = name;
    }
    public abstract void attack(Pokemon target);
    //Public so other classes can access it
    // Abstract so every childin this case FirePokemon and WaterPokemon
    // Must provide their own version and void so it doesnt return a value
}

class FirePokemon extends Pokemon{
    public FirePokemon(String name) {
        super(name);
    }
    @Override
    public void attack(Pokemon target) {
        System.out.println("Fire Pokemon Attacks!");
        target.health = target.health - 20;
    }
}

class WaterPokemon extends Pokemon{
    public WaterPokemon(String name) {
        super(name);
    }
    @Override
    public void attack(Pokemon target) {
        System.out.println("Water Pokemon Attacks!");
        target.health = target.health - 40;
    }
}



public class Main {
    public static void main(String[] args) {

        System.out.println("Program Started");

        FirePokemon charmander = new FirePokemon("Charmander");
        WaterPokemon squirtle = new WaterPokemon("Squirtle");

        charmander.attack(squirtle);
        System.out.println(squirtle.health);
        squirtle.attack(charmander);
        System.out.println(charmander.health);
    }
}


