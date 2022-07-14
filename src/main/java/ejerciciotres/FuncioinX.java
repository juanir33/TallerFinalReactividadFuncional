package ejerciciotres;

public class FuncioinX {
    private Integer first;
    private String X;
    private Integer exponente;

    public FuncioinX(Integer first, String x, Integer exponente) {
        this.first = first;
        X = x;
        this.exponente = exponente;
    }

    public FuncioinX(Integer first) {
        this.first = first;
    }

    public FuncioinX(Integer first, String x) {
        this.first = first;
        X = x;
    }

    public FuncioinX(String x, Integer exponente) {
        X = x;
        this.exponente = exponente;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public Integer getExponente() {
        return exponente;
    }

    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return  exponente>1?
         first+X+"^"+exponente : first+X ;
    }

    public String toStringIntegral() {
        return  first/exponente == 1?
                X+"^"+exponente : first+"/"+exponente+X+"^"+exponente ;
    }

}
