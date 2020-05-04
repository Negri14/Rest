package br.usp.dsid.consumerest;

public class JsonPlaceHolder {
		
	private Integer id;
	private String title;
	private String body;
	private Integer userId;
	
    private JsonPlaceHolder() {
        super();
    }
    
	private JsonPlaceHolder(Builder builder) {
		this.id = builder.id;
		this.title = builder.title;
		this.body = builder.body;
		this.userId = builder.userId;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public static Builder builder( ) {
		return new Builder();
	}

	

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("JsonPlaceHolder [id=");
		builder2.append(id);
		builder2.append(", title=");
		builder2.append(title);
		builder2.append(", body=");
		builder2.append(body);
		builder2.append(", userId=");
		builder2.append(userId);
		builder2.append("]");
		return builder2.toString();
	}



	public static class Builder {
		
		private Integer id;
		private String title;
		private String body;
		private Integer userId;	
		
		public Builder id(Integer id) {
			this.id = id;
			return this;
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder body(String body) {
			this.body = body;
			return this;
		}
		
		public Builder userId(Integer userId) {
			this.userId = userId;
			return this;
		}
		
		public JsonPlaceHolder build() {
			return new JsonPlaceHolder(this);
		}
		
	}
}
