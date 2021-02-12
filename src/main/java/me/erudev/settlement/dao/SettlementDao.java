package me.erudev.settlement.dao;

import me.erudev.settlement.po.SettlementPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

/**
 * @author pengfei.zhao
 * @date 2021/2/12 12:10
 */
@Mapper
@Repository
public interface SettlementDao {

    @Insert("INSERT INTO settlement (order_id, transaction_id, amount, status, date) " +
            "VALUES(#{orderId}, #{transactionId}, #{amount}, #{status}, #{date})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(SettlementPO settlementPO);
}
