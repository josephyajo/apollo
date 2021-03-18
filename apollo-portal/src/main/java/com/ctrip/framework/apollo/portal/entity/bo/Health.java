package com.ctrip.framework.apollo.portal.entity.bo;

import java.util.Map;

/**
 * @Author Joseph
 * @Created 2021/3/18 15:18
 */
public class Health {

    private Status status;

    private Map<String, Object> details;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public void setDetails(Map<String, Object> details) {
        this.details = details;
    }

    public class Status {

        private String code;

        private String description;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
