/**
 * Created by owlslubic on 6/28/16.
 */
public class Mammal extends Animal {
    private boolean mLivesOnLand;
    private int mAvgWeight;

    public Mammal(String name, int numLegs, int topSpeed,
                  boolean isEndangered, boolean livesOnLand, int avgWeight){
        super(name, numLegs, topSpeed, isEndangered);
        mLivesOnLand = livesOnLand;
        mAvgWeight = avgWeight;
    }
    //default constructor
    public Mammal(){
        super();
        mLivesOnLand = false;
        mAvgWeight = 1; //who knows
    }



    //methods to get properties
    public String getLandOrWater(){
        if( mLivesOnLand == true) {
            return " on land";
        }
        else{
            return "in the water";
        }
    }
    public int getAvgWeight(){
        return mAvgWeight;
    }

}
