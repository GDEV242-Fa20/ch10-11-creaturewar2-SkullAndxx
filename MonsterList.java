import java.util.ArrayList;

/**
 * This class is meant to show all of the monsters that are generated.
 *
 * @author Erick Rubio
 * @version v1.0.0 11-19-2020
 */
public class MonsterList
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature>monsterList;

    /**
     * Constructor to store the monsters
     */
    public MonsterList()
    {
        // initialise instance variables
        monsterList = new ArrayList<>();
    }

    /**
     * Add a creature to the roster
     *
     * @param  creature added
     * 
     */
    public void addMonster(Creature creature)
    {
        // put your code here
        monsterList.add(creature);
    }

    /**
     * show the monsters in the terminal mode
     *
     * 
     */
    public void show()
    {
        // put your code here
        for(Creature ml : monsterList){
            System.out.println(ml);
        }
    }    
}
