import java.util.*;
public class RandomNumberGenerator
{
    private int numberGenerator;
    private int typeGenerator;
    private int directionGenerator;
    private int injuredGenerator;
   
    public RandomNumberGenerator()
    {
        numberGenerator = 0;
        typeGenerator = 0;
        directionGenerator = 0;
        injuredGenerator= 0;

    }

    public RandomNumberGenerator(int newNumberGenerator, int newTypeGenerator, int newDirectionGenerator, int newInjuredGenerator)
    {
        numberGenerator = newNumberGenerator;
        typeGenerator = newTypeGenerator;
        directionGenerator = newDirectionGenerator;
        injuredGenerator = newDirectionGenerator;
    }

    public int display()
    {
        return numberGenerator;
    }

    public int getDirectionGenerator()
    {
        return directionGenerator;
    }

    public int getInjuredGenerator()
    {
        return injuredGenerator;
    }

    public int getTypeGenerator()
    {
        return typeGenerator;
    }

    public int getNumberGenerator()
    {
        return numberGenerator;
    }
    
    //set the number generator to find out total whale each species
    public void setNumberGenerator(int min, int max)
    {
        Random rd = new Random();
        numberGenerator = rd.nextInt(max - min + 1) + min;
    }

    //set the number to determined whale is injured or not

    public void setInjuredGenerator(int min, int max)
    {
        Random rd = new Random();
        injuredGenerator = rd.nextInt(max - min + 1) + min;
    }

    //number generator to generate the type of the whale(1 is adult, 2 is calves)
    public void setTypeGenerator(int min, int max)
    {
        Random rd = new Random();
        typeGenerator = rd.nextInt(max - min + 1) + min;
    }

    //number generator to generate the direction of the whale(1 is north, 2 is south)
    public void setDirectionGenerator(int min, int max)
    {
        Random rd = new Random();
        directionGenerator = rd.nextInt(max - min + 1) + min;
    }   
 
}
