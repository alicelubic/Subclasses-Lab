/**
 * Created by owlslubic on 6/28/16.
 */
public class Animal {
    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    //constructor
    public Animal(String name, int numLegs, int topSpeed, boolean isEndangered){
        mName = name;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }
    //default constructor
    public Animal(){
        mName = "Axolotl";
        mNumLegs = 4;
        mTopSpeed = 1;
        mIsEndangered = true;
    }

    //methods that get the info

    public String getName(){
        return mName;
    }
    public int numLegs(){
        return mNumLegs;
    }
    public int getTopSpeed(){
        return mTopSpeed;
    }
    public boolean isEndangered(){
        return mIsEndangered;
    }


}
