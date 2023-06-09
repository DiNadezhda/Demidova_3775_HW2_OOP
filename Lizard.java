package OPP.HW2.Animal;

import OPP.HW2.Animal.Type.Amphibian;
import OPP.HW2.Base.Soundable;
import OPP.HW2.Base.SwimSpeed;

public class Lizard extends Amphibian implements SwimSpeed, Soundable {
    public Lizard(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Шлёп";
    }

    @Override
    public String feed() {
        return "насекомые";
    }

    @Override
    public int getSwimSpeed() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Ящерица: %s, Питание: %s, Скорость передвижения: %d", super.toString(), feed(), getSwimSpeed());
    }
}

