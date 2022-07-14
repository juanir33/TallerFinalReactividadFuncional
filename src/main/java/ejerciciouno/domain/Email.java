package ejerciciouno.domain;


public class Email {
    private String email;
    private Boolean verificado;

    private Boolean isValid;

    public Email(String email, Boolean verificado, Boolean isValid) {
        this.email = email;
        this.verificado = verificado;
        this.isValid = isValid;
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

    public Boolean valid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    @Override
    public String toString() {
        return "Email = " +email+
                " - verificado= " +verificado;
    }
    public String toStringNoValid() {
        return "Email = " +email+
                " - valido= " +isValid;
    }
}
