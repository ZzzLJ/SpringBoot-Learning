package com.wyu.test.po;

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
@TableName("sys_announcement")
public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备忘录Id
     */
    @TableId("Id")
    private Integer Id;

    /**
     * 公告内容
     */
    @TableField("Content")
    private String Content;

    /**
     * 所属课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;

    /**
     * 发布考试教师Id
     */
    @TableField("AdminstratorId")
    private String AdminstratorId;

    /**
     * 状态，0：不可用，1：可用，删除后状态标记为0
     */
    @TableField("Status")
    private String Status;


}
