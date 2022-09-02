public class Whale
{
    private int species;
    private String direction;
    private String type;

    public Whale()
    {
        species = 0;
        direction = "North";
        type = "Adult";
    }

    public Whale(int newSpecies, String newDirection, String newType)
    {
        species = newSpecies;
        direction = newDirection;
        type = newType;
    }

    public void display()
    {
        System.out.println(" Whale on direction to: " + direction + " with type of " + type);
    }

    public int getSpecies()
    {
        return species;
    }

    public String getDirection()
    {
        return direction;
    }

    public String getType()
    {
        return type;
    }

    public void setSpecies(int newSpecies)
    {
        species = newSpecies;
    }

    public void setDirection(String newDirection)
    {
        direction = newDirection;
    }

    public void setType(String newType)
    {
        type = newType;
    }

    public void setWhale(int newSpecies, String newDirection, String newType)
    {
        species = newSpecies;
        direction = newDirection;
        type = newType;
    }

}
