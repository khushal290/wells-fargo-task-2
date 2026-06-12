package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client(String firstName, String lastName, String email,
                  String phone, String dateOfBirth, FinancialAdvisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.advisor = advisor;
    }

    public Client() {}

    public Long getClientId() { return clientId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDateOfBirth() { return dateOfBirth; }
    public FinancialAdvisor getAdvisor() { return advisor; }
    public Portfolio getPortfolio() { return portfolio; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}