package com.neusoft.pojo;

public class TeamshoppingGoods {
			private Integer id;
			private Integer  type;
			private Integer number;
			private Double money;
			private String state;
			private String introduce;
			private String picture;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public Integer getType() {
				return type;
			}
			public void setType(Integer type) {
				this.type = type;
			}
			public Integer getNumber() {
				return number;
			}
			public void setTsGoodsNumber(Integer number) {
				this.number = number;
			}
			public Double getMoney() {
				return money;
			}
			public void setTsGoodsMoney(Double money) {
				this.money = money;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getIntroduce() {
				return introduce;
			}
			public void setIntroduce(String introduce) {
				this.introduce = introduce;
			}
			
			public String getPicture() {
				return picture;
			}
			public void setPicture(String picture) {
				this.picture = picture;
			}
			public TeamshoppingGoods() {
				
			}
			public TeamshoppingGoods(Integer id, Integer type, Integer number, Double money, String state,
					String introduce, String picture) {
				super();
				this.id = id;
				this.type = type;
				this.number = number;
				this.money = money;
				this.state = state;
				this.introduce = introduce;
				this.picture = picture;
			}
			
			
}
