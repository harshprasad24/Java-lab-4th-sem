class Animal {
    private String species;
    public Animal(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }
}
class Mammal extends Animal {
    private boolean isWarmBlooded;
    public Mammal(String species, boolean isWarmBlooded) {
        super(species);
        this.isWarmBlooded = isWarmBlooded;
    }
    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }
}
class Dog extends Mammal {
    private String breed;
    public Dog(String species, boolean isWarmBlooded, String breed) {
        super(species, isWarmBlooded);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", true, "Golden Retriever");
        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Warm-blooded: " + dog.isWarmBlooded());
        System.out.println("Breed: " + dog.getBreed());
        dog.bark();
    }
}

