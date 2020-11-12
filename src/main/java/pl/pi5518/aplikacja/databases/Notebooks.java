package pl.pi5518.aplikacja.databases;

import javax.persistence.*;

@Entity
public class Notebooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String producent;
    private  String grupa_produktowa;
    private  String system_operacyjny;
    private  String rodzaj_laptopa;
    private  String przekatna_ekranu;
    private  String typ_procesora;
    private  String rodzaj_dysku;

    private  String rozdzielczosc;

    private  String seria_procesora;
    private  String model_procesora;
    private  String ilosc_rdzeni;

    private  String ram;
    private  String ilosc_dyskow;
    private  String pojemnosc_ssd;
    private  String pojemnosc_hdd;

    private  String karta_graficzna;
    private  String wyjscia_karty_graficznej;

    private Double cena;

    private String typ = "notebook";

    @Transient
    boolean isNew;

    public Notebooks(String producent, String grupa_produktowa, String system_operacyjny, String rodzaj_laptopa,
                     String przekatna_ekranu, String typ_procesora, String rodzaj_dysku, String rozdzielczosc,
                     String seria_procesora, String model_procesora, String ilosc_rdzeni, String ram,
                     String ilosc_dyskow, String pojemnosc_ssd, String pojemnosc_hdd, String karta_graficzna,
                     String wyjscia_karty_graficznej, Double cena, boolean isNew) {
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.system_operacyjny = system_operacyjny;
        this.rodzaj_laptopa = rodzaj_laptopa;
        this.przekatna_ekranu = przekatna_ekranu;
        this.typ_procesora = typ_procesora;
        this.rodzaj_dysku = rodzaj_dysku;
        this.rozdzielczosc = rozdzielczosc;
        this.seria_procesora = seria_procesora;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.ram = ram;
        this.ilosc_dyskow = ilosc_dyskow;
        this.pojemnosc_ssd = pojemnosc_ssd;
        this.pojemnosc_hdd = pojemnosc_hdd;
        this.karta_graficzna = karta_graficzna;
        this.wyjscia_karty_graficznej = wyjscia_karty_graficznej;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Notebooks(Integer id, String producent, String grupa_produktowa, String system_operacyjny,
                     String rodzaj_laptopa, String przekatna_ekranu, String typ_procesora, String rodzaj_dysku,
                     String rozdzielczosc, String seria_procesora, String model_procesora, String ilosc_rdzeni,
                     String ram, String ilosc_dyskow, String pojemnosc_ssd, String pojemnosc_hdd,
                     String karta_graficzna, String wyjscia_karty_graficznej, Double cena, boolean isNew) {
        this.id = id;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.system_operacyjny = system_operacyjny;
        this.rodzaj_laptopa = rodzaj_laptopa;
        this.przekatna_ekranu = przekatna_ekranu;
        this.typ_procesora = typ_procesora;
        this.rodzaj_dysku = rodzaj_dysku;
        this.rozdzielczosc = rozdzielczosc;
        this.seria_procesora = seria_procesora;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.ram = ram;
        this.ilosc_dyskow = ilosc_dyskow;
        this.pojemnosc_ssd = pojemnosc_ssd;
        this.pojemnosc_hdd = pojemnosc_hdd;
        this.karta_graficzna = karta_graficzna;
        this.wyjscia_karty_graficznej = wyjscia_karty_graficznej;
        this.cena = cena;
        this.isNew = isNew;
    }
    public Notebooks(){
        
    }

    public Notebooks(String producent, String grupa_produktowa, String system_operacyjny, String rodzaj_laptopa,
                     String przekatna_ekranu, String typ_procesora, String rodzaj_dysku, String rozdzielczosc,
                     String seria_procesora, String model_procesora, String ilosc_rdzeni, String ilosc_dyskow,
                     String pojemnosc_ssd, String pojemnosc_hdd, String karta_graficzna,
                     String wyjscia_karty_graficznej, Double cena, boolean b) {
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

    public String getRodzaj_laptopa() {
        return rodzaj_laptopa;
    }

    public void setRodzaj_laptopa(String rodzaj_laptopa) {
        this.rodzaj_laptopa = rodzaj_laptopa;
    }

    public String getPrzekatna_ekranu() {
        return przekatna_ekranu;
    }

    public void setPrzekatna_ekranu(String przekatna_ekranu) {
        this.przekatna_ekranu = przekatna_ekranu;
    }

    public String getTyp_procesora() {
        return typ_procesora;
    }

    public void setTyp_procesora(String typ_procesora) {
        this.typ_procesora = typ_procesora;
    }

    public String getRodzaj_dysku() {
        return rodzaj_dysku;
    }

    public void setRodzaj_dysku(String rodzaj_dysku) {
        this.rodzaj_dysku = rodzaj_dysku;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public void setRozdzielczosc(String rozdzielczosc) {
        this.rozdzielczosc = rozdzielczosc;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
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
        return "Notebooks{" +
                "id=" + id +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", system_operacyjny='" + system_operacyjny + '\'' +
                ", rodzaj_laptopa='" + rodzaj_laptopa + '\'' +
                ", przekatna_ekranu='" + przekatna_ekranu + '\'' +
                ", typ_procesora='" + typ_procesora + '\'' +
                ", rodzaj_dysku='" + rodzaj_dysku + '\'' +
                ", rozdzielczosc='" + rozdzielczosc + '\'' +
                ", seria_procesora='" + seria_procesora + '\'' +
                ", model_procesora='" + model_procesora + '\'' +
                ", ilosc_rdzeni='" + ilosc_rdzeni + '\'' +
                ", ram='" + ram + '\'' +
                ", ilosc_dyskow='" + ilosc_dyskow + '\'' +
                ", pojemnosc_ssd='" + pojemnosc_ssd + '\'' +
                ", pojemnosc_hdd='" + pojemnosc_hdd + '\'' +
                ", karta_graficzna='" + karta_graficzna + '\'' +
                ", wyjscia_karty_graficznej='" + wyjscia_karty_graficznej + '\'' +
                ", cena=" + cena +
                ", isNew=" + isNew +
                '}';
    }
}