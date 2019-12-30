package com.in.microservices.currencyconvertservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {


    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMutiple;
    private BigDecimal quantity;
    private BigDecimal toatlCalcilatedAmount;
    private int port;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMutiple, BigDecimal quantity, BigDecimal toatlCalcilatedAmount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMutiple = conversionMutiple;
        this.quantity = quantity;
        this.toatlCalcilatedAmount = toatlCalcilatedAmount;
        this.port = port;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMutiple() {
        return conversionMutiple;
    }

    public void setConversionMutiple(BigDecimal conversionMutiple) {
        this.conversionMutiple = conversionMutiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getToatlCalcilatedAmount() {
        return toatlCalcilatedAmount;
    }

    public void setToatlCalcilatedAmount(BigDecimal toatlCalcilatedAmount) {
        this.toatlCalcilatedAmount = toatlCalcilatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
