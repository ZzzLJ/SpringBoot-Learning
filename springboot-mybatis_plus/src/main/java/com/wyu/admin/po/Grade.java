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
@TableName("sys_grade")
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级编号
     */
    @TableId("Account")
    private String Account;

    /**
     * 班级名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 专业名称
     */
    @TableField("Major")
    private String Major;

    /**
     * 班级简介
     */
    @TableField("Description")
    private String Description;

    /**
     * 所在院系
     */
    @TableField("DepartmentId")
    private String DepartmentId;


}
