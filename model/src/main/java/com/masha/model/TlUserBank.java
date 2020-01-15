package com.masha.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TlUserBank implements Serializable {
    private Integer id;

    private Integer userId;

    private String title;

    private String bankCark;

    private String truename;

    private String shenfenzheng;

    private String phone;

    private String bankName;

    private String img;

    @ApiModelProperty(value = "//是否为默认很行卡   1默认  0非默认")
    private Byte isDefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBankCark() {
        return bankCark;
    }

    public void setBankCark(String bankCark) {
        this.bankCark = bankCark;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", title=").append(title);
        sb.append(", bankCark=").append(bankCark);
        sb.append(", truename=").append(truename);
        sb.append(", shenfenzheng=").append(shenfenzheng);
        sb.append(", phone=").append(phone);
        sb.append(", bankName=").append(bankName);
        sb.append(", img=").append(img);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}