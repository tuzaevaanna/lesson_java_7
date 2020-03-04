public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murzik", 50),
                new Cat("Barsik", 10),
                new Cat("Persik", 30),
                new Cat("Pushok", 25),
                new Cat("Ryzhik", 35)
        };

        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
