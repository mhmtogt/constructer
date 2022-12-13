
public class Acount {
    private String  hesapNo ;
    private double  bakiye  ;
    private String  isim ;
    
    private String email;
    
    private  String telefonNo;
    
    
    public Acount(String isim , String email, String telefonNo){
    
        /*this.isim = isim ;
        this.email = email;
        this.telefonNo = telefonNo;
        
        this.bakiye = 0.0 ;
        this.hesapNo = "bilgi yok ";*/
        
        this("bilgi yok ",0.0 , isim ,email,telefonNo);
    }
    
    
    public Acount(){
    
     //   System.out.println("kendi yazdığımız counstructer ");
   /*  this.hesapNo ="bilgi yok ";
     this.bakiye = 0.0;
     this.email = "bilgi yok " ;
     this.isim = "bilgi yok" ;
     this.telefonNo = "bilgi yok " ;*/
   
   this("bilgi yok" , 0.0,"bilgi yok ","bilgi yok " ,"bilgi yok ");
    }
    public Acount(String hesapNo,double bakiye , String isim , String email, String telefonNo ){
    
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.email = email;
        this.telefonNo = telefonNo;
        this.isim = isim;
    }
    
    
    public void ParaYatir(double miktar){
    
        bakiye += miktar;
        System.out.println("yeni bakiye : " +bakiye );
    }public void bigileriGoster(){
    
            System.out.println("hesap no : "+ hesapNo);
            System.out.println("bakiye : "+ bakiye);
            System.out.println("email  : "+ email);
            System.out.println("telefon no  : "+ telefonNo);
            System.out.println("isim : "+ isim);

    
    }
    public void ParaCekme(double miktar){
    
      if (miktar > bakiye){
      
          System.out.println("yetersiz bakiye" +bakiye);
      }else{
      
          bakiye -= miktar;
          System.out.println("kalan bakiyeniz : " + bakiye);
      }
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getbAkiye() {
        return bakiye;
    }

    /**"
     * @param akiye the bakiye to set
     */
    public void setbAkiye(double akiye) {
        this.bakiye = akiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
