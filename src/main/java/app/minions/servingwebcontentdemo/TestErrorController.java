package app.minions.servingwebcontentdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TestErrorController {

    Logger logger = LoggerFactory.getLogger(TestErrorController.class);

    @RequestMapping(value = "/testerror", method=RequestMethod.GET)
    public String testerror(HttpServletRequest req) {
        String remoteAddr = req.getRemoteAddr();
        //System.out.println(remoteAddr);
        logger.error(remoteAddr+", "+"Test Error page accessed.");
        return "Hello! Welcome to Test Error page!";
    }

}