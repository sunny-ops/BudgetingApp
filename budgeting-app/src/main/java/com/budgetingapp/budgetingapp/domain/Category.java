package com.budgetingapp.budgetingapp.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Category {
    private Long id;
    private BigDecimal budget;
    private String name;
    private Date startDate;
    private Date endDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

}
