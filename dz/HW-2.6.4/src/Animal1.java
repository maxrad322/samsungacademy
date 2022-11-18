public interface Animal1 {
    String speak();

}

class Cat1 implements Animal1 {
    public String speak() {
        return "Miy";
    }
}

class Dog1 implements Animal1 {
    public String speak() {
        return "Gav";
    }
}