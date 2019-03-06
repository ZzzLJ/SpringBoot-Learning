package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sys_student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 学生学号
     */
    @TableField("Account")
    private String Account;

    /**
     * 学生名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 学生所在班级编号
     */
    @TableField("GradeAccount")
    private String GradeAccount;

    /**
     * 学生登录密码
     */
    @TableField("Password")
    private String Password;


}
