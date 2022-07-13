package ejerciciouno;

import java.util.List;
import java.util.stream.Collectors;

public class EmailFuncional {

    public List<Email> emailList = new EmailList().getListEmails();


    public List<Email> findRepeatEmails(List<Email> list){
        return list.stream()
                .map(i -> i.email())
                .distinct()
                .map(item -> new Email(item, false))
                .toList();
    }

    public List<Email> filterByDomain(List<Email> list, String filtro){
        return list.stream()
                .filter(item-> item.email().contains(filtro))
                .toList();
    }


}
