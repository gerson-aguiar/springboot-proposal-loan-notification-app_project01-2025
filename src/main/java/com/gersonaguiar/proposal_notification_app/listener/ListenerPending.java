package com.gersonaguiar.proposal_notification_app.listener;

import com.gersonaguiar.proposal_notification_app.domain.Proposal;
import com.gersonaguiar.proposal_notification_app.service.NotificationSnsService;
import com.gersonaguiar.proposal_notification_app.util.MessageContants;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerPending {

    private NotificationSnsService notificationSnsService;

    @RabbitListener(queues = "${rabbitmq.queue.proposal.pending}")
    public void proposalPending(Proposal proposal) {
        String message = String.format(MessageContants.PROPOSAL_NOTIFICATION_TITLE,  proposal.getUser().getFirstName(), proposal.getUser().getLastName());
        notificationSnsService.sendNotification(message);
    }
}
