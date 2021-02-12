package me.erudev.settlement.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.erudev.settlement.enums.SettlementStatus;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author pengfei.zhao
 * @date 2021/2/12 12:11
 */
@Getter
@Setter
@ToString
public class SettlementPO {
    private Integer id;
    private Integer orderId;
    private Integer transactionId;
    private SettlementStatus status;
    private BigDecimal amount;
    private Date date;
}
