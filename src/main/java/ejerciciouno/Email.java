package ejerciciouno;


public class Email {
    private String email;
    private Boolean verificado;

    public Email(String email, Boolean verificado) {
        this.email = email;
        this.verificado = verificado;
    }

    public Boolean verificado() {
        return verificado;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    @Override
    public String toString() {
        return "Email = " +email+
                " - verificado= " +verificado;
    }
}
