package com.wyu.system.po;

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
@TableName("sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 角色名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 角色描述
     */
    @TableField("Description")
    private String Description;

    /**
     * 创建该角色的管理员Id
     */
    @TableField("AdminstratorId")
    private String AdminstratorId;

    /**
     * 该角色的创建时间
     */
    @TableField("CreationTime")
    private LocalDateTime CreationTime;


}
