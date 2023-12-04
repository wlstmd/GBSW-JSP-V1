package com.Crawling2;

public class Posts2 {
private String title;
private String price;
private String region;

// 생성자
public Posts2(String title, String price, String region) {
    this.title = title;
    this.price = price;
    this.region = region;
}

// getter, setter 생략

// toString 메서드 재정의
@Override
public String toString() {
    return "게시물 제목: " + title +
            ", 가격: " + price +
            ", 위치: " + region;
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


}