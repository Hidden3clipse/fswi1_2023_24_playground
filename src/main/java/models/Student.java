package models;
public class Student {
    private String vorname, nachname, geburtsdatum, klasse;

	public Student(String vorname, String nachname, String geburtsdatum, String klasse) {
		setVorname(vorname);
		setNachname(nachname);
		this.geburtsdatum = geburtsdatum;
		setKlasse(klasse);
    }

	public Student(String nachname, String geburtsdatum) {
		setNachname(nachname);
		this.geburtsdatum = geburtsdatum;
    }

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}		

	public String getKlasse() {
		return klasse;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
}
