package pl.pi5518.aplikacja.databases;

import javax.persistence.*;

@Entity
public class Pcs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String producent;
    private String grupa_produktowa;
    private String system_operacyjny;
    private String rodzaj;
    private String seria;

    private String typ_procesora;
    private String seria_procesora;
    private String model_procesora;
    private String ilosc_rdzeni;

    private String karta_graficzna;
    private String wyjscia_karty_graficznej;

    private String ram;
    private String rodzaj_ram;

    private String ilosc_dyskow;
    private String pojemnosc_ssd;
    private String pojemnosc_hdd;

    private String chipset;
    private String zlacza;

    private String obudowa;
    private String liczba_wentylatorow;

    private Double cena;

    @Transient
    boolean isNew;

    public Pcs(String producent, String grupa_produktowa, String system_operacyjny, String rodzaj, String seria,
               String typ_procesora, String seria_procesora, String model_procesora, String ilosc_rdzeni,
               String karta_graficzna, String wyjscia_karty_graficznej, String ram, String rodzaj_ram,
               String ilosc_dyskow, String pojemnosc_ssd, String pojemnosc_hdd, String chipset, String zlacza,
               String obudowa, String liczba_wentylatorow, Double cena, boolean isNew) {
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.system_operacyjny = system_operacyjny;
        this.rodzaj = rodzaj;
        this.seria = seria;
        this.typ_procesora = typ_procesora;
        this.seria_procesora = seria_procesora;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.karta_graficzna = karta_graficzna;
        this.wyjscia_karty_graficznej = wyjscia_karty_graficznej;
        this.ram = ram;
        this.rodzaj_ram = rodzaj_ram;
        this.ilosc_dyskow = ilosc_dyskow;
        this.pojemnosc_ssd = pojemnosc_ssd;
        this.pojemnosc_hdd = pojemnosc_hdd;
        this.chipset = chipset;
        this.zlacza = zlacza;
        this.obudowa = obudowa;
        this.liczba_wentylatorow = liczba_wentylatorow;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Pcs(Integer id, String producent, String grupa_produktowa, String system_operacyjny, String rodzaj,
               String seria, String typ_procesora, String seria_procesora, String model_procesora,
               String ilosc_rdzeni, String karta_graficzna, String wyjscia_karty_graficznej, String ram,
               String rodzaj_ram, String ilosc_dyskow, String pojemnosc_ssd, String pojemnosc_hdd, String chipset,
               String zlacza, String obudowa, String liczba_wentylatorow, Double cena, boolean isNew) {
        this.id = id;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.system_operacyjny = system_operacyjny;
        this.rodzaj = rodzaj;
        this.seria = seria;
        this.typ_procesora = typ_procesora;
        this.seria_procesora = seria_procesora;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.karta_graficzna = karta_graficzna;
        this.wyjscia_karty_graficznej = wyjscia_karty_graficznej;
        this.ram = ram;
        this.rodzaj_ram = rodzaj_ram;
        this.ilosc_dyskow = ilosc_dyskow;
        this.pojemnosc_ssd = pojemnosc_ssd;
        this.pojemnosc_hdd = pojemnosc_hdd;
        this.chipset = chipset;
        this.zlacza = zlacza;
        this.obudowa = obudowa;
        this.liczba_wentylatorow = liczba_wentylatorow;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Pcs() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getGrupa_produktowa() {
        return grupa_produktowa;
    }

    public void setGrupa_produktowa(String grupa_produktowa) {
        this.grupa_produktowa = grupa_produktowa;
    }

    public String getSystem_operacyjny() {
        return system_operacyjny;
    }

    public void setSystem_operacyjny(String system_operacyjny) {
        this.system_operacyjny = system_operacyjny;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getTyp_procesora() {
        return typ_procesora;
    }

    public void setTyp_procesora(String typ_procesora) {
        this.typ_procesora = typ_procesora;
    }

    public String getSeria_procesora() {
        return seria_procesora;
    }

    public void setSeria_procesora(String seria_procesora) {
        this.seria_procesora = seria_procesora;
    }

    public String getModel_procesora() {
        return model_procesora;
    }

    public void setModel_procesora(String model_procesora) {
        this.model_procesora = model_procesora;
    }

    public String getIlosc_rdzeni() {
        return ilosc_rdzeni;
    }

    public void setIlosc_rdzeni(String ilosc_rdzeni) {
        this.ilosc_rdzeni = ilosc_rdzeni;
    }

    public String getKarta_graficzna() {
        return karta_graficzna;
    }

    public void setKarta_graficzna(String karta_graficzna) {
        this.karta_graficzna = karta_graficzna;
    }

    public String getWyjscia_karty_graficznej() {
        return wyjscia_karty_graficznej;
    }

    public void setWyjscia_karty_graficznej(String wyjscia_karty_graficznej) {
        this.wyjscia_karty_graficznej = wyjscia_karty_graficznej;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRodzaj_ram() {
        return rodzaj_ram;
    }

    public void setRodzaj_ram(String rodzaj_ram) {
        this.rodzaj_ram = rodzaj_ram;
    }

    public String getIlosc_dyskow() {
        return ilosc_dyskow;
    }

    public void setIlosc_dyskow(String ilosc_dyskow) {
        this.ilosc_dyskow = ilosc_dyskow;
    }

    public String getPojemnosc_ssd() {
        return pojemnosc_ssd;
    }

    public void setPojemnosc_ssd(String pojemnosc_ssd) {
        this.pojemnosc_ssd = pojemnosc_ssd;
    }

    public String getPojemnosc_hdd() {
        return pojemnosc_hdd;
    }

    public void setPojemnosc_hdd(String pojemnosc_hdd) {
        this.pojemnosc_hdd = pojemnosc_hdd;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getZlacza() {
        return zlacza;
    }

    public void setZlacza(String zlacza) {
        this.zlacza = zlacza;
    }

    public String getObudowa() {
        return obudowa;
    }

    public void setObudowa(String obudowa) {
        this.obudowa = obudowa;
    }

    public String getLiczba_wentylatorow() {
        return liczba_wentylatorow;
    }

    public void setLiczba_wentylatorow(String liczba_wentylatorow) {
        this.liczba_wentylatorow = liczba_wentylatorow;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "id=" + id +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", system_operacyjny='" + system_operacyjny + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                ", seria='" + seria + '\'' +
                ", typ_procesora='" + typ_procesora + '\'' +
                ", seria_procesora='" + seria_procesora + '\'' +
                ", model_procesora='" + model_procesora + '\'' +
                ", ilosc_rdzeni='" + ilosc_rdzeni + '\'' +
                ", karta_graficzna='" + karta_graficzna + '\'' +
                ", wyjscia_karty_graficznej='" + wyjscia_karty_graficznej + '\'' +
                ", ram='" + ram + '\'' +
                ", rodzaj_ram='" + rodzaj_ram + '\'' +
                ", ilosc_dyskow='" + ilosc_dyskow + '\'' +
                ", pojemnosc_ssd='" + pojemnosc_ssd + '\'' +
                ", pojemnosc_hdd='" + pojemnosc_hdd + '\'' +
                ", chipset='" + chipset + '\'' +
                ", zlacza='" + zlacza + '\'' +
                ", obudowa='" + obudowa + '\'' +
                ", liczba_wentylatorow='" + liczba_wentylatorow + '\'' +
                ", cena=" + cena +
                ", isNew=" + isNew +
                '}';
    }
}
