public class Customer
{
    private String name;
    private int geld;
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGeld(int geld)
    {
        this.geld = geld;
    }
    
    public String getName()
    {
        return name;
    }
    public int getGeld()
    {
        return geld;
    }
    
    public Customer(String name, int geld)
    {
        setName(name);
        setGeld(geld);
    }
     public Customer()
    {
        setName("Max Mustermann");
        setGeld(1000);
    }
  
    public String getVorname()
    {
        int pos;
        pos = name.indexOf(" ");
        return name.substring(0, pos);
    }
     public String getNachname()
    {
        int pos;
        pos = name.indexOf(" ");
        return name.substring(pos + 1);
    }
      public String getNachnameVorname()
    {
        int pos = name.indexOf(" ");
        if (pos == -1) 
            return name; // если пробела нет, возвращаем как есть
            String vorname = name.substring(0, pos);
            String nachname = name.substring(pos + 1);
            return nachname + " " + vorname;
    }
 


  public void printCustomer() 
  {
        if (geld >= 1) 
        {
            System.out.println(name + ": " + geld + " EUR - hat genug Geld");
        } 
        else
        {
            System.out.println(name + ": " + geld + " EUR - hat KEIN Geld");
        }
    }


public void testen()
{
    System.out.println(name.indexOf(" "));
}
}