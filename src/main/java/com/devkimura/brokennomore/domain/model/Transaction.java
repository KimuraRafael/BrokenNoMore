package com.devkimura.brokennomore.domain.model;

import com.devkimura.brokennomore.domain.enums.TransactionDirection;
import com.devkimura.brokennomore.domain.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {


    private UUID id;
    private UUID accountId;

    private String description;

    private BigDecimal amount;

    private TransactionType type;
    private TransactionDirection direction;

    private UUID categoryId;

    private LocalDateTime occurredAt;

}
