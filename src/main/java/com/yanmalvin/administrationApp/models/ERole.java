package com.yanmalvin.administrationApp.models;


/*
* We’re gonna have 3 tables in database: users, roles and user_roles for many-to-many relationship.
*
* */
public enum ERole {
    ROLE_USER,
    ROLE_MODERATOR,
    ROLE_ADMIN
}
