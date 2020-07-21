package com.bryce.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UsersRoles extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long roleId;



}
