package com.gersonaguiar.proposal_notification_app.listener;

import com.gersonaguiar.proposal_notification_app.domain.Proposal;
import com.gersonaguiar.proposal_notification_app.service.NotificationSnsService;
import com.gersonaguiar.proposal_notification_app.util.MessageContants;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListenerPending {

    @Autowired
    private NotificationSnsService notificationSnsService;

    @RabbitListener(queues = "${rabbitmq.queue.proposal.pending}")
    public void proposalPending(Proposal proposal) {
        String userName = (proposal.getUser() != null) ? proposal.getUser().getFirstName() : "Unknown User";
        String message = String.format(MessageContants.PROPOSAL_NOTIFICATION_TITLE,  userName);

        String cellPhone = "+5538";

        notificationSnsService.sendNotification(cellPhone, message);
    }
}
