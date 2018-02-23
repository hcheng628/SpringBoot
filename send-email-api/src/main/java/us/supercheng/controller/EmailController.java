package us.supercheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import us.supercheng.common.ServerResponse;
import us.supercheng.services.impl.EmailImpl;

@Controller
@RequestMapping("/api/v1.0")
public class EmailController {

    @Autowired
    private EmailImpl emailWorker;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> send(String sub, String body, String to) {
        return this.emailWorker.sendEmail(sub, body, to);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> send() {
        return ServerResponse.createResponseSuccess("E-mail Service is Up and Running!");
    }
}