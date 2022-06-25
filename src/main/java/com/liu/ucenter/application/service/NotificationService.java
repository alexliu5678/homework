package com.liu.ucenter.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * send email service
 */
@Service
public class NotificationService {
    private static Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void sendMail(){
        logger.info("send mail .........");
    }
}
