package com.pancabudi.ticketing.category;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Data
@Table(name = "m_ticket_category")  // Ensure table name matches DB schema
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private boolean disable;

    @CreatedDate
    @Column(updatable = false, columnDefinition = "timestamp default current_timestamp")
    private Date createdDate;

    @LastModifiedDate
    @Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Date updatedDate;

    public void setId(Long id) {
        this.id = id;
    }
}

