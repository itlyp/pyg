package entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * <p>Description: 执行结果封装实体 </p>
 * <p>User: 李元璞</P>
 * <p>Date: 2018-02-06</p>
 * <p>Time: 14:27</p>
 */
public class Result implements Serializable{
    private  boolean success;
    private  String message;
    public Result(boolean success,String message){
        super();
        this.success=success;
        this.message=message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
