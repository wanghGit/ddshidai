package com.ddshidai.model;

public class Problem_free_image {
    private Integer id;

    private Integer problemFreeId;

    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProblemFreeId() {
        return problemFreeId;
    }

    public void setProblemFreeId(Integer problemFreeId) {
        this.problemFreeId = problemFreeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}