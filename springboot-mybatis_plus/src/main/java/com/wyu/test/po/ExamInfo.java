package com.wyu.test.po;

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
@TableName("sys_exam_info")
public class ExamInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考场Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 考试名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 考场地点
     */
    @TableField("Address")
    private String Address;

    /**
     * 考试开始时间
     */
    @TableField("StartTime")
    private LocalDateTime StartTime;

    /**
     * 考试结束时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 考试备注
     */
    @TableField("Remark")
    private String Remark;

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


}
