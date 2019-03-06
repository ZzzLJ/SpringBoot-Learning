package com.wyu.admin.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("sys_exam_paper")
public class ExamPaper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试卷Id
     */
    @TableId("Id")
    private String Id;

    /**
     * 试卷名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 试卷发布时间
     */
    @TableField("Time")
    private LocalDate Time;

    /**
     * 所属课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;


}
