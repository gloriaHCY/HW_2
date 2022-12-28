package org.example;

public class Sight implements java.io.Serializable {
    private String sightName; // 景點名稱
    private String zone; //區
    private String category; //景點類別
    private String photoURL; //
    private String description; //描述
    private String address; //地址
    private String googleMap; //

    public Sight(String sightName,
                 String zone,
                 String category,
                 String photoURL,
                 String description,
                 String address,
                 String googleMap) {
        this.sightName = sightName;
        this.zone = zone;
        this.category = category;
        this.photoURL = photoURL;
        this.description = description;
        this.address = address;
        this.googleMap = googleMap;
    }

    @Override
    public String toString() {
        return "SightName:" + sightName +
                "Zone:" + zone +
                "Category:" + category +
                "PhotoURL:" + photoURL +
                "Description:" + description +
                "Address:" + address +
                "GoogleMap:" + googleMap;
    }
}