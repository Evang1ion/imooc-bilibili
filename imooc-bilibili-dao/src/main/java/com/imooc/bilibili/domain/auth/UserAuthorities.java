package com.imooc.bilibili.domain.auth;

import java.util.List;

public class UserAuthorities {

    List<AuthRoleElementOperation> authRoleElementOperationList;
    List<AuthRoleMenu> roleMenuList;

    public List<AuthRoleElementOperation> getAuthRoleElementOperationList() {
        return authRoleElementOperationList;
    }

    public void setRoleElementOperationList(List<AuthRoleElementOperation> roleElementOperationList) {
        this.authRoleElementOperationList = roleElementOperationList;
    }

    public List<AuthRoleMenu> getRoleMenuList() {
        return roleMenuList;
    }

    public void setRoleMenuList(List<AuthRoleMenu> roleMenuList) {
        this.roleMenuList = roleMenuList;
    }
}
