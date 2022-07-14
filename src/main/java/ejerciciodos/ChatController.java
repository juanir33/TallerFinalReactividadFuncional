package ejerciciodos;

import reactor.core.publisher.Flux;


import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatController {
    Scanner scan = new Scanner(System.in);
    Logger logger = Logger.getLogger(ChatController.class.getName());
    private List<String> bad = List.of("puto", "maricon", "puta", "culiado", "boludo", "pajero",
                                            "concha", "pija", "sorete","coger");



    public void postNewChat(){
        logger.log(Level.INFO, "Ingresa tu respuesta al chat: ");
        var input = Arrays.stream(scan.nextLine().toLowerCase().split(" ")).toList();
        var muted =  Flux.fromIterable(input).map(item ->
          bad.contains(item)? "****" : item);
         muted.reduce((a,b)-> a+" "+b).subscribe(i -> logger.info(i))
                 ;



    }


}
