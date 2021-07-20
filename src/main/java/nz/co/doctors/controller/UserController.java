package nz.co.doctors.controller;

import nz.co.doctors.model.ResultCode;
import nz.co.doctors.model.ResultVO;
import nz.co.doctors.model.User;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;

@RestController
public class UserController {

    @CrossOrigin
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() throws Exception {
        return "hello from " + InetAddress.getLocalHost().getHostAddress();
    }

    @CrossOrigin
    @RequestMapping(path = "/user0", method = RequestMethod.GET)
    public ResultVO get() {

        return new ResultVO(ResultCode.SUCCESS, new User());
    }

    @CrossOrigin
    @RequestMapping(path = "/user1", method = RequestMethod.PUT)
    public ResultVO put(@RequestParam User user) {

        System.out.println("user:" + user);

        return new ResultVO(ResultCode.SUCCESS, new User());
    }

    @CrossOrigin
    @RequestMapping(path="/user2", method= RequestMethod.POST)
    public ResultVO add(@RequestBody User user) {

        System.out.println("user:" + user);
        return new ResultVO(ResultCode.SUCCESS);
    }



}
