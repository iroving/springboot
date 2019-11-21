package hip.cda.hipcda.common;

/**
 *
 */
public enum Error {

    EXCEPTION("500", "系统内部异常"),
    CONTROLLER_EXCEPTION("510", "请求异常"),
    VALIDATION_EXCEPTION("600", "参数验证异常："),
    REPEAT_EXCEPTION("610","此数据不能重复添加"),
    DB_EXCEPTION("611", "操作数据库异常"),
    DBEXSIT_EXCEPTION("612", "数据异常");

    private String code;
    private String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
