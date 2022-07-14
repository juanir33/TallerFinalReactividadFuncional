package ejerciciouno;

import ejerciciodos.ChatController;
import ejerciciotres.DerivadaIntegral;
import ejerciciouno.domain.Email;
import ejerciciouno.data.EmailList;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Logger log =  Logger.getLogger(App.class.getName());
        EmailFuncional email = new EmailFuncional();
        List<Email> list = new EmailList().getListEmails();
        Scanner scan = new Scanner(System.in);
        int close = 1;
        do{
            log.info("""
                Ejecucion de los metodos aplicados a una lista de emails
                --------------------------------------------------------
                Para iniciar elija cual quiere ejecutar
                
                --------------------------------------------------------
                
                1) Eliminar emails repetidos
                2) Correos filtrados por dominio
                3) Conocer si todos los emails son validos
                4) Conocer cuantos correos hay, y cuantos de cada dominio
                5) Enviar correo de verificacion
                0) Salir
                ---------------------------------------------------------
                """);

            var option = scan.nextInt();
        switch (option){
            case 1 -> item1(log,list,email);

            case 2 -> item2(log,email,list);
            case 3 -> item3(log,email,list);
            case 4 -> item4y5(log,email,list);
            case 5 -> item6(log,email,list);
            case 0 -> {
                log.info("Estas saliendo de la aplicacion gracias!!");
                close = 0;
            }
            default -> log.info( "Por favor digite una opcion valida");
        }
           }while (close != 0);



    }
    public static void item1(Logger log, List<Email> list, EmailFuncional email){
        log.info("Item 1 - Utilizar distinct, arriba la original y abajo la de unicos");
        log.info(list.toString());
        log.info(email.findRepeatEmails(list).toString());
    }

    public static void item2(Logger log,EmailFuncional email, List<Email>list){
        var validate = email.findRepeatEmails(list);
        log.info("Item 2 - Correos filtrados por su dominio");

        log.info(email.filterByDomain(validate, "@gmail").toString());
        log.info(email.filterByDomain(validate, "@hotmail").toString());
        log.info(email.filterByDomain(validate, "@outlook").toString());
    }
    public static void item3(Logger log,EmailFuncional email, List<Email>list){
       log.info("Item 3 - Conocer si todos los emails son validos, tienen @ y dominio.");
        var validate = email.validateEmailType(list);
        email.printIfAllIsValidOrInvalid(validate);
        validate.stream().map(Email::toStringNoValid).forEach(log::info);
    }
    public static void item4y5(Logger log,EmailFuncional email, List<Email>list){
        log.info("Item 4 y 5 - Conocer cuantos correos hay, y cuantos de cada dominio");
        var validCount = email.countAmountOfEmails(list);
        log.log(Level.INFO,"El total de correos validos es: {0}",validCount);
        email.countAmountOfEmailsByDomain(list);
    }
    public static void item6(Logger log,EmailFuncional email, List<Email>list){
        log.info("Item 6 - Enviar correo de verificacion");
        var emailNoRepeat = email.findRepeatEmails(list);
        var emailValid = email.validateEmailType(emailNoRepeat);
        var sendFirst = email.sendEmailVerification(emailValid,"assunta.stoltenberg@gmail.com");
        var sendSecond = email.sendEmailVerification(sendFirst, "bertrand34@gmail.com");
        var sendThird = email.sendEmailVerification(sendSecond, "langosh.reuben@outlook.com");

        log.info(sendFirst.toString());
        log.info(sendSecond.toString());
        log.info(sendThird.toString());
    }


}
