/**
 * Created by owlslubic on 6/28/16.
 */
public class Dinosaur extends Reptile {
    private String mWentExtinct; //x years ago


    public Dinosaur(String name, int numLegs, int topSpeed, boolean isEndangered, boolean laysEggs,
                    boolean isCarnivore, String color, String wentExtinct) {
        super(name, numLegs, topSpeed, isEndangered, laysEggs, isCarnivore, color);
        mWentExtinct = wentExtinct;
    }

    public String wentExtinct(){
        return mWentExtinct;
    }
}
