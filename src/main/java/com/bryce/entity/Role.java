package com.bryce.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author bryce
 * @since 2020-07-21
 */
@Data
@Accessors(chain = true)
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String role;

    private String description;

    /**
     * 父节点
     */
    private Integer pid;

    private String available;

}
