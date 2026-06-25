package org.example.spring_data_jpa_querymethods.Exercise02.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "stock")
public class StockDetails {

    @Id
    @Column(name = "stock_id")
    private Integer stockId;

    private String code;

    private String name;

    @Column(name = "close_price")
    private Double closePrice;

    @Column(name = "open_price")
    private Double openPrice;

    private Long volume;

    private LocalDate date;

    public StockDetails() {
    }

    public StockDetails(Integer stockId, String code, String name,
                        Double closePrice, Double openPrice,
                        Long volume, LocalDate date) {
        this.stockId = stockId;
        this.code = code;
        this.name = name;
        this.closePrice = closePrice;
        this.openPrice = openPrice;
        this.volume = volume;
        this.date = date;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
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

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return stockId + " | " + code + " | " + name + " | "
                + closePrice + " | " + date;
    }
}