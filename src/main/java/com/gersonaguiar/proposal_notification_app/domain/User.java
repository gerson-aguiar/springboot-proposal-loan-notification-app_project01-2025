package com.gersonaguiar.proposal_notification_app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String cpf;

    private String phoneNumber;

    private Double income;
}
