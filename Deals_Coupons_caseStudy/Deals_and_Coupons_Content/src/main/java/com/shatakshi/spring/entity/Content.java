package com.shatakshi.spring.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Health_and_Beauty")
public class Content {
	@Id
	private String id;
	private String title;
	private String merchant;
	private String categories;
	private String couponCode;
	private String url;
	private String startDate;
	private String endDate;
	private String imageUrl;
	
	
	public Content() {
		super();
	}
	
	public Content(String id, String title, String merchant, String categories, String couponCode, String url,
			String startDate, String endDate, String imageUrl) {
		super();
		this.id = id;
		this.title = title;
		this.merchant = merchant;
		this.categories = categories;
		this.couponCode = couponCode;
		this.url = url;
		this.startDate = startDate;
		this.endDate = endDate;
		this.imageUrl = imageUrl;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getcouponCode() {
		return couponCode;
	}
	public void setCoupon_Code(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	

}
