package com.imooc.bilibili.domain;

import java.util.Date;
import java.util.List;

public class FollowingGroup {

    private Long id;
    private Long userId;
    private String name;
    private String type;
    private Date createTime;
    private Date upadateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpadateTime() {
        return upadateTime;
    }

    public void setUpadateTime(Date upadateTime) {
        this.upadateTime = upadateTime;
    }

    public List<UserInfo> getFollowingUserInfoList() {
        return followingUserInfoList;
    }

    public void setFollowingUserInfoList(List<UserInfo> followingUserInfoList) {
        this.followingUserInfoList = followingUserInfoList;
    }

    private List<UserInfo>  followingUserInfoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
