package br.usp.dsid.consumerest;

public class Currency {
	
	private String code;
	private String name;
	private String symbol;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Currency [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append("]");
		return builder.toString();
	}
	
	



}


