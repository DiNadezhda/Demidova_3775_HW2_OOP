package OPP.HW2.Animal;

import OPP.HW2.Animal.Type.Amphibian;
import OPP.HW2.Base.Soundable;
import OPP.HW2.Base.SwimSpeed;

public class Turtle extends Amphibian implements SwimSpeed, Soundable {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Шшшшш";
    }

    @Override
    public String feed() {
        return "листья";
    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Черепаха: %s, Питание: %s, Скорость передвижения: %d", super.toString(), feed(), getSwimSpeed());
    }
}
