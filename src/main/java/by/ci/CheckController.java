package by.ci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("/")
    public String imHealthy() {
        return "{healthy:true}";
    }

}
