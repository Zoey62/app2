package com.example.application3;

public class RecyclerViewItem {

    String name;
    String engName;
    String telNum;

    public RecyclerViewItem(String name, String engName, String telNum) {
        this.name = name;
        this.engName = engName;
        this.telNum = telNum;
    }

    public RecyclerViewItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
