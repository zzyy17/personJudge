package com.teacher.judge.demo.service;

import com.teacher.judge.demo.vo.TeacherCourseVo;

import java.util.List;

public interface UserCourseService {
    List<TeacherCourseVo> getTeacherByUserId(String userId);
}