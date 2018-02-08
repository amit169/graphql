package com.hackernews;

import org.springframework.data.annotation.Id;

public class Link {

    @Id private String id;

     private  String url;
     private  String description;
     private  String userId;

    public String getUrl(){
      return url;
    }

    public void setUrl(String url){
      this.url = url;
    }

    public String getDescription(){
      return description;
    }

    public void setDescription(String description){
      this.description = description;
    }

    public String getUserId(){
      return userId;
    }

    public void setUserId(String userId){
      this.userId = userId; 
    }

}
