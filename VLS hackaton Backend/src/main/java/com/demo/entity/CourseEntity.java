package com.demo.entity;


import javax.persistence.*;

@Entity
@Table(name  = "COURSE")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COURSE_ID")
    private int courseId;

    @Column(name = "COURSE_NAME", nullable = false)
    private String courseName;

    @Column(name = "AUTHOR_NAME", nullable = false)
    private String authorName;

    @Column (name = "DURATION", nullable = false)
    private int duration;

    @Column(name = "AVAILABILITY")
    private boolean availability;

    public CourseEntity() {}

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int id) {
        this.courseId = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", duration=" + duration +
                ", availability=" + availability +
                '}';
    }
}
