package com.zhiyou100.ssm.model;

import java.util.Date;

public class Role {
    private Integer rId;

    private String rName;

    private String rDesc;

    private Date rUpdatetime;

    private String rPic;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc == null ? null : rDesc.trim();
    }

    public Date getrUpdatetime() {
        return rUpdatetime;
    }

    public void setrUpdatetime(Date rUpdatetime) {
        this.rUpdatetime = rUpdatetime;
    }

    public String getrPic() {
        return rPic;
    }

    public void setrPic(String rPic) {
        this.rPic = rPic == null ? null : rPic.trim();
    }
}