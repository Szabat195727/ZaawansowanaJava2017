package transition.technologies.unittesting.basic.collections;


import static transition.technologies.unittesting.basic.collections.FellowBuilder.aFellow;

public class FellowTestFixture {

    public static Fellow frodo() {
        return aFellow().withName("Frodo").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow sam() {
        return aFellow().withName("Sam").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow merry() {
        return aFellow().withName("Merry").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow pippin() {
        return aFellow().withName("Pippin").withRace(Fellow.Race.HOBBIT).build();
    }

    public static Fellow gandalf() {
        return aFellow().withName("Gandalf").withRace(Fellow.Race.MAIAR).build();
    }

    public static Fellow legolas() {
        return aFellow().withName("Legolas").withRace(Fellow.Race.ELF).build();
    }

    public static Fellow gimli() {
        return aFellow().withName("Gimli").withRace(Fellow.Race.DWARF).build();
    }

    public static Fellow aragorn() {
        return aFellow().withName("Aragorn").withRace(Fellow.Race.MAN).build();
    }

    public static Fellow boromir() {
        return aFellow().withName("Boromir").withRace(Fellow.Race.MAN).build();
    }

    public static Fellow sauron() {
        return aFellow().withName("Sauron").withRace(Fellow.Race.AINUR).build();
    }
}
