public class Entity {
    private String greeting;
    Entity(String greeting)
    {
        this.greeting = greeting;
    }

    public void showOutput() {
        System.out.print(greeting + " ");
    }
}
