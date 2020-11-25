package classType.infoType;
/*
 * @author:何翔
 * @date:2020/11/20 8:53
 * @description:课程类信息
 /*
 
 */

public class Course {
    private int course_id = -1;
    private String course_name;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
