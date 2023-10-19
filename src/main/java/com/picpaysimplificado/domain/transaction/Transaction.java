package com.picpaysimplificado.domain.transaction;


import com.picpaysimplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;


    @JoinColumn(name = "sender_id")
    @ManyToOne //User pode ter varias transacoes mas uma transacao so tem um sender ou receiver
    private User sender;

    @JoinColumn(name = "receiver_id")
    @ManyToOne //User pode ter varias transacoes mas uma transacao so tem um sender ou receiver
    private User receiver;

    private LocalDateTime timestamp;

}
