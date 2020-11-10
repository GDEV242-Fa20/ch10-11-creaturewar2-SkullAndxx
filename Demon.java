
/**
 * The demon class has the general traits for a demon level monster
 *
 * @Erick Rubio
 * @version v.1.0 11-9-2020
 */
public class Demon extends DemonicCreature
{
    // instance variables - replace the example below with your own
    private int magicalDmg =  50;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Grab magical damage count
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int magicalDmgHit()
    {
        magicalDmg = 0;
        // put your code here
        return magicalDmg;
    }
}
