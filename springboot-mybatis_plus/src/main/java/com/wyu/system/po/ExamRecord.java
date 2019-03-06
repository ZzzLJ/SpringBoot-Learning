package com.wyu.system.po;

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
@TableName("sys_exam_record")
public class ExamRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 试卷Id
     */
    @TableField("ExamPaperId")
    private String ExamPaperId;

    /**
     * 学生学号
     */
    @TableField("StudentAccount")
    private String StudentAccount;

    /**
     * 题目Id
     */
    @TableField("QuestionId")
    private Integer QuestionId;

    /**
     * 学生答题记录
     */
    @TableField("Record")
    private String Record;


}
