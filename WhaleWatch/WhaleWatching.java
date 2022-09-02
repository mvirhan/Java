import java.util.*;
import java.io.*;

public class WhaleWatching
{
    // instance to declare the file input output
    private static final String INPUT_FILENAME = "seasonObservations.txt";
    //private static final string OUTPUT_FILENAME = "updatedSeasonObservation";


    public WhaleWatching()
    {

    }

    //method to insert the observer name
    public void insertName()
    {
        Observer ob = new Observer();
        String observerName = "";
        boolean nameValidation = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:   ");
        while (nameValidation == false)
        {
            observerName = sc.nextLine();
            nameValidation = ob.isChar(observerName);
        }

        System.out.println("hello, " + observerName.trim());
        ob.setObserverName(observerName);
    }

    //method to display the mainmenu of the program
    public void mainMenu()
    {
        System.out.println(" ========================================= ");
        System.out.println(" Welcome to Whale Watching Simulation ");
        System.out.println(" Please Select the location below ");
        System.out.println("==========================================");
        System.out.println("1. Eden Location");
        System.out.println("2. Jarvis Bay");
        System.out.println("3. Byron Bay");
        System.out.println("4. Hervey Bay");
        System.out.println("5. Summary");
        System.out.println("6. Exit program");
    }

    // a backend method for the mainmenu method
    public void menuList()
    {
        while (true)
        {
            mainMenu();
            int choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                insertName();
                System.out.println(" ******************Whale Spotted in Eden **************");
                Location l = new Location();
                System.out.println("--------------- printing Humpback Result --------------------");
                l.findHumpback();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Minke Result -----------------------");
                l.findMinke();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Southern right Result --------------");
                l.findSouthernRight();
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Blue Result ------------------------");
                l.findBlue();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Orca Result ------------------------");
                l.findOrca();
                System.out.println("-------------------------------------------------------------");
                break;

                case 2:
                insertName(); 
                Location l1 = new Location();
                System.out.println("--------------- printing Humpback Result --------------------");
                l1.findHumpback();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Minke Result -----------------------");
                l1.findMinke();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Southern right Result --------------");
                l1.findSouthernRight();
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Blue Result ------------------------");
                l1.findBlue();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Orca Result ------------------------");
                l1.findOrca();
                System.out.println("-------------------------------------------------------------");
                break;

                case 3:
                insertName();
                Location l2 = new Location();
                System.out.println("--------------- printing Humpback Result --------------------");
                l2.findHumpback();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Minke Result -----------------------");
                l2.findMinke();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Southern right Result --------------");
                l2.findSouthernRight();
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Blue Result ------------------------");
                l2.findBlue();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Orca Result ------------------------");
                l2.findOrca();
                System.out.println("-------------------------------------------------------------");
                break;

                case 4:
                insertName();
                Location l3 = new Location();
                System.out.println("--------------- printing Humpback Result --------------------");
                l3.findHumpback();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Minke Result -----------------------");
                l3.findMinke();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Southern right Result --------------");
                l3.findSouthernRight();
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Blue Result ------------------------");
                l3.findBlue();
                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------- printing Orca Result ------------------------");
                l3.findOrca();
                System.out.println("-------------------------------------------------------------");
                break;

                case 5:
                System.out.println("displaying summary....");
                System.out.println("-----------------------");
                System.out.println("WWLD in Eden...... ");
                readEden();
                System.out.println("-----------------------");
                System.out.println("WWLD in JarvisBay........");
                readJarvisBay();
                System.out.println("-----------------------");
                System.out.println("WWLD in ByronBay...... ");
                readByronBay();
                System.out.println("-----------------------");
                System.out.println("WWLD in HerveyBay...... ");
                readHarveBay();
                System.out.println("-----------------------");
                RandomNumberGenerator rng = new RandomNumberGenerator();
                int injured;
                rng.setInjuredGenerator(1,10);
                System.out.println("Total Injured Whale are: " + rng.getInjuredGenerator());
                break;

                case 6:
                System.out.println("Exiting the Simulation");
                System.out.println("Thank you.......");
                System.exit(0);
                break;

            }
        }
    }

    //method to read the first line of the text file
    public void readEden()
     {
        try(FileReader fr = new FileReader(INPUT_FILENAME))
        {
            
            Scanner sc = new Scanner(fr);
            {
                int wwld;
                sc.nextLine();
                String data = sc.nextLine();
                String []info = data.split(",");
                int temp1 = Integer.parseInt(info[0]);
                int temp2 = Integer.parseInt(info[1]);
                int temp3 = Integer.parseInt(info[2]);
                int temp4 = Integer.parseInt(info[3]);
                int temp5 = Integer.parseInt(info[4]);
                int temp6 = Integer.parseInt(info[5]);
                int temp7 = Integer.parseInt(info[6]);
                int temp8 = Integer.parseInt(info[7]);
                int temp9 = Integer.parseInt(info[8]);
                int temp10 = Integer.parseInt(info[9]);
                int temp11 = Integer.parseInt(info[10]);
                
                wwld = (temp1 + temp3 + temp5 + temp7 + temp9) + 2 * (temp2 + temp4 + temp6 + temp8 + temp10) + 4 * (temp6 + temp7 + temp8 + temp9) + 10 * (temp10);
                System.out.println("WWLD in Eden is: " + wwld); 
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }  

    }

    //method to read the second line of the text file
     public void readJarvisBay()
     {
        try(FileReader fr = new FileReader(INPUT_FILENAME))
        {
            
            Scanner sc = new Scanner(fr);
            {
                int wwld;
                sc.nextLine();
                sc.nextLine();
                String data = sc.nextLine();
                String []info = data.split(",");
                int temp1 = Integer.parseInt(info[0]);
                int temp2 = Integer.parseInt(info[1]);
                int temp3 = Integer.parseInt(info[2]);
                int temp4 = Integer.parseInt(info[3]);
                int temp5 = Integer.parseInt(info[4]);
                int temp6 = Integer.parseInt(info[5]);
                int temp7 = Integer.parseInt(info[6]);
                int temp8 = Integer.parseInt(info[7]);
                int temp9 = Integer.parseInt(info[8]);
                int temp10 = Integer.parseInt(info[9]);
                int temp11 = Integer.parseInt(info[10]);
                
                wwld = (temp1 + temp3 + temp5 + temp7 + temp9) + 2 * (temp2 + temp4 + temp6 + temp8 + temp10) + 4 * (temp6 + temp7 + temp8 + temp9) + 10 * (temp10);
                System.out.println("WWLD in Jervis Bay is : " + wwld); 
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }  

    }
    //method to read the third line of the text file
    public void readByronBay()
     {
        try(FileReader fr = new FileReader(INPUT_FILENAME))
        {
            
            Scanner sc = new Scanner(fr);
            {
                int wwld;
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();
                String data = sc.nextLine();
                String []info = data.split(",");
                int temp1 = Integer.parseInt(info[0]);
                int temp2 = Integer.parseInt(info[1]);
                int temp3 = Integer.parseInt(info[2]);
                int temp4 = Integer.parseInt(info[3]);
                int temp5 = Integer.parseInt(info[4]);
                int temp6 = Integer.parseInt(info[5]);
                int temp7 = Integer.parseInt(info[6]);
                int temp8 = Integer.parseInt(info[7]);
                int temp9 = Integer.parseInt(info[8]);
                int temp10 = Integer.parseInt(info[9]);
                int temp11 = Integer.parseInt(info[10]);
                
                wwld = (temp1 + temp3 + temp5 + temp7 + temp9) + 2 * (temp2 + temp4 + temp6 + temp8 + temp10) + 4 * (temp6 + temp7 + temp8 + temp9) + 10 * (temp10);
                System.out.println("WWLD in ByronBay is : " + wwld); 
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }  

    }
    //method to read the fourth line of the text file
    public void readHarveBay()
     {
        try(FileReader fr = new FileReader(INPUT_FILENAME))
        {
            
            Scanner sc = new Scanner(fr);
            {
                int wwld;
                sc.nextLine();
                sc.nextLine();
                String data = sc.nextLine();
                String []info = data.split(",");
                int temp1 = Integer.parseInt(info[0]);
                int temp2 = Integer.parseInt(info[1]);
                int temp3 = Integer.parseInt(info[2]);
                int temp4 = Integer.parseInt(info[3]);
                int temp5 = Integer.parseInt(info[4]);
                int temp6 = Integer.parseInt(info[5]);
                int temp7 = Integer.parseInt(info[6]);
                int temp8 = Integer.parseInt(info[7]);
                int temp9 = Integer.parseInt(info[8]);
                int temp10 = Integer.parseInt(info[9]);
                int temp11 = Integer.parseInt(info[10]);
                
                wwld = (temp1 + temp3 + temp5 + temp7 + temp9) + 2 * (temp2 + temp4 + temp6 + temp8 + temp10) + 4 * (temp6 + temp7 + temp8 + temp9) + 10 * (temp10);
                System.out.println("WWLD in HerveBay is : " + wwld); 
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println("file not found");
        }  

    }

    public static void main (String[] args)
    {
        WhaleWatching ww = new WhaleWatching();
        ww.menuList();
    }
}  
