package com.springbootmybatis_plus.entity;

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
public class SysGrade implements Serializable {

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
