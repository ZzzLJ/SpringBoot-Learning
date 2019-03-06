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
@TableName("sys_knows")
public class Knows implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 知识点Id
     */
    @TableId("Id")
    private Integer Id;

    /**
     * 知识点名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 知识点描述
     */
    @TableField("Description")
    private String Description;

    /**
     * 所属章
     */
    @TableField("ChapterId")
    private Integer ChapterId;


}
