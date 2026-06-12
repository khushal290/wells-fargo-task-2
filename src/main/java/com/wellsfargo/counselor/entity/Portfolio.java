package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(name = "portfolio_name")
    private String portfolioName;

    @Column(name = "created_date")
    private String createdDate;

    @Column(name = "total_value")
    private Double totalValue;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    public Portfolio(String portfolioName, String createdDate,
                     Double totalValue, Client client) {
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.totalValue = totalValue;
        this.client = client;
    }

    public Portfolio() {}

    public Long getPortfolioId() { return portfolioId; }
    public String getPortfolioName() { return portfolioName; }
    public String getCreatedDate() { return createdDate; }
    public Double getTotalValue() { return totalValue; }
    public Client getClient() { return client; }
    public List<Security> getSecurities() { return securities; }

    public void setPortfolioName(String portfolioName) { this.portfolioName = portfolioName; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
    public void setTotalValue(Double totalValue) { this.totalValue = totalValue; }
    public void setClient(Client client) { this.client = client; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}