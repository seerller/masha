package com.masha.tools;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Administrator
 */
public class MessageBean {
    private int status;
    private String msg;
    private String token;
    private Object data;
    private Object user;

    private  JSONObject json;

    public MessageBean(int status, String msg, Object data, Object user) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.user = user;
    }

    public MessageBean(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public MessageBean(int status, String msg, Object data, String token, Object user) {
        this.status = status;
        this.msg = msg;
        this.token = token;
        this.data = data;
        this.user = user;
    }

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public MessageBean(int status, String msg, String token) {
        super();
        this.status = status;
        this.msg = msg;
        this.token = token;
    }

    public MessageBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MessageBean(Object data) {
        super();
        this.data = data;
    }

    public MessageBean(int status, String msg, Object data) {
        super();
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public MessageBean(int status, String msg, JSONObject json) {
        super();
        this.status = status;
        this.msg = msg;
        this.json = json;
    }

    public MessageBean(int status, String msg, String token, Object data) {
        super();
        this.status = status;
        this.msg = msg;
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public MessageBean setToken(String token) {
        this.token = token;
        return this;
    }

}

