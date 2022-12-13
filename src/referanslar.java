
public class referanslar {
    public static void main(String[] args) {
        Acount acount1 = new Acount("mehmet öğüt ","mogut44949@gmail.com ","834983983484");
        
        Acount acount2 = acount1 ;
        
        
        Acount acount3 = new Acount();
        
        
        
        if (acount1==acount3){
            System.out.println("aynı objeyi gösteriyorlar ...");
        }
        else {
            System.out.println("ayni objeyi göstermiyorlar ...");
        }
    }
    
}
