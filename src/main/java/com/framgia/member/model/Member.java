package com.framgia.member.model;

import java.util.Date;

public class Member implements java.io.Serializable {
    private long memberId;
    private String name;
    private String email;
    private Date createdDate;

    public Member() {
    }

    public Member(long memberId, String name, String email,
                    Date createdDate) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.createdDate = createdDate;
    }

    public long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
