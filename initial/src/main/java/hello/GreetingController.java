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
    public Boolean index(@RequestParam(value="signature", defaultValue="No signiture") String signature,
                            @RequestParam(value="timestamp", defaultValue="No timestamp") String timestamp) {
        //return new Greeting(counter.incrementAndGet(),String.format(template, name));
        //System.out.println("解密后明文: ");



        return true;
    }
}
