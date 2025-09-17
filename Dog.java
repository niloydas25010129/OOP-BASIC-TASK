class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", "Bulldog");
        Dog d2 = new Dog("Bella", "Beagle");
        d1.setName("Charlie");
        d2.setBreed("Labrador");
        d1.display();
        d2.display();
    }
}
