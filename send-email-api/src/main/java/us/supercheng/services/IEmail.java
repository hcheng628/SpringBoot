package us.supercheng.services;

import us.supercheng.common.ServerResponse;

public interface IEmail {
    ServerResponse<String> sendEmail(String sub, String body, String recpList);
}
