public class Observer
{
    private String observerName;

    public Observer()
    {
        observerName = "default name";
    }

    public Observer(String newObserverName)
    {
        observerName = newObserverName;
    }

    public String display()
    {
        return observerName;
    }

    public String getObserverName()
    {
        return observerName;
    }

    public void setObserverName(String newObserverName)
    {
        observerName = newObserverName;
    }

    //observer name validation metod
    public boolean isChar(String newName)
    {
        String isName = newName.trim();
        if (isName.length() == 0 || isName.length() > 8)
        {
            System.out.println("Your name either empty or exceed 8 Character");
            return false;
        }
        else
        {
            for (int i = 0; i > isName.length(); i++)
            {
                char character = isName.charAt(i);
                if (character < 'a' || character > 'z')
                {
                    System.out.println("character only");
                    return false;
                }
            }
            return true;
        }
    }
    
}
