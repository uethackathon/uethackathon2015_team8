package com.j4f.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hunter on 11/21/2015.
 */
public class Question {
    private ArrayList<Category> categoryList;
    private String id;
    private String userId;
    private String nameOfUser;
    private String userAvatarLink;
    private String title;
    private String content;
    private String imageLink;
    private Date timestamp;
    private int voteUp;
    private int voteDown;
    private int share;
    private ArrayList<Answer> answersList;
    private String[] tags;

    public Question(ArrayList<Category> categoryList, String id, String userId,
                    String nameOfUser, String userAvatarLink, String title,
                    String content, String imageLink, Date timestamp, int voteUp,
                    int voteDown, int share, ArrayList<Answer> answersList, String[] tags) {
        this.categoryList = categoryList;
        this.id = id;
        this.userId = userId;
        this.nameOfUser = nameOfUser;
        this.userAvatarLink = userAvatarLink;
        this.title = title;
        this.content = content;
        this.imageLink = imageLink;
        this.timestamp = timestamp;
        this.voteUp = voteUp;
        this.voteDown = voteDown;
        this.share = share;
        this.answersList = answersList;
        this.tags = tags;

    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getUserAvatarLink() {
        return userAvatarLink;
    }

    public void setUserAvatarLink(String userAvatarLink) {
        this.userAvatarLink = userAvatarLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(int voteUp) {
        this.voteUp = voteUp;
    }

    public int getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(int voteDown) {
        this.voteDown = voteDown;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public ArrayList<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(ArrayList<Answer> answersList) {
        this.answersList = answersList;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
