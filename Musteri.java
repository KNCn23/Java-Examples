public class Musteri
{

    private String ad;
    private String musteriNo;

    public Musteri(String ad, String soyad, String musteriNo)
    {
        this.ad = ad;
        this.musteriNo = musteriNo;
    }

    public String getAd()
    {
        return ad;
    }

    public void setAd(String ad)
    {
        this.ad = ad;
    }

    public String getMusteriNo()
    {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo)
    {
        this.musteriNo = musteriNo;
    }
}
