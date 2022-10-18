package entity;

public class Student {
    private  String cin;
    private  String nompre;
    private  String email;

    public Student(String cin, String nompre, String email) {
        this.cin = cin;
        this.nompre = nompre;
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public String getNompre() {
        return nompre;
    }

    public String getEmail() {
        return email;
    }
}
