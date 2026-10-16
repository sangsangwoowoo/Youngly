package com.kb.youngly.dto.moimaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoimAccountDTO {

    private String moimAccountId;

    private String accountNumber;

    private String bankName;

    private BigDecimal balance;

    private String accountName;

    private Boolean owner;

    private String ownerName;

    private LocalDateTime syncedAt;

}
