package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author ZzzLJ
 * @Description
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_login_record")
public class LoginRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会话Id
     */
    @TableId("SessionId")
    private String SessionId;

    /**
     * 管理员账号或学生学号
     */
    @TableField("Account")
    private String Account;

    /**
     * 管理员或学生名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 登陆IP地址
     */
    @TableField("IPAddress")
    private String IPAddress;

    /**
     * 地理位置
     */
    @TableField("Location")
    private String Location;

    /**
     * 浏览器类型
     */
    @TableField("Browser")
    private String Browser;

    /**
     * 操作系统
     */
    @TableField("OS")
    private String os;

    /**
     * 登陆时间
     */
    @TableField("LoginTime")
    private LocalDateTime LoginTime;

    /**
     * 最后访问时间
     */
    @TableField("LastAccessTime")
    private LocalDateTime LastAccessTime;


}
