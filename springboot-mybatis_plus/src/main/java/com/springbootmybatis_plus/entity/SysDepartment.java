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
public class SysDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 院系Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 院系名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 院系简介
     */
    @TableField("Description")
    private String Description;


}
