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
@TableName("sys_chapter")
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 章节Id
     */
    @TableId("Id")
    private Integer Id;

    /**
     * 章节名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 章节描述
     */
    @TableField("Description")
    private String Description;

    /**
     * 所属课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;


}
