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
@TableName("sys_questions")
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 题目Id
     */
    @TableId("Id")
    private Integer Id;

    /**
     * 题目题干
     */
    @TableField("Content")
    private String Content;

    /**
     * 题目类型
     */
    @TableField("QuestionType")
    private String QuestionType;

    /**
     * 题目创建时间
     */
    @TableField("CreationTime")
    private LocalDateTime CreationTime;

    /**
     * 题目所属课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;

    /**
     * 出题教师Id
     */
    @TableField("AdminstratorId")
    private String AdminstratorId;

    /**
     * 参考答案
     */
    @TableField("Answer")
    private String Answer;

    /**
     * 题目是否可用状态（0：不可用，1：可用）
     */
    @TableField("Status")
    private String Status;


}
