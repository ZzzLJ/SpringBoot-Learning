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
@TableName("sys_permissions")
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 权限(菜单)名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 权限url
     */
    private String url;

    /**
     * 权限描述
     */
    @TableField("Description")
    private String Description;

    /**
     * 创建该权限的管理员Id
     */
    @TableField("AdminstratorId")
    private String AdminstratorId;

    /**
     * 该权限的创建时间
     */
    @TableField("CreationTime")
    private LocalDateTime CreationTime;


}
