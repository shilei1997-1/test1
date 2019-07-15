package com.ssm.pojo;

/**
 * 返回给页面数据
 */
public class ResultVo {
    private Integer  code;
    private String msg;//提示信息
    private Object obj;//数据
    //静态属性
    private static  final Integer SUCCESS_CODE=200;//成功状态码
    private static  final Integer ERROR_CODE=500;//失败状态码

    private ResultVo(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
    /**
     * 失败
     * @return
     */
    public static  ResultVo error(String msg){
        return new ResultVo(ERROR_CODE,msg,null);
    }
    /**
     * 失败
     * @return
     */
    public static  ResultVo error(){
        return new ResultVo(ERROR_CODE,"error",null);
    }
    /**
     * 成功
     * @return
     */
    public static  ResultVo success(Object obj){
        return new ResultVo(SUCCESS_CODE,"success",obj);
    }
    /**
     * 成功
     * @return
     */
    public static  ResultVo success(){
        return new ResultVo(SUCCESS_CODE,"success",null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }

    private ResultVo() {

    }
}
