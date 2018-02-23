package us.supercheng.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import us.supercheng.common.ServerResponse;
import us.supercheng.services.IEmail;
import us.supercheng.util.EmailUtil;
import javax.mail.Session;
import java.util.Properties;

@Service
public class EmailImpl implements IEmail {

    @Autowired
    @Qualifier("emailProps")
    private Properties emailProps;

    @Override
    public ServerResponse<String> sendEmail(String sub, String body, String recpList) {
        try {
            EmailUtil.sendEmail(Session.getInstance(this.emailProps, null), recpList, sub, body);
            return ServerResponse.createResponseSuccess("E-mail Sent Success");
        } catch (Exception ex) {
            return ServerResponse.createResponseError("E-mail Sent Error: " + ex.getStackTrace());
        }
    }
}