public class Cosmetic extends Product
{
    private String brand;
    private static final double TAX = 0.23;

    public Cosmetic(String name, String brand, int barCode, double netPrice)
    {
        super(name, barCode, netPrice);
        this.brand = brand;
    }
   
    public String getBrand()
    {
        return brand;
    }
    
    public void printDetails()
    {
        System.out.print("Cosmetic description: ");
        System.out.println("Your favorite " + brand + " cosmetic!");
        super.printDetails();
    }
    
    public double findFinalPrice()
    {
        return getNetPrice()*(1+TAX);        
    }
}