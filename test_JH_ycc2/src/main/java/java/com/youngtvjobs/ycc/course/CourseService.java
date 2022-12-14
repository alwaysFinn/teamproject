package com.youngtvjobs.ycc.course;

import java.util.List;
import java.util.Map;

public interface CourseService {
	
	List<CourseDto> getPage(Map map) throws Exception;

	int getsearchResultCnt(CourseSearchItem sc) throws Exception;
	List<CourseDto> getsearchResultPage(CourseSearchItem sc) throws Exception;

	CourseDto readCourseDetail(Integer course_id) throws Exception;

	double avgReviewRating(Integer course_id) throws Exception;

	int attendDuplicateCheck(Integer course_id, String user_id) throws Exception;

	int attendInsert(AttendDto attendDto) throws Exception;

	int readAttendTable(Integer course_id, String user_id) throws Exception;

	int courseWrite(CourseDto courseDto) throws Exception;

	int courseRemove(Integer course_id) throws Exception;

	int coursemodify(CourseDto courseDto) throws Exception;

}
