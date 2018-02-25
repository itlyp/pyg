package com.pinyougou.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * <p>Description:  </p>
 * <p>User: 李元璞</P>
 * <p>Date: 2018-02-06</p>
 * <p>Time: 16:13</p>
 */
public class TbSeckillOrder {
    private Long id;                // '主键',
    private Long seckillId;        // '秒杀商品ID',
    private BigDecimal money;       // '支付金额',
    private String userId;         // '用户',
    private String sellerId;       // '商家',
    private Timestamp createTime;  // '创建时间',
    private Timestamp payTime;     // '支付时间',
    private String status;          // '状态',
    private String receiverAddress;// '收货人地址',
    private String receiverMobile; // '收货人电话',
    private String receiver;        // '收货人',
    private String transactionId;  // '交易流水',

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "TbSeckillOrder{" +
                "id=" + id +
                ", seckillId=" + seckillId +
                ", money=" + money +
                ", userId='" + userId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", status='" + status + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverMobile='" + receiverMobile + '\'' +
                ", receiver='" + receiver + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
