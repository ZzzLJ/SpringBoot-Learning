package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_role_permissions")
public class RolePermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色Id
     */
    @TableField("RoleId")
    private String RoleId;

    /**
     * 权限Id
     */
    @TableField("PermissionsId")
    private String PermissionsId;


}
