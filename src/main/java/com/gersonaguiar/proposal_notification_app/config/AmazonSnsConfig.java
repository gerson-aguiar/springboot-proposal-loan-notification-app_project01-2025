package com.gersonaguiar.proposal_notification_app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSnsConfig {

    @Value("${aws.accessKey")
    private String accessKey;

    @Value("${aws.secretKey}")
    private String secretKey;
}
