package com.gersonaguiar.proposal_notification_app.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationSnsService {

    @Autowired
    private AmazonSNS amazonSSN;

    public void sendNotification(String cellPhone, String message) {
        PublishRequest publishRequest = new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(cellPhone);
        amazonSSN.publish(publishRequest);
    }
}
