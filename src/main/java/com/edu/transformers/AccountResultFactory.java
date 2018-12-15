package com.edu.transformers;

import org.springframework.integration.xml.result.ResultFactory;

import javax.xml.transform.Result;

public class AccountResultFactory implements ResultFactory {


    @Override
    public Result createResult(Object payload) {
        return new AccountResult(payload.toString());
    }


    private static class AccountResult implements Result {

        private String systemId;

        public AccountResult(String systemId) {
            this.systemId = systemId;
        }

        @Override
        public void setSystemId(String systemId) {
            this.systemId = systemId;
        }

        @Override
        public String getSystemId() {
            return systemId;
        }
    }


}
