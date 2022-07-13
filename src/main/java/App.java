import ejerciciouno.Email;
import ejerciciouno.EmailFuncional;
import ejerciciouno.EmailList;

import java.util.List;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger log =  Logger.getLogger("App");
        EmailFuncional email = new EmailFuncional();
        List<Email> list = new EmailList().getListEmails();

        var newlist = email.filterByDomain(list, "yahoo");


        log.info(list.toString());
        log.warning(newlist.toString());
    }
}
