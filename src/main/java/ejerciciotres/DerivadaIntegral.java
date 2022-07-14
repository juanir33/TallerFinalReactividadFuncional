package ejerciciotres;

import java.util.List;

public class DerivadaIntegral {
    public List<FuncioinX> u = List.of(new FuncioinX(3,"x",4),
            new FuncioinX(1,"x",1));
    public void derivadaOfeU(List<FuncioinX> u){
      var uPrima = u.stream().map(
                item -> {
                    var exp = item.getExponente()>1?
                            item.getExponente()-1 : 0;
                    var a = exp>0 ? item.getFirst()*item.getExponente() : item.getFirst();
                    var x = exp>0 ? item.getX() : "";
                    return new FuncioinX(a,x,exp);

                }
        ).toList();
      var uPrimaString = uPrima.stream().map(FuncioinX::toString).reduce((a,b) ->  a +"+"+b).orElseThrow();
      var uString = u.stream().map(FuncioinX::toString).reduce((a,b) ->  a +"+"+b).orElseThrow();
       System.out.println(uPrimaString+"e^"+uString);


    }
}
