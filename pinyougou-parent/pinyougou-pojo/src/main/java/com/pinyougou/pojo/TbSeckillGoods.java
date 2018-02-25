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
public class TbSeckillGoods {
    private Long id;
    private Long goodsId;          //'spu ID',
    private Long itemId;           //'sku ID',
    private String title;           //'标题',
    private String smallPic;       //'商品图片',
    private BigDecimal price;       //'原价格',
    private BigDecimal costPrice;  //'秒杀价格',
    private String sellerId;       //'商家ID',
    private Timestamp create_time;  //'添加日期',
    private Timestamp check_time;   //'审核日期',
    private String status;          //'审核状态',
    private Timestamp start_time;   //'开始时间',
    private Timestamp end_time;     //'结束时间',
    private Integer num;             //'秒杀商品数',
    private Integer stock_count;     //'剩余库存数',
    private String introduction;    //'描述',

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Timestamp check_time) {
        this.check_time = check_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStock_count() {
        return stock_count;
    }

    public void setStock_count(Integer stock_count) {
        this.stock_count = stock_count;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "TbSeckillGoods{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", itemId=" + itemId +
                ", title='" + title + '\'' +
                ", smallPic='" + smallPic + '\'' +
                ", price=" + price +
                ", costPrice=" + costPrice +
                ", sellerId='" + sellerId + '\'' +
                ", create_time=" + create_time +
                ", check_time=" + check_time +
                ", status='" + status + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", num=" + num +
                ", stock_count=" + stock_count +
                ", introduction='" + introduction + '\'' +
                '}';
    }

}
