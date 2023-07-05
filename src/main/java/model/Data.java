package model;

public class Data {


    private String fullname;
    private String email;
    private String currentaddress;
    private String permanetaddress;
    private String texto;

    public Data(String fullname, String email, String currentaddress, String permanetaddress,String texto) {
        this.fullname = fullname;
        this.email = email;
        this.currentaddress = currentaddress;
        this.permanetaddress = permanetaddress;
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    public String getPermanetaddress() {
        return permanetaddress;
    }

    public void setPermanetaddress(String permanetaddress) {
        this.permanetaddress = permanetaddress;
    }




}
