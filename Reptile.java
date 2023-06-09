package OPP.HW2.Animal.Type;

public abstract class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Рептилии %s", super.toString());
    }
}