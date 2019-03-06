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
@TableName("sys_adminstrator")
public class Adminstrator implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员（教师）Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 管理员账号
     */
    @TableField("Account")
    private String Account;

    /**
     * 管理员名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 管理员密码
     */
    @TableField("Password")
    private String Password;

    /**
     * 角色ID
     */
    @TableField("RoleId")
    private String RoleId;

    /**
     * 院系ID
     */
    @TableField("DepartmentId")
    private String DepartmentId;


}
