package com.mybatis_plus.generator.entity;

import com.mybatis_plus.generator.common.BaseEntity;
/*import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;*/

/*@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)*/
public class Users extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;


}
