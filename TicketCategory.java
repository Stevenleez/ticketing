package com.pancabudi.ticketing.category;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Data
@Table(name = "m_ticket_category")
@EntityListeners(AuditingEntityListener.class)
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private boolean disable = false;

    @CreatedDate
    @Column(updatable = false, columnDefinition = "timestamp default current_timestamp")
    private Instant created_date;

    @LastModifiedDate
    @Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Instant updated_date;

}
