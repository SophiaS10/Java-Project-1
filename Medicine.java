public class Medicine extends Product
{
    private boolean needsPrescription;
    private static final double TAX = 0.065;

    public Medicine(String name, int barCode, double price, boolean needsPrescription)
    {
        super(name, barCode, price);
        this.needsPrescription = needsPrescription;
    }  

    public boolean getnNeedsPrescription()
    {
        return needsPrescription;
    }
    
    public void printDetails()
    {
        System.out. println("Medicine description: ");
        super.printDetails();
        if ( needsPrescription )
            System.out.println("* Doctor's prescription required");
    }
    
    public double findFinalPrice()
    {
        return getNetPrice()*(1+TAX);        
    }
}