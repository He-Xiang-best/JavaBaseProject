package classType.infoType;
/*
 * @author:何翔
 * @date:2020/11/20 8:50
 * @description:班级类的信息
 /*

 */

public class ClassInfo {
    private int id= -1;
    private String name;
    private String info;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    @Override
    public String toString(){
        return this.name;
    }
}