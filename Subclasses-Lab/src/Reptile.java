/**
 * Created by owlslubic on 6/28/16.
 */
public class Reptile extends Animal {
    private boolean mLaysEggs;
    private boolean mIsCarnivore;
    private String mColor;

    public Reptile(String name, int numLegs, int topSpeed, boolean isEndangered,
                   boolean laysEggs, boolean isCarnivore, String color){
        super(name, numLegs, topSpeed, isEndangered);
        mLaysEggs = laysEggs;
        mIsCarnivore = isCarnivore;
        mColor = color;
    }
    //default constructor
    public Reptile(){
        super(); //technically an axolotl is an amphibian...
        mLaysEggs = true;
        mIsCarnivore = true;
        mColor = "leucistic";
    }

    public boolean laysEggs(){
        return mLaysEggs;
    }
    public boolean isCarnivore(){
        return mIsCarnivore;
    }
    public String getColor(){
        return mColor;
    }


}
