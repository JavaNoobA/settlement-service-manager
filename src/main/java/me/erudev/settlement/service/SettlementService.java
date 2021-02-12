package me.erudev.settlement.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author pengfei.zhao
 * @date 2021/2/12 12:12
 */
@Service
public class SettlementService {

    Random rand = new Random(25);

    public Integer settlement(Integer accountId, BigDecimal amount) {
        return rand.nextInt(1000000000);
    }
}
