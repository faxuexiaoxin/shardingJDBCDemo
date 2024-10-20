package org.faxuexiaoxin.passworddemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 没有加密字段的User
 */
@TableName("user_no_password")
public class UserNoPassword {

    /**
     * 玩家id
     */
    @TableField("userId")
    private Long userid;

    /**
     * 玩家名称
     */
    @TableField("userName")
    private String userName;

    /**
     * 玩家密码 原文列
     */
    @TableField("userPassword")
    private String userPassword;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserNoPassword{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
