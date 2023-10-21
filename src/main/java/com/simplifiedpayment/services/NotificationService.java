package com.simplifiedpayment.services;

import org.springframework.stereotype.Service;

import com.simplifiedpayment.domain.user.User;

@Service
public class NotificationService {

    public void sendNotification(User user, String message) throws Exception{
        System.out.println(message);
    }
}
