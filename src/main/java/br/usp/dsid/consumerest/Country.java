package br.usp.dsid.consumerest;

import java.util.Arrays;

public class Country {

    private String name;
    private String[] topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private String[] callingCodes;
    private String capital;
    private String[] altSpellings;
    private String region;
    private String subregion;
    private long population;
    private long[] latlng;
    private String demonym;
    private long area;
    private long gini;
    private String[] timezones;
    private String[] borders;
    private String nativeName;
    private int numericCode;
    private Currency[] currencies;
    private Language[] languages;
    private Translation translations;
    private String flag;
    private RegionalBloc[] regionalBlocs;
    
    private Country() {
    	super();
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(String[] topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public String[] getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(String[] callingCodes) {
		this.callingCodes = callingCodes;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String[] getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long[] getLatlng() {
		return latlng;
	}
	public void setLatlng(long[] latlng) {
		this.latlng = latlng;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public long getGini() {
		return gini;
	}
	public void setGini(long gini) {
		this.gini = gini;
	}
	public String[] getTimezones() {
		return timezones;
	}
	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}
	public String[] getBorders() {
		return borders;
	}
	public void setBorders(String[] borders) {
		this.borders = borders;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public int getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(int numericCode) {
		this.numericCode = numericCode;
	}
	public Currency[] getCurrencies() {
		return currencies;
	}
	public void setCurrencies(Currency[] currencies) {
		this.currencies = currencies;
	}
	public Language[] getLanguages() {
		return languages;
	}
	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}
	public Translation getTranslations() {
		return translations;
	}
	public void setTranslations(Translation translations) {
		this.translations = translations;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public RegionalBloc[] getRegionalBlocs() {
		return regionalBlocs;
	}
	public void setRegionalBlocs(RegionalBloc[] regionalBlocs) {
		this.regionalBlocs = regionalBlocs;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [name=");
		builder.append(name);
		builder.append(", topLevelDomain=");
		builder.append(Arrays.toString(topLevelDomain));
		builder.append(", alpha2Code=");
		builder.append(alpha2Code);
		builder.append(", alpha3Code=");
		builder.append(alpha3Code);
		builder.append(", callingCodes=");
		builder.append(Arrays.toString(callingCodes));
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", altSpellings=");
		builder.append(Arrays.toString(altSpellings));
		builder.append(", region=");
		builder.append(region);
		builder.append(", subregion=");
		builder.append(subregion);
		builder.append(", population=");
		builder.append(population);
		builder.append(", latlng=");
		builder.append(Arrays.toString(latlng));
		builder.append(", demonym=");
		builder.append(demonym);
		builder.append(", area=");
		builder.append(area);
		builder.append(", gini=");
		builder.append(gini);
		builder.append(", timezones=");
		builder.append(Arrays.toString(timezones));
		builder.append(", borders=");
		builder.append(Arrays.toString(borders));
		builder.append(", nativeName=");
		builder.append(nativeName);
		builder.append(", numericCode=");
		builder.append(numericCode);
		builder.append(", currencies=");
		builder.append(Arrays.toString(currencies));
		builder.append(", languages=");
		builder.append(Arrays.toString(languages));
		builder.append(", translations=");
		builder.append(translations);
		builder.append(", flag=");
		builder.append(flag);
		builder.append(", regionalBlocs=");
		builder.append(Arrays.toString(regionalBlocs));
		builder.append("]");
		return builder.toString();
	}

	
	
    
    
}
