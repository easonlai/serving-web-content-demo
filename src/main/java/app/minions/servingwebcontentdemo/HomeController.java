package app.minions.servingwebcontentdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String home(HttpServletRequest req) {
        String remoteAddr = req.getRemoteAddr();
        //System.out.println(remoteAddr);
        logger.trace(remoteAddr+", "+"Home page accessed.");
        return "Hello! Welcome to Home page!";
    }

}