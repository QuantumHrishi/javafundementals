abstract class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void move();
}

class LandAnimal extends Animal {
    public LandAnimal(String name) {
        super(name);
    }
    
    
    public void move() {
        System.out.println(name + " walks on land");
    }
}

class SeaAnimal extends Animal {
    public SeaAnimal(String name) {
        super(name);
    }
    
    
    public void move() {
        System.out.println(name + " swims in water");
    }
}

class FlightAnimal extends Animal {
    public FlightAnimal(String name) {
        super(name);
    }
    
    
    public void move() {
        System.out.println(name + " flies in air");
    }
}

class Dog extends LandAnimal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends LandAnimal {
    public Cat(String name) {
        super(name);
    }
}

class Fish extends SeaAnimal {
    public Fish(String name) {
        super(name);
    }
}

class Shark extends SeaAnimal {
    public Shark(String name) {
        super(name);
    }
}

class Bird extends FlightAnimal {
    public Bird(String name) {
        super(name);
    }
}

class Flies extends FlightAnimal {
    public Flies(String name) {
        super(name);
    }
}