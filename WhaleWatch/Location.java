import java.util.*;
import java.io.*;

public class Location
{
    private String whaleName;
    private Whale[] whales;

    //default constructor for Location Class
    public Location()
    {
        whaleName = "default";
        whales = new Whale[9];
    }
    
    //non default constructor for Location Class
    public Location(String whaleName)
    {
        this.whaleName = whaleName;
    }

    public void display()
    {
        System.out.println(Arrays.toString(whales) + "," + whaleName);
    }

    //Method to find out Humpback Whale
    //Consists a validation to validate type and Direction
    public void findHumpback()
    {
        
        whales = new Whale[2];
        whales[0] = new Whale();
        whales[1] = new Whale();

        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,50);
        rng.setTypeGenerator(1,2); //generating Type of Whale 1 for Adult, 2 for Calves
        rng.setDirectionGenerator(1,2); //generating direction 1 for North, 2 for South

        int temp = rng.getNumberGenerator();
        int tempType = rng.getTypeGenerator();
        int tempDirection = rng.getDirectionGenerator();

        if (temp >= 0 && temp <= 50)
        {
            if (tempType == 1 && tempDirection == 1)
            { 
                whales[0].setType("Adult Humpback ");
                whales[0].setDirection(" north ");
                whales[0].display();
                
            }
            else if (tempType == 1 && tempDirection == 2)
            {
                whales[0].setType(" Adult Humpback ");
                whales[0].setDirection(" south ");
                whales[0].display();
            }

            else if(tempType == 2 && tempDirection == 1)
            {
                whales[1].setType(" Calves Humpback ");
                whales[1].setDirection(" north ");
                whales[1].display();
            }
        }
        else
        {
            whales[1].setType(" Calves Humpback ");
            whales[1].setDirection(" South ");
            whales[1].display();   
        }
        System.out.println("with total number of " + rng.getNumberGenerator() + " Whales ");
        migaloo();

    }
    //Method to find out Minke Whale
    //Consists a validation to validate type and Direction
    public void findMinke()
    {
        
        whales = new Whale[2];
        whales[0] = new Whale();
        whales[1] = new Whale();

        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,20);
        rng.setTypeGenerator(1,2); //generating Type of Whale 1 for Adult, 2 for Calves
        rng.setDirectionGenerator(1,2); //generating direction 1 for North, 2 for South

        int temp = rng.getNumberGenerator();
        int tempType = rng.getTypeGenerator();
        int tempDirection = rng.getDirectionGenerator();

        if (temp >= 0 && temp <= 50)
        {
            if (tempType == 1 && tempDirection == 1)
            { 
                whales[0].setType("Adult Minke ");
                whales[0].setDirection(" north ");
                whales[0].display();
                
            }
            else if (tempType == 1 && tempDirection == 2)
            {
                whales[0].setType(" Adult Minke ");
                whales[0].setDirection(" south ");
                whales[0].display();
            }

            else if(tempType == 2 && tempDirection == 1)
            {
                whales[1].setType(" Calves Minke ");
                whales[1].setDirection(" north ");
                whales[1].display();
            }
        }
        else
        {
            whales[1].setType(" Calves Minke ");
            whales[1].setDirection(" South ");
            whales[1].display();   
        }

        System.out.println("===============================================================");
        System.out.println("with total number of " + rng.getNumberGenerator() + " Whales ");
        System.out.println("===============================================================");

    }
    
    //Method to find out SouthernRight Whale
    //Consists a validation to validate type and Direction
    public void findSouthernRight()
    {
        
        whales = new Whale[2];
        whales[0] = new Whale();
        whales[1] = new Whale();

        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,20);
        rng.setTypeGenerator(1,2); //generating Type of Whale 1 for Adult, 2 for Calves
        rng.setDirectionGenerator(1,2); //generating direction 1 for North, 2 for South

        int temp = rng.getNumberGenerator();
        int tempType = rng.getTypeGenerator();
        int tempDirection = rng.getDirectionGenerator();

        if (temp >= 0 && temp <= 50)
        {
            if (tempType == 1 && tempDirection == 1)
            { 
                whales[0].setType(" Adult Southern Right ");
                whales[0].setDirection(" north ");
                whales[0].display();
                
            }
            else if (tempType == 1 && tempDirection == 2)
            {
                whales[0].setType(" Adult Southern Right ");
                whales[0].setDirection(" south ");
                whales[0].display();
            }

            else if(tempType == 2 && tempDirection == 1)
            {
                whales[1].setType(" Calves Southern Right ");
                whales[1].setDirection(" north ");
                whales[1].display();
            }
        }
        else
        {
            whales[1].setType(" Calves Southern Right ");
            whales[1].setDirection(" South ");
            whales[1].display();   
        }
        System.out.println("===============================================================");
        System.out.println("with total number of " + rng.getNumberGenerator() + " Whales ");
        System.out.println("===============================================================");

    }
    //Method to find out Blue Whale
    //Consists a validation to validate type and Direction
    public void findBlue()
    {
        
        whales = new Whale[2];
        whales[0] = new Whale();
        whales[1] = new Whale();

        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,3);
        rng.setTypeGenerator(1,2); //generating Type of Whale 1 for Adult, 2 for Calves
        rng.setDirectionGenerator(1,2); //generating direction 1 for North, 2 for South

        int temp = rng.getNumberGenerator();
        int tempType = rng.getTypeGenerator();
        int tempDirection = rng.getDirectionGenerator();

        if (temp >= 0 && temp <= 50)
        {
            if (tempType == 1 && tempDirection == 1)
            { 
                whales[0].setType(" Adult Blue ");
                whales[0].setDirection(" north ");
                whales[0].display();
                
            }
            else if (tempType == 1 && tempDirection == 2)
            {
                whales[0].setType(" Adult Blue ");
                whales[0].setDirection(" south ");
                whales[0].display();
            }

            else if(tempType == 2 && tempDirection == 1)
            {
                whales[1].setType(" Calves Blue ");
                whales[1].setDirection(" north ");
                whales[1].display();
            }
        }
        else
        {
            whales[1].setType(" Calves Blue ");
            whales[1].setDirection(" South ");
            whales[1].display();   
        }
        System.out.println("===============================================================");

        System.out.println("with total number of " + rng.getNumberGenerator() + " Whales ");

         System.out.println("===============================================================");

    }

    //Method to find out Orca Whale
    //Consists a validation to validate type and Direction
    public void findOrca()
    {
        
        whales = new Whale[2];
        whales[0] = new Whale();
        whales[1] = new Whale();

        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,2);
        rng.setTypeGenerator(1,2); //generating Type of Whale 1 for Adult, 2 for Calves
        rng.setDirectionGenerator(1,2); //generating direction 1 for North, 2 for South

        int temp = rng.getNumberGenerator();
        int tempType = rng.getTypeGenerator();
        int tempDirection = rng.getDirectionGenerator();

        if (temp >= 0 && temp <= 50)
        {
            if (tempType == 1 && tempDirection == 1)
            { 
                whales[0].setType(" Adult Orca ");
                whales[0].setDirection(" north ");
                whales[0].display();
                
            }
            else if (tempType == 1 && tempDirection == 2)
            {
                whales[0].setType(" Adult Orca ");
                whales[0].setDirection(" south ");
                whales[0].display();
            }

            else if(tempType == 2 && tempDirection == 1)
            {
                whales[1].setType(" Calves Orca ");
                whales[1].setDirection(" north ");
                whales[1].display();
            }
        }
        else
        {
            whales[1].setType(" Calves Orca ");
            whales[1].setDirection(" South ");
            whales[1].display();   
        }
        System.out.println("===============================================================");

        System.out.println("with total number of " + rng.getNumberGenerator() + " Whales ");

         System.out.println("===============================================================");
    }

    //Method to find out Migaloo
    //Consists a validation to validate type and Direction
    public void migaloo()
    {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.setNumberGenerator(0,1);
        if (rng.getNumberGenerator() == 1)
        {
            System.out.println("--------------------------------");
            System.out.println("Congratulation Migaloo is There.....");
            System.out.println("--------------------------------");
        }
        else
        {
            System.out.println("--------------------------------");
            System.out.println("No Migaloo Detected");
            System.out.println("--------------------------------");
        }
    }
}
