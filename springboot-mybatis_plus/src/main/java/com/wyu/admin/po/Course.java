package com.wyu.admin.po;

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
@TableName("sys_course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程代号
     */
    @TableId("Account")
    private String Account;

    /**
     * 课程名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 课程类型，0表示必修课，1表示选修课
     */
    @TableField("Type")
    private String Type;

    /**
     * 课程简介
     */
    @TableField("Description")
    private String Description;

    /**
     * 任课教师Id
     */
    @TableField("AdminstratorId")
    private String AdminstratorId;


}
