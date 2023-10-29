import java.util.ArrayList;

class Dude {
    public String name;
    public int health = 100;
    public int mp = 0;

    public void sayName() {
        System.out.println("Hey there, my name is " + name);
    }

    public void punchFace(Dude target) {
        target.health -= 10;
    }
}

class Wizard extends Dude {
    // a wizard can do everything that a normal dude can do

    // below this line is the new code that will implement only for wizards
    ArrayList<Spell> spells;
    public int mp = 100;

    class Spell {
        String name;
        int damage;
    }

    public void cast(Spell spell){
        // do something cool
        mp-=10;
    }

}