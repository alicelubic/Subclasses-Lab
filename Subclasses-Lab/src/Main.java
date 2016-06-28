import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        Mammal giraffe = new Mammal("giraffe", 4, 37, false, true, 2600);
        Reptile iguana = new Reptile("iguana", 4, 21, false, true, false, "green");
        Whale blackfish = new Whale("blackfish", 0, 30, false, false, 8000, "orca");
        Dinosaur stego = new Dinosaur("stegosaurus", 4, 4, false, true, false, "color unkown", "150.8 million years ago");
        Animal someAnimal = new Animal();

    //giraffe
        System.out.println("This is a " + giraffe.getName() + ". It has " +
                giraffe.numLegs() + " legs, and a top speed of " + giraffe.getTopSpeed() +
                " mph. \nPop quiz! True or false: The giraffe is endangered. " + giraffe.isEndangered() +
                "! \nThis animal lives" + giraffe.getLandOrWater() + ", and its average weight is " +
                giraffe.getAvgWeight() + " lbs. Cool!");
        System.out.println();

    //iguana
        System.out.println("\nThis is an " + iguana.getName() + ". It has " + iguana.numLegs() + " legs, and a top speed of " +
        iguana.getTopSpeed() + "mph. \nIs this animal endangered? That's " + iguana.isEndangered() + "! Does this animal lay eggs? That's " + iguana.laysEggs() +
                "! \nIt is " + iguana.isCarnivore() + " that this animal is a carnivore. Typically, this animal's color is " + iguana.getColor() + ". Neat!");
        System.out.println();

    //blackfish
        System.out.println("\nThis is a " + blackfish.getName() + ", which is an antiquated name for an " + blackfish.getSpecies() +
                ". \nIt has " + blackfish.numLegs() + " legs, and a top speed of " + blackfish.getTopSpeed() + " mph. Its average weight is " +
                blackfish.getAvgWeight() + " lbs. Yikes! \nIt is " + blackfish.isEndangered() +
                " that this animal is endangered, and it lives " + blackfish.getLandOrWater() + ". Wow!");
        System.out.println();

    //stegosaurus means "roof lizard"
        System.out.println("\nThe " + stego.getName() + " has " + stego.numLegs() + " legs, and can move at a top speed of " +
        stego.getTopSpeed() + " mph. \nIt is " + stego.isEndangered() + " that this animal is endangered, because it " + stego.wentExtinct() + "! \nIt is " +
                stego.laysEggs() + " that this animal lays eggs, and it is " + stego.isCarnivore() + " that is is a carnivore. \nIts color is " +
                stego.getColor() + " because it " + stego.wentExtinct() + "! That's too bad.");
        System.out.println();

    //default animal
        System.out.println("\nThe " + someAnimal.getName() + " has " + someAnimal.numLegs() + " legs, and a top speed of " +
        someAnimal.getTopSpeed() + " mph! It is " + someAnimal.isEndangered() + " that this animal is endangered.");






    }

}
