package ejerciciouno;

import ejerciciouno.data.EmailList;
import ejerciciouno.domain.Email;

import java.util.List;
import java.util.logging.Logger;

public class EmailFuncional {
    Logger log = Logger.getLogger("email");



    public List<Email> findRepeatEmails(List<Email> list) {
        return list.stream()
                .map(Email::email)
                .distinct()
                .map(item -> new Email(item, false, false))
                .toList();
    }

    public List<Email> filterByDomain(List<Email> list, String filtro) {
        return list.stream()
                .filter(item -> item.email().contains(filtro))
                .toList();
    }

    public List<Email> validateEmailType(List<Email> list) {
        return list.stream()
                .map(item ->{
                    var pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

                    return
                        item.email().matches(pattern) ?
                               new Email(item.email(), item.verificado(), true):
                                new Email(item.email(), item.verificado(), item.valid());})
                .toList();


    }
    public void printIfAllIsValidOrInvalid(List<Email> data){

        var filtro = data.stream().filter(item -> item.valid().equals(false))
                .toList();
        var isAnyNull = filtro.isEmpty() ? "Todos son validos" : "Hay emails, no validos";
        System.out.println(isAnyNull);

    }

    public Long countAmountOfEmails(List<Email> list){
        var emailNoRepeat = findRepeatEmails(list);
        var emailValid = validateEmailType(emailNoRepeat);
        return emailValid.stream()
                .filter(item -> item.valid().equals(true))
                .count();


    }

    public void countAmountOfEmailsByDomain(List<Email> list){
        var emailNoRepeat = findRepeatEmails(list);
        var emailValid = validateEmailType(emailNoRepeat);
        var gmailCount = emailValid.stream()
                .filter(ele -> ele.valid().equals(true))
                .filter(item-> item.email().contains("gmail"))
                .count();
        var hotmailCount = emailValid.stream()
                .filter(ele -> ele.valid().equals(true))
                .filter(item-> item.email().contains("hotmail"))
                .count();
        var outlookCount = emailValid.stream()
                .filter(ele -> ele.valid().equals(true))
                .filter(item-> item.email().contains("outlook"))
                .count();

        log.info("La cantidad de emails filtrada por dominio es: \n"+
                "Gmail: "+gmailCount+"\nHotmail: "+hotmailCount+"\nOutlook: "+outlookCount);
    }

    public List<Email> sendEmailVerification(List<Email> lista, String enviado){

        var isValid = lista.stream().filter(email -> email.valid().equals(true)).toList();
        return   isValid.stream().map(item-> item.email().matches(enviado) ?
          new Email(item.email(), true, item.valid()) :
          new Email(item.email(), item.verificado(), item.valid())).toList();

    }

}