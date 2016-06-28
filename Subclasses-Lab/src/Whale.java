/**
 * Created by owlslubic on 6/28/16.
 */
public class Whale extends Mammal {
    private String mSpecies;


    public Whale(String name, int numLegs, int topSpeed, boolean isEndangered, boolean livesOnLand, int avgWeight,String species){
        super(name, numLegs, topSpeed, isEndangered, livesOnLand, avgWeight);
        mSpecies = species;
    }




    public String getSpecies(){
        return mSpecies;
    }



}
