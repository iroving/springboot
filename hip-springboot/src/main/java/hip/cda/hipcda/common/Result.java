package hip.cda.hipcda.common;

import com.alibaba.druid.support.json.JSONUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */

public class Result implements Serializable {

    private final static String SUCCESS_CODE = "200";
    private final static String SUCCESS_MESSAGE = "success";
    private Meta meta;
    private Map<String, Object> data = new HashMap<>();

    private Result() {
    }

    public static Result success() {
        Result result = new Result();
        result.setMeta(new Meta(SUCCESS_CODE, SUCCESS_MESSAGE));
        return result;
    }

    public static Result failure() {
        Result result = new Result();
        result.setMeta(new Meta(Error.EXCEPTION.getCode(), Error.EXCEPTION.getMessage()));
        return result;
    }

    public static Result failure(Error error) {
        Result result = new Result();
        result.setMeta(new Meta(error.getCode(), error.getMessage()));
        return result;
    }

    public static Result failure(String code, String message) {
        Result result = new Result();
        result.setMeta(new Meta(code, message));
        return result;
    }

    public Result addValue(String key, Object value) {
        data.put(key, value);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    private void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Map<String, Object> getData() {
        return data;
    }

    private static class Meta implements Serializable{

        private String statusCode;

        private String message;

        Meta(String statusCode, String message) {
            this.statusCode = statusCode;
            this.message = message;
        }

        public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public String toJson() {
        return JSONUtils.toJSONString(this);
    }
}

