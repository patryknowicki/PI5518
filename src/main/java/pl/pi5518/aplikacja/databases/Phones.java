package pl.pi5518.aplikacja.databases;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Phones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String seria;
    private String model;
    private String producent;
    private String grupa_produktowa;
    private String rodzaj;
    private String przekatna_ekranu;
    private String pamiec_flash;
    private String system_operacyjny;

    private String technologia_wykonania_ekranu;
    private String wprowadzanie_danych;
    private String rozdzielczosc;

    private String aparat_tyl;
    private String aparat_tyl_2;
    private String aparat_tyl_3;
    private String aparat_tyl_4;
    private String aparat_przod;

    private String ram;
    private String karta_pamieci;

    private String pojemnosc_akumulatora;

    private Double cena;

    @Transient
    boolean isNew;

    public Phones(String seria, String model, String producent, String grupa_produktowa, String rodzaj,
                  String przekatna_ekranu, String pamiec_flash, String system_operacyjny,
                  String technologia_wykonania_ekranu, String wprowadzanie_danych, String rozdzielczosc,
                  String aparat_tyl, String aparat_tyl_2, String aparat_tyl_3, String aparat_tyl_4,
                  String aparat_przod, String ram, String karta_pamieci, String pojemnosc_akumulatora,
                  Double cena, boolean isNew) {
        this.seria = seria;
        this.model = model;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.rodzaj = rodzaj;
        this.przekatna_ekranu = przekatna_ekranu;
        this.pamiec_flash = pamiec_flash;
        this.system_operacyjny = system_operacyjny;
        this.technologia_wykonania_ekranu = technologia_wykonania_ekranu;
        this.wprowadzanie_danych = wprowadzanie_danych;
        this.rozdzielczosc = rozdzielczosc;
        this.aparat_tyl = aparat_tyl;
        this.aparat_tyl_2 = aparat_tyl_2;
        this.aparat_tyl_3 = aparat_tyl_3;
        this.aparat_tyl_4 = aparat_tyl_4;
        this.aparat_przod = aparat_przod;
        this.ram = ram;
        this.karta_pamieci = karta_pamieci;
        this.pojemnosc_akumulatora = pojemnosc_akumulatora;
        this.cena = cena;
        this.isNew = isNew;
    }
    public Phones(Integer id, String seria, String model, String producent, String grupa_produktowa, String rodzaj,
                  String przekatna_ekranu, String pamiec_flash, String system_operacyjny,
                  String technologia_wykonania_ekranu, String wprowadzanie_danych, String rozdzielczosc,
                  String aparat_tyl, String aparat_tyl_2, String aparat_tyl_3, String aparat_tyl_4,
                  String aparat_przod, String ram, String karta_pamieci, String pojemnosc_akumulatora,
                  Double cena, boolean isNew) {
        this.id = id;
        this.seria = seria;
        this.model = model;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.rodzaj = rodzaj;
        this.przekatna_ekranu = przekatna_ekranu;
        this.pamiec_flash = pamiec_flash;
        this.system_operacyjny = system_operacyjny;
        this.technologia_wykonania_ekranu = technologia_wykonania_ekranu;
        this.wprowadzanie_danych = wprowadzanie_danych;
        this.rozdzielczosc = rozdzielczosc;
        this.aparat_tyl = aparat_tyl;
        this.aparat_tyl_2 = aparat_tyl_2;
        this.aparat_tyl_3 = aparat_tyl_3;
        this.aparat_tyl_4 = aparat_tyl_4;
        this.aparat_przod = aparat_przod;
        this.ram = ram;
        this.karta_pamieci = karta_pamieci;
        this.pojemnosc_akumulatora = pojemnosc_akumulatora;
        this.cena = cena;
        this.isNew = isNew;
    }

    public Phones() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getPrzekatna_ekranu() {
        return przekatna_ekranu;
    }

    public void setPrzekatna_ekranu(String przekatna_ekranu) {
        this.przekatna_ekranu = przekatna_ekranu;
    }

    public String getPamiec_flash() {
        return pamiec_flash;
    }

    public void setPamiec_flash(String pamiec_flash) {
        this.pamiec_flash = pamiec_flash;
    }

    public String getSystem_operacyjny() {
        return system_operacyjny;
    }

    public void setSystem_operacyjny(String system_operacyjny) {
        this.system_operacyjny = system_operacyjny;
    }

    public String getTechnologia_wykonania_ekranu() {
        return technologia_wykonania_ekranu;
    }

    public void setTechnologia_wykonania_ekranu(String technologia_wykonania_ekranu) {
        this.technologia_wykonania_ekranu = technologia_wykonania_ekranu;
    }

    public String getWprowadzanie_danych() {
        return wprowadzanie_danych;
    }

    public void setWprowadzanie_danych(String wprowadzanie_danych) {
        this.wprowadzanie_danych = wprowadzanie_danych;
    }

    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public void setRozdzielczosc(String rozdzielczosc) {
        this.rozdzielczosc = rozdzielczosc;
    }

    public String getAparat_tyl() {
        return aparat_tyl;
    }

    public void setAparat_tyl(String aparat_tyl) {
        this.aparat_tyl = aparat_tyl;
    }

    public String getAparat_tyl_2() {
        return aparat_tyl_2;
    }

    public void setAparat_tyl_2(String aparat_tyl_2) {
        this.aparat_tyl_2 = aparat_tyl_2;
    }

    public String getAparat_tyl_3() {
        return aparat_tyl_3;
    }

    public void setAparat_tyl_3(String aparat_tyl_3) {
        this.aparat_tyl_3 = aparat_tyl_3;
    }

    public String getAparat_tyl_4() {
        return aparat_tyl_4;
    }

    public void setAparat_tyl_4(String aparat_tyl_4) {
        this.aparat_tyl_4 = aparat_tyl_4;
    }

    public String getAparat_przod() {
        return aparat_przod;
    }

    public void setAparat_przod(String aparat_przod) {
        this.aparat_przod = aparat_przod;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKarta_pamieci() {
        return karta_pamieci;
    }

    public void setKarta_pamieci(String karta_pamieci) {
        this.karta_pamieci = karta_pamieci;
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
        return "Phones{" +
                "id=" + id +
                ", seria='" + seria + '\'' +
                ", model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                ", przekatna_ekranu='" + przekatna_ekranu + '\'' +
                ", pamiec_flash='" + pamiec_flash + '\'' +
                ", system_operacyjny='" + system_operacyjny + '\'' +
                ", technologia_wykonania_ekranu='" + technologia_wykonania_ekranu + '\'' +
                ", wprowadzanie_danych='" + wprowadzanie_danych + '\'' +
                ", rozdzielczosc='" + rozdzielczosc + '\'' +
                ", aparat_tyl='" + aparat_tyl + '\'' +
                ", aparat_tyl_2='" + aparat_tyl_2 + '\'' +
                ", aparat_tyl_3='" + aparat_tyl_3 + '\'' +
                ", aparat_tyl_4='" + aparat_tyl_4 + '\'' +
                ", aparat_przod='" + aparat_przod + '\'' +
                ", ram='" + ram + '\'' +
                ", karta_pamieci='" + karta_pamieci + '\'' +
                ", pojemnosc_akumulatora='" + pojemnosc_akumulatora + '\'' +
                ", cena=" + cena +
                ", isNew=" + isNew +
                '}';
    }
}
