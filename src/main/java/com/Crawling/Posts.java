package com.Crawling;

public class Posts {
private String title;
private String price;
private String region;
private String counts;

// 생성자
public Posts(String title, String price, String region, String counts) {
    this.title = title;
    this.price = price;
    this.region = region;
    this.counts = counts;
}

// getter, setter 생략

// toString 메서드 재정의
@Override
public String toString() {
    return "게시물 제목: " + title +
            ", 가격: " + price +
            ", 위치: " + region +
            ", 조회수: " + counts;
}

// 게시물 제목 getter
public String getTitle() {
    return title;
}

// 가격 getter
public String getPrice() {
    return price;
}

// 위치 getter
public String getRegion() {
    return region;
}

// 조회수 getter
public String getCounts() {
    return counts;
}

}