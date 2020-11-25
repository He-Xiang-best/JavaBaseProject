package classType.infoType;
/*
 * @author:何翔
 * @date:2020/11/20 8:52
 * @description:班级成绩统计类信息
 /*
 
 */

public class ClassScore {
    private int classId;
    private int goodNum;
    private int badNum;
    private int allNum;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public int getBadNum() {
        return badNum;
    }

    public void setBadNum(int badNum) {
        this.badNum = badNum;
    }

    public int getAllNum() {
        return allNum;
    }

    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }
}
