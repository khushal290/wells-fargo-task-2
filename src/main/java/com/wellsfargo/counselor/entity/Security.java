package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "purchase_date")
    private String purchaseDate;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    public Security(String name, String category, String purchaseDate,
                    Double purchasePrice, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Security() {}

    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getPurchaseDate() { return purchaseDate; }
    public Double getPurchasePrice() { return purchasePrice; }
    public Integer getQuantity() { return quantity; }
    public Portfolio getPortfolio() { return portfolio; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
