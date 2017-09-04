package com.bill.jichunge;

/**
 * Created by bill on 8/23/17.
 */

//this is the data class
public class Item {

    //generate getters and setters
    int image;
    String title;
    String motto;

    public Item(int image, String title, String motto) {
        this.image = image;
        this.title = title;
        this.motto = motto;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}

