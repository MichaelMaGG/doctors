package nz.co.doctorS.DoctorS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class UserController {

    @RequestMapping("/user")
    public String index() throws Exception {
        return "hello from " + InetAddress.getLocalHost().getHostAddress();
    }

}
