package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index(@RequestParam(value="signature", defaultValue="No signiture") String signature,
                        @RequestParam(value="timestamp", defaultValue="No timestamp") String timestamp,
                        @RequestParam(value="nounce", defaultValue="No nounce") String nounce,
                        @RequestParam(value="echostr", defaultValue="No echostr") String echostr) {
        System.out.println("Signiture: " + signature);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Nounce: " + nounce);
        System.out.println("Echostr: " + echostr);

        return echostr;

    }
}
