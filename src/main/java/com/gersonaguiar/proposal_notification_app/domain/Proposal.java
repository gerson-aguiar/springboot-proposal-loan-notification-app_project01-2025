package com.gersonaguiar.proposal_notification_app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proposal {

    private Long id;

    private Double expectedValue;

    private int paymentDeadline;

    private Boolean confirmed;

    private boolean integrated = false;

    private String note;

    private User user;
}