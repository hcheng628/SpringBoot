package us.supercheng.util;

import us.supercheng.common.Const;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
    public static void sendEmail(Session session, String toEmail, String subject, String body) throws Exception{
        MimeMessage msg = new MimeMessage(session);
        msg.addHeader("Content-type", "text/HTML; charset=" + Const.DEFAULT_ENCODING);
        msg.setSubject(subject, Const.DEFAULT_ENCODING);
        msg.setText(body, Const.DEFAULT_ENCODING);
        msg.setSentDate(new Date());
        List<String> toList = new ArrayList<String>(Arrays.asList(toEmail.split(";")));
        for (String each : toList) {
            msg.addRecipients(Message.RecipientType.TO,InternetAddress.parse(each, false));
        }
        Transport.send(msg);
    }
}