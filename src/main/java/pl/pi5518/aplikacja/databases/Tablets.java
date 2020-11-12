package pl.pi5518.aplikacja.databases;

import javax.persistence.*;

@Entity
public class Tablets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String producent;
    private String grupa_produktowa;
    private String ram;

    private String przekatna_ekranu;
    private String technologia_dotykowa;
    private String typ_wyswietlacza;
    private String wersja;
    private String rozdzielczosc;
    private String model_procesora;
    private String ilosc_rdzeni;
    private String system_operacyjny;
    private String aparat_przod;
    private String aparat_tyl;
    private String pojemnosc_akumulatora;

    private Double cena;

    private String typ = "tablet";

    @Transient
    boolean isNew;

    public Tablets(String producent, String grupa_produktowa, String ram, String przekatna_ekranu,
                   String technologia_dotykowa, String typ_wyswietlacza, String wersja, String rozdzielczosc,
                   String model_procesora, String ilosc_rdzeni, String system_operacyjny, String aparat_przod,
                   String aparat_tyl, String pojemnosc_akumulatora, Double cena, boolean isNew) {
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.ram = ram;
        this.przekatna_ekranu = przekatna_ekranu;
        this.technologia_dotykowa = technologia_dotykowa;
        this.typ_wyswietlacza = typ_wyswietlacza;
        this.wersja = wersja;
        this.rozdzielczosc = rozdzielczosc;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.system_operacyjny = system_operacyjny;
        this.aparat_przod = aparat_przod;
        this.aparat_tyl = aparat_tyl;
        this.pojemnosc_akumulatora = pojemnosc_akumulatora;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Tablets(Integer id, String producent, String grupa_produktowa, String ram, String przekatna_ekranu,
                   String technologia_dotykowa, String typ_wyswietlacza, String wersja, String rozdzielczosc,
                   String model_procesora, String ilosc_rdzeni, String system_operacyjny, String aparat_przod,
                   String aparat_tyl, String pojemnosc_akumulatora, Double cena, boolean isNew) {
        this.id = id;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.ram = ram;
        this.przekatna_ekranu = przekatna_ekranu;
        this.technologia_dotykowa = technologia_dotykowa;
        this.typ_wyswietlacza = typ_wyswietlacza;
        this.wersja = wersja;
        this.rozdzielczosc = rozdzielczosc;
        this.model_procesora = model_procesora;
        this.ilosc_rdzeni = ilosc_rdzeni;
        this.system_operacyjny = system_operacyjny;
        this.aparat_przod = aparat_przod;
        this.aparat_tyl = aparat_tyl;
        this.pojemnosc_akumulatora = pojemnosc_akumulatora;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Tablets() {
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrzekatna_ekranu() {
        return przekatna_ekranu;
    }

    public void setPrzekatna_ekranu(String przekatna_ekranu) {
        this.przekatna_ekranu = przekatna_ekranu;
    }

    public String getTechnologia_dotykowa() {
        return technologia_dotykowa;
    }

    public void setTechnologia_dotykowa(String technologia_dotykowa) {
        this.technologia_dotykowa = technologia_dotykowa;
    }

    public String getTyp_wyswietlacza() {
        return typ_wyswietlacza;
    }

    public void setTyp_wyswietlacza(String typ_wyswietlacza) {
        this.typ_wyswietlacza = typ_wyswietlacza;
    }

    public String getWersja() {
        return wersja;
    }

    public void setWersja(String wersja) {
        this.wersja = wersja;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public void setRozdzielczosc(String rozdzielczosc) {
        this.rozdzielczosc = rozdzielczosc;
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

    public String getSystem_operacyjny() {
        return system_operacyjny;
    }

    public void setSystem_operacyjny(String system_operacyjny) {
        this.system_operacyjny = system_operacyjny;
    }

    public String getAparat_przod() {
        return aparat_przod;
    }

    public void setAparat_przod(String aparat_przod) {
        this.aparat_przod = aparat_przod;
    }

    public String getAparat_tyl() {
        return aparat_tyl;
    }

    public void setAparat_tyl(String aparat_tyl) {
        this.aparat_tyl = aparat_tyl;
    }

    public String getPojemnosc_akumulatora() {
        return pojemnosc_akumulatora;
    }

    public void setPojemnosc_akumulatora(String pojemnosc_akumulatora) {
        this.pojemnosc_akumulatora = pojemnosc_akumulatora;
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
        return "Tablets{" +
                "id=" + id +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", ram='" + ram + '\'' +
                ", przekatna_ekranu='" + przekatna_ekranu + '\'' +
                ", technologia_dotykowa='" + technologia_dotykowa + '\'' +
                ", typ_wyswietlacza='" + typ_wyswietlacza + '\'' +
                ", wersja='" + wersja + '\'' +
                ", rozdzielczosc='" + rozdzielczosc + '\'' +
                ", model_procesora='" + model_procesora + '\'' +
                ", ilosc_rdzeni='" + ilosc_rdzeni + '\'' +
                ", system_operacyjny='" + system_operacyjny + '\'' +
                ", aparat_przod='" + aparat_przod + '\'' +
                ", aparat_tyl='" + aparat_tyl + '\'' +
                ", pojemnosc_akumulatora='" + pojemnosc_akumulatora + '\'' +
                ", cena=" + cena +
                ", isNew=" + isNew +
                '}';
    }
}