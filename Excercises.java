public class Excercises
{
    private String name;
    private String descriptor;
    private String prerequisites;
    //stores the lower-bound of the rep range, getting the upper bound by adding 2
    private int repRange;
    private boolean usesKettleBell;
    private boolean usesBarbell;
    private boolean usesDumbbell;

    void Equipment()
    {
        String name;
        boolean present;
    }

    void Excercise(String name, String descriptor, String prerequisites, boolean usesKettleBell, boolean usesBarbell, boolean usesDumbbell)
    {
        this.name = name;
        this.descriptor = descriptor;
        this.repRange = 0;
        this.prerequisites = prerequisites;
        this.usesKettleBell = usesKettleBell;
        this.usesBarbell = usesBarbell;
        this.usesDumbbell = usesDumbbell;
    }

    void setRepRange(int intensity)
    {
        switch(intensity)
        {
            case 1:
                this.repRange = 6;
                break;
            case 2:
                this.repRange = 8;
                break;
            case 3:
                this.repRange = 10;
                break;
        }
    }
}
