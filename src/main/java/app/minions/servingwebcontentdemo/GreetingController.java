package app.minions.servingwebcontentdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@RestController
public class GreetingController {

    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @RequestMapping(value = "/greeting", method=RequestMethod.GET)
    public String greeting(HttpServletRequest req) {
        String remoteAddr = req.getRemoteAddr();
        //System.out.println(remoteAddr);
        logger.trace(remoteAddr+", "+"Greeting page accessed.");
        return "Hello! Welcome to Greeting page!";
    }

}