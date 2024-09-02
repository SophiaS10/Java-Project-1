public class TestClass
{
    public static void main(String[] args)
    {
        ProductDB db = new ProductDB();        
        
        Medicine medicine1 = new Medicine("DEPON", 1234567, 1.50, false);
        Medicine medicine2 = new Medicine("Tetravac", 7654321, 21, true);
        Cosmetic cosmetic1 = new Cosmetic("Body Lotion Roses", "KORRES", 568923, 20);
        Cosmetic cosmetic2 = new Cosmetic("Shower Gel Afrika", "Apivita", 24680, 12.50);
        
        db.storeProduct(medicine1);
        db.storeProduct(medicine2);
        db.storeProduct(cosmetic1);
        db.storeProduct(cosmetic2);
        
        db.showProductList();
        db.searchProduct("DEPON");
        db.searchProduct("Nivea serum");
        db.priceReduction("KORRES", 0.10);
        db.showProductList();        
    }
}
