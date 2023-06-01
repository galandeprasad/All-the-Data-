package PojoClasss;

public class getCourse 
{
	private String url;
	private String service;
	private String experties;
	private subCourse courses;
	private String instructors;
	private String LinkedIn;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getExperties() {
		return experties;
	}
	public void setExperties(String experties) {
		this.experties = experties;
	}
	public subCourse getCourses() {
		return courses;
	}
	public subCourse setCourses(subCourse courses) {
		return this.courses = courses;
	}
	public String getInstructors() {
		return instructors;
	}
	public void setInstructors(String instructors) {
		this.instructors = instructors;
	}
	public String getLinkedIn() {
		return LinkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		LinkedIn = linkedIn;
	}
	
	

	
}
