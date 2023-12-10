package com.example.registrationLogin.registration.token;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ConfirmationToken {
    public ConfirmationToken(String token, LocalDateTime expiredAt, LocalDateTime confirmedAt) {
        this.token = token;
        this.expiredAt = expiredAt;
        this.confirmedAt = confirmedAt;
    }

    private Long id;
    private String token;
    private LocalDateTime expiredAt;
    private LocalDateTime confirmedAt;

}
