import java.util.LinkedList;

public class WorkoutData
{
    //???
    private int style;
    //1-3 for light, medium, heavy
    private int intensity;
    //list of all equipment available
    LinkedList<String> eqAvailable; //could replace with a list of booleans (see addEquipment)
    //kettle bell weight range
    LinkedList<String> kb_wr;
    //barbell weight range
    LinkedList<String> bb_wr;
    //dumbbell weight range
    LinkedList<String> db_wr;

    //equipment array has what equipment is available
    //slot 0 = kettle bell, slot 1 = barbell, slot 2 = dumbbell
    void addEquipment(boolean[] equipment)
    {
        for(int i = 0; i < 3; i++)
        {
            if(equipment[i] == true)
            {
                switch(i)
                {
                    case 0:
                        eqAvailable.addFirst("Kettle Bell");
                        break;
                    case 1:
                        eqAvailable.addFirst("Barbell");
                        break;
                    case 2:
                        eqAvailable.addFirst("Dumbbell");
                        break;
                }
            }
        }
    }



}
