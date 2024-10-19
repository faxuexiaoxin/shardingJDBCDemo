package org.faxuexiaoxin.simpledemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {

    /**
     * 玩家id
     */
//    @TableId(value = "userId",type= IdType.AUTO)

    @TableField("userId")
    private Integer userId;

    /**
     * 玩家名称
     */
    @TableField("userName")
    private String userName;

    /**
     * 玩家密码
     */
    @TableField("userPassword")
    private String userPassword;

    /**
     * 玩家加密后的密码
     */
    @TableField("userPassword_")
    private String userPassword_;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getUserPassword_() {
        return userPassword_;
    }

    public void setUserPassword_(String userPassword_) {
        this.userPassword_ = userPassword_;
    }
}
