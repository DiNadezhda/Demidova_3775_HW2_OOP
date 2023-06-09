package OPP.HW2.Animal;

import OPP.HW2.Animal.Type.Reptile;
import OPP.HW2.Base.Soundable;
import OPP.HW2.Base.SwimSpeed;

public class Snake extends Reptile implements SwimSpeed, Soundable {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Шшшшшшш";
    }

    @Override
    public String feed() {
        return "лягушки";
    }

    @Override
    public String toString() {
        return String.format("Змея: %s, Питание: %s, Скорость передвижения: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
