//contains all of the user profile data from first-time setup
public class UserProfile
{
    //weight in pounds
    private float weight;
    //height in inches
    private int height;
    //true = man, false = woman
    private boolean gender;

    //needed to convert feet+inches into inches
    int convertHeight(int feet, int inches)
    {
        int totalInches;
        totalInches = inches + (12*feet);
        return totalInches;
    }

    //Constructor for a user object
    //w = weight, feet/inches = user's height, g = gender
    void User(float w, int feet, int inches, boolean g)
    {
        //weight in pounds, height in inches
        weight = w;
        height = convertHeight(feet,inches);
        gender = g;
    }

    float getWeight()
    {
        return weight;
    }

    int getHeight()
    {
        return height;
    }

    boolean getGender()
    {
        return gender;
    }
}
