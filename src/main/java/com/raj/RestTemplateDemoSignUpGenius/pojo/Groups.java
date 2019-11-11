package com.raj.RestTemplateDemoSignUpGenius.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Groups {
	
	 @SerializedName("groupid")
	 @Expose
	 private float groupid;
	 
	 @SerializedName("title")
	 @Expose
	 private String title;
	 
	 @SerializedName("count")
	 @Expose
	 private float count;


	 // Getter Methods 

	 public float getGroupid() {
	  return groupid;
	 }

	 public String getTitle() {
	  return title;
	 }

	 public float getCount() {
	  return count;
	 }

	 // Setter Methods 

	 public void setGroupid(float groupid) {
	  this.groupid = groupid;
	 }

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setCount(float count) {
	  this.count = count;
	 }

}
