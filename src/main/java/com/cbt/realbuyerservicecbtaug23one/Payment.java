package com.cbt.realbuyerservicecbtaug23one;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Column(name = "orderid", length = 10)
    private String orderid;

    @Column(name = "offerid", length = 10)
    private String offerid;

    @Column(name = "status", length = 10)
    private String status;

}