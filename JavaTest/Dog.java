class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog () {
        this.name = "default";
        this.breed = "default";
        this.age = -1;
        this.color = "default";
    } 

    public Dog (String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return ("Hi, my name is " + this.getName() + "\n" + "I am " + this.getAge());
    }
}