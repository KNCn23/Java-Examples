public class BankaHesabi
{
    private Musteri musteri;
    private double bakiye;
    private String hesapNo;

    public BankaHesabi(Musteri musteri, String hesapNo, double ilkBakiye)
    {
        this.musteri = musteri;
        this.hesapNo = hesapNo;
        this.bakiye = ilkBakiye;
    }
    public Musteri getMusteri() {
        return musteri;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void paraYatir(double miktar)
    {
        if (miktar > 0)
        {
            bakiye += miktar;
            System.out.println("Yeni bakiye " + bakiye);
        }
        else
        {
            System.out.println("Yetersiz bakiye.");
        }
    }



}