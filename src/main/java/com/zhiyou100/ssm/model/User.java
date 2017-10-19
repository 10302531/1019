package com.zhiyou100.ssm.model;

import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uPwd;

    private Integer uDepartmentid;

    private Integer uRoleid;

    private String uSex;

    private String uPhone;

    private String uAddress;

    private Integer uAge;

    private String uTelphone;

    private String uIdcard;

    private String uMail;

    private String uQq;

    private String uHobby;

    private String uEdu;

    private String uSalarycard;

    private String uNation;

    private String uMarry;

    private String uRemark;

    private Date uUpdatetime;

    private String uPic;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public Integer getuDepartmentid() {
        return uDepartmentid;
    }

    public void setuDepartmentid(Integer uDepartmentid) {
        this.uDepartmentid = uDepartmentid;
    }

    public Integer getuRoleid() {
        return uRoleid;
    }

    public void setuRoleid(Integer uRoleid) {
        this.uRoleid = uRoleid;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getuTelphone() {
        return uTelphone;
    }

    public void setuTelphone(String uTelphone) {
        this.uTelphone = uTelphone == null ? null : uTelphone.trim();
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail == null ? null : uMail.trim();
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq == null ? null : uQq.trim();
    }

    public String getuHobby() {
        return uHobby;
    }

    public void setuHobby(String uHobby) {
        this.uHobby = uHobby == null ? null : uHobby.trim();
    }

    public String getuEdu() {
        return uEdu;
    }

    public void setuEdu(String uEdu) {
        this.uEdu = uEdu == null ? null : uEdu.trim();
    }

    public String getuSalarycard() {
        return uSalarycard;
    }

    public void setuSalarycard(String uSalarycard) {
        this.uSalarycard = uSalarycard == null ? null : uSalarycard.trim();
    }

    public String getuNation() {
        return uNation;
    }

    public void setuNation(String uNation) {
        this.uNation = uNation == null ? null : uNation.trim();
    }

    public String getuMarry() {
        return uMarry;
    }

    public void setuMarry(String uMarry) {
        this.uMarry = uMarry == null ? null : uMarry.trim();
    }

    public String getuRemark() {
        return uRemark;
    }

    public void setuRemark(String uRemark) {
        this.uRemark = uRemark == null ? null : uRemark.trim();
    }

    public Date getuUpdatetime() {
        return uUpdatetime;
    }

    public void setuUpdatetime(Date uUpdatetime) {
        this.uUpdatetime = uUpdatetime;
    }

    public String getuPic() {
        return uPic;
    }

    public void setuPic(String uPic) {
        this.uPic = uPic == null ? null : uPic.trim();
    }
}