package com.wyu.test.po;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_student_course_exam")
public class StudentCourseExam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生学号
     */
    @TableField("StudentAccount")
    private String StudentAccount;

    /**
     * 所属课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;

    /**
     * 试卷Id
     */
    @TableField("ExamPaperId")
    private String ExamPaperId;

    /**
     * 学生开始考试时间
     */
    @TableField("StartTime")
    private LocalDateTime StartTime;

    /**
     * 学生结束考试时间
     */
    @TableField("EndTime")
    private LocalDateTime EndTime;

    /**
     * 学生考试状态状态（0：未考，1：已考，2：缺考）
     */
    @TableField("Status")
    private String Status;

    /**
     * 学生该门课程总分
     */
    @TableField("Score")
    private Integer Score;


}
