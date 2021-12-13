package edu.yctc.erpsystem.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * 订单查询表
 * @author smile
 */
public class OrderQueryModel extends BaseRowModel {
    @ExcelProperty(value = {"订单查询信息", "序号"}, index = 0)
    private String index;

    @ExcelProperty(value = {"订单查询信息", "订单号"}, index = 1)
    private String orderNumber;

    @ExcelProperty(value = {"订单查询信息", "客户代码"}, index = 2)
    private String code;

    @ExcelProperty(value = {"订单查询信息", "客户名称"}, index = 3)
    private String name;

    @ExcelProperty(value = {"订单查询信息", "品名"}, index = 4)
    private String itemName;

    @ExcelProperty(value = {"订单查询信息", "规格"}, index = 5)
    private String spec;

    @ExcelProperty(value = {"订单查询信息", "单位"}, index = 6)
    private String unit;

    @ExcelProperty(value = {"订单查询信息", "订单数量"}, index = 8)
    private String orderAmount;

    @ExcelProperty(value = {"订单查询信息", "投产数量"}, index = 9)
    private String productAmount;

    @ExcelProperty(value = {"订单查询信息", "每单投产数量"}, index = 10)
    private String everyOrderAmount;

    @ExcelProperty(value = {"订单查询信息", "每单数量"}, index = 11)
    private String everyProductAmount;

    @ExcelProperty(value = {"订单查询信息", "采购日期"}, index = 12)
    private String orderDate;

    @ExcelProperty(value = {"订单查询信息", "交货日期"}, index = 13)
    private String deliveryDate;

    @ExcelProperty(value = {"订单查询信息", "计划到账日期"}, index = 14)
    private String planArrivalDate;

    @ExcelProperty(value = {"订单查询信息", "实际到账日期"}, index = 15)
    private String actualArrivalDate;

    @ExcelProperty(value = {"订单查询信息", "是否到账"}, index = 16)
    private String isArrival;

    @ExcelProperty(value = {"订单查询信息", "是否完结"}, index = 17)
    private String isFinish;

    @ExcelProperty(value = {"订单查询信息", "业务人员审核状态"}, index = 18)
    private String checkFlag;

    @ExcelProperty(value = {"订单查询信息", "生产管理人员审核状态"}, index = 19)
    private String finalCheckFlag;

    @ExcelProperty(value = {"订单查询信息", "备注"}, index = 21)
    private String remark;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getEveryOrderAmount() {
        return everyOrderAmount;
    }

    public void setEveryOrderAmount(String everyOrderAmount) {
        this.everyOrderAmount = everyOrderAmount;
    }

    public String getEveryProductAmount() {
        return everyProductAmount;
    }

    public void setEveryProductAmount(String everyProductAmount) {
        this.everyProductAmount = everyProductAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPlanArrivalDate() {
        return planArrivalDate;
    }

    public void setPlanArrivalDate(String planArrivalDate) {
        this.planArrivalDate = planArrivalDate;
    }

    public String getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(String actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public String getIsArrival() {
        return isArrival;
    }

    public void setIsArrival(String isArrival) {
        this.isArrival = isArrival;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag;
    }

    public String getFinalCheckFlag() {
        return finalCheckFlag;
    }

    public void setFinalCheckFlag(String finalCheckFlag) {
        this.finalCheckFlag = finalCheckFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OrderQueryModel{" +
                "index='" + index + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", itemName='" + itemName + '\'' +
                ", spec='" + spec + '\'' +
                ", unit='" + unit + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", productAmount='" + productAmount + '\'' +
                ", everyOrderAmount='" + everyOrderAmount + '\'' +
                ", everyProductAmount='" + everyProductAmount + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", planArrivalDate='" + planArrivalDate + '\'' +
                ", actualArrivalDate='" + actualArrivalDate + '\'' +
                ", isArrival='" + isArrival + '\'' +
                ", isFinish='" + isFinish + '\'' +
                ", checkFlag='" + checkFlag + '\'' +
                ", finalCheckFlag='" + finalCheckFlag + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

}
