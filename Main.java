package OPP.HW2.Base;

import OPP.HW2.Animal.Frog;
import OPP.HW2.Animal.Lizard;
import OPP.HW2.Animal.Snake;
import OPP.HW2.Animal.Turtle;

public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Frog("Ромео"))
                .addAnimal(new Snake("Каа"))
                .addAnimal(new Lizard("Елизавета II"))
                .addAnimal(new Turtle("Тартила"));


        System.out.println(terrarium);

        System.out.println("---звуки---");
        System.out.println(terrarium.getSounds());

        System.out.println("--Самый быстрый представитель террариума--");
        System.out.println(terrarium.getFastestSwimmer());
    }
}
