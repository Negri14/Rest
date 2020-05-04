package br.usp.dsid.consumerest;

import java.util.Arrays;

public class RegionalBloc {

	private String acronym;
	private String name;
	private String[] otherAcronyms;
	private String[] otherNames;
	
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getOtherAcronyms() {
		return otherAcronyms;
	}
	public void setOtherAcronyms(String[] otherAcronyms) {
		this.otherAcronyms = otherAcronyms;
	}
	public String[] getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String[] otherNames) {
		this.otherNames = otherNames;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegionalBloc [acronym=");
		builder.append(acronym);
		builder.append(", name=");
		builder.append(name);
		builder.append(", otherAcronyms=");
		builder.append(Arrays.toString(otherAcronyms));
		builder.append(", otherNames=");
		builder.append(Arrays.toString(otherNames));
		builder.append("]");
		return builder.toString();
	}
	
	
}
