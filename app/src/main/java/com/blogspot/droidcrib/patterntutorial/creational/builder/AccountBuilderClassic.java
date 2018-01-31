package com.blogspot.droidcrib.patterntutorial.creational.builder;

/**
 * Created  on 31.01.2018.
 */

public class AccountBuilderClassic {

    private final String userId;
    private final String token;

    public AccountBuilderClassic(String userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static class Builder{

        private String userId;
        private String token;

        public Builder setUserId(String userId){
            this.userId = userId;
            return this;
        }

        public Builder setToken(String token){
            this.token = token;
            return this;
        }

        public AccountBuilderClassic build(){
            return new AccountBuilderClassic(userId, token);
        }
    }

    @Override
    public String toString() {
        return "AccountBuilderClassic{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
