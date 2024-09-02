public abstract class Product
{
    private String name;
    private int barCode;
    private double netPrice;

    public Product(String name, int barCode, double netPrice)
    {
        this.name = name;
        this.barCode = barCode;
        this.netPrice = netPrice;        
    }

    public String getName()
    {
        return name;
    }
   
    public int getBarCode()
    {
        return barCode;
    }

    public double getNetPrice()
    {
        return netPrice;
    }

    public void setPrice(double price)
    {
        netPrice = price;
    }
    
    public void printDetails()
    {
        System.out.println(name + ", <" + barCode + ">, " + findFinalPrice() + " Euro.");
    }
    
    abstract public double findFinalPrice();
}