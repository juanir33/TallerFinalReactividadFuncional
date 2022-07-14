import ejerciciodos.ChatController;
import ejerciciotres.DerivadaIntegral;
import ejerciciouno.domain.Email;
import ejerciciouno.EmailFuncional;
import ejerciciouno.data.EmailList;

import java.util.List;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger log =  Logger.getLogger(App.class.getName());
        EmailFuncional email = new EmailFuncional();
        List<Email> list = new EmailList().getListEmails();
        ChatController chat = new ChatController();
        DerivadaIntegral dev =new DerivadaIntegral();

         //email.countAmountOfEmailsByDomain(list);

        //email.sendEmailVerification(list, "assunta.stoltenberg@gmail.com");
        //email.sendEmailVerification(list, "bertrand34@gmail.com");
       dev.derivadaOfeU(dev.u);
       dev.integralOfU(dev.u);

        //log.info(chate.toString());
       // log.warning(validos.toString());
    }
}
