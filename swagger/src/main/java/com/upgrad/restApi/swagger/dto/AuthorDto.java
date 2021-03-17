package com.upgrad.restApi.swagger.dto;

public class AuthorDto {

    private Long authId;

    private String authName;

    public AuthorDto(Long authId, String authName) {
        this.authId = authId;
        this.authName = authName;
    }

    public AuthorDto() {
    }

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
