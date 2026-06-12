package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "financial_advisor")
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "employee_id")
    private String employeeId;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public FinancialAdvisor(String firstName, String lastName, String email,
                            String phone, String employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.employeeId = employeeId;
    }

    public FinancialAdvisor() {}

    public Long getAdvisorId() { return advisorId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getEmployeeId() { return employeeId; }
    public List<Client> getClients() { return clients; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}