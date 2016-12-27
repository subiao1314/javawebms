package com.sub.javaweb.javabean;

//创建一个User类，方便存储学生信息
public class User {
    public User( String name, String clas, String course, String score) {
		super();
		this.name = name;
		this.clas = clas;
		this.course = course;
		this.score = score;
	}
    private int id;
	private String name;
    private String  clas;
    private String  course;
    private String  score;
	
    public int  getId() {
		return id;
	}
    public String getName() {
    	return name;
    }
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clas;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}


















}

/*	public static void main(String[] args) {
      
		ArrayList list=new ArrayList();
		Student st1=new Student("小王", "二年级", "语文", 80);
    	  list.add(st1);
    	  Student st2=new Student("小亮", "二年级", "语文", 85);
    	  list.add(st2);
    	  Student st3=new Student("小东", "二年级", "语文", 84);
    	  list.add(st3);
    	  Student st4=new Student("小强", "二年级", "语文", 90);
    	  list.add(st4);
    	  Student st5=new Student("小花", "二年级", "语文", 93);
    	  list.add(st5);
    	
	}*/


