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

    public String getProducent() {
        return producent;
    }

    public String getGrupa_produktowa() {
        return grupa_produktowa;
    }

    public String getSystem_operacyjny() {
        return system_operacyjny;
    }

    public String getRodzaj_laptopa() {
        return rodzaj_laptopa;
    }

    public String getPrzekatna_ekranu() {
        return przekatna_ekranu;
    }

    public String getTyp_procesora() {
        return typ_procesora;
    }

    public String getRodzaj_dysku() {
        return rodzaj_dysku;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public String getSeria_procesora() {
        return seria_procesora;
    }

    public String getModel_procesora() {
        return model_procesora;
    }

    public String getIlosc_rdzeni() {
        return ilosc_rdzeni;
    }

    public String getRam() {
        return ram;
    }

    public String getIlosc_dyskow() {
        return ilosc_dyskow;
    }

    public String getPojemnosc_ssd() {
        return pojemnosc_ssd;
    }

    public String getPojemnosc_hdd() {
        return pojemnosc_hdd;
    }

    public String getKarta_graficzna() {
        return karta_graficzna;
    }

    public String getWyjscia_karty_graficznej() {
        return wyjscia_karty_graficznej;
    }

    public Double getCena() {
        return cena;
    }

    public boolean isNew() {
        return isNew;
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