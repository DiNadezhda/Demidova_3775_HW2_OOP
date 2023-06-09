package OPP.HW2.Animal;

import OPP.HW2.Animal.Type.Amphibian;
import OPP.HW2.Base.Soundable;
import OPP.HW2.Base.SwimSpeed;

public class Frog extends Amphibian implements SwimSpeed, Soundable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Ква-ква";
    }

    @Override
    public String feed() {
        return "насекомые";
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Лягушка: %s, Питание: %s, Скорость передвижения: %d", super.toString(), feed(), getSwimSpeed());
    }
}
