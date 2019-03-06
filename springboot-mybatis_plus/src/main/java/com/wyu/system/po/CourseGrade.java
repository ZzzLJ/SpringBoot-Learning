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
@TableName("sys_course_grade")
public class CourseGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程代号
     */
    @TableField("CourseAccount")
    private String CourseAccount;

    /**
     * 班级编号
     */
    @TableField("GradeAccount")
    private String GradeAccount;


}
