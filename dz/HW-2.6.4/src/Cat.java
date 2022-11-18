abstract class Animal {
    public abstract String speak();
}
class Cat extends Animal {
    public String speak() {
        return "Miy";
    }
}

class Dog extends Animal {
    public String speak() {
        return "Gav";
    }
}
