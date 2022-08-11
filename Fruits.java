class Fruit { }

class Apple extends Fruit {
    public void makeAppleCider() {
        System.out.println("Making apple cider.");
    }
}

class Orange extends Fruit {
    public void makeOrangeJuice() {
        System.out.println("Making orange juice.");
    }
}

class GoldenDelicious extends Apple { }

class Macintosh extends Apple { }

class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof Macintosh);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);

        // Commented lines do not compile.
        // System.out.println(orange instanceof Apple);

        // fruit.makeAppleCider();
        // orange.makeAppleCider();
        orange.makeOrangeJuice();

        // Orange p = new Apple();
        // Macintosh p = new Apple();
    }
}
