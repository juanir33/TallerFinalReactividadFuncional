package ejerciciouno.data;

import ejerciciouno.domain.Email;

import java.util.Arrays;
import java.util.List;

public class EmailList {


    public List<Email> getListEmails(){
        var data = Arrays.asList(
                new Email("assunta.stoltenberg@gmail.com", false, false),
                new Email("assunta.stoltenberg@gmail.com", false, false),
                new Email("eulah.gutkowski@gmailcom", false, false),
                new Email("bertrand34@gmail.com", false, false),
                new Email("wwill@hotmail.com", false, false),
                new Email("thompson.orland@gmail.com", false, false),
                new Email("emile84gmail.com", false, false),
                new Email("lionel48hotmail.com", false, false),
                new Email("gaylord.gusikowski@hotmail.com", false, false),
                new Email("gaylord.gusikowski@hotmail.com", false, false),
                new Email("donnelly.lourdes@hotmail.com", false, false),
                new Email("as.stoltenberg@hotmail.com", false, false),
                new Email("daren.king@hotmail.com", false, false),
                new Email("sritchie@hotmail.com", false, false),
                new Email("stoltenberg@gmail.com", false, false),
                new Email("marilyne@gmail.com", false, false),
                new Email("rgutkowski.stoltenberg@gmail.com", false, false),
                new Email("ta.stoltenberg@gmail.com", false, false),
                new Email("assunta@gmail.com", false, false),
                new Email("kristy@outlook.com", false, false),
                new Email("langosh.reuben@outlook.com", false, false),
                new Email("doris53@outlook.com", false, false),
                new Email("corbin82@gmail.com", false, false),
                new Email("rhill@gmail.com", false, false),
                new Email("manuelle02@outlook.com", false, false),
                new Email("assunta.preston50@gmail.com", false, false),
                new Email("orland@outlook.com", false, false),
                new Email("assunta.bertrand34@gmail.com", false, false),
                new Email("assunta.bertrand34@gmail.com", false, false),
                new Email("wwill@gmail.com", false, false)

        );
        return data;
    }
}
