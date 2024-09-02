import java.util.ArrayList;

public class ProductDB
{
    private ArrayList<Product> list;

    public ProductDB()
    {
        list = new ArrayList<>();
    }

    public void storeProduct(Product p)
    {
        list.add(p);
    }

    public void showProductList()
    {
        System.out.println("********** PHARMACY LIST **********");
        for(Product p : list)
        {
            p.printDetails();
            System.out.println();
        }
        System.out.println("Number of pharmaceutical products: " + list.size());
        System.out.println("********** END OF PHARMACY LIST **********\n");         
    }
    
    public void searchProduct(String name)
    {
        boolean found = false;
        
        System.out.println("********** SEARCH FOR MEDICINE/COSMETIC: <" + name +"> **********");
        for(Product p : list)
        {
            if (p.getName().equals(name))
            {
                p.printDetails();
                found = true;
                break;
            }
        }
        
        if ( !found )
            System.out.println("The pharmacy does not have any product called <" + name + ">");
        System.out.println("********** END OF SEARCH **********\n"); 
    }
        
           
    public void priceReduction(String brand, double percentage)
    {
        double reduction;
        int count = 0;

        for(Product p: list)
        {
            if ( p instanceof Cosmetic )
            {
                Cosmetic c = (Cosmetic)p;
                if ( c.getBrand().equals(brand) )
                {                    
                    double newPrice = p.getNetPrice()*(1- percentage);
                    p.setPrice(newPrice);
                    count++;
                }                
            }
        }
        System.out.println("********** Look for " + count + " cosmetics by " + brand + " with reduced prices!!**********\n");
    }
}