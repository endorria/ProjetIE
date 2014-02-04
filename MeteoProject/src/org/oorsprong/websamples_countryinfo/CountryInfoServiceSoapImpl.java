package org.oorsprong.websamples_countryinfo;

import javax.jws.WebService;

import org.oorsprong.websamples.ArrayOftContinent;
import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.ArrayOftCountryCodeAndNameGroupedByContinent;
import org.oorsprong.websamples.ArrayOftCountryInfo;
import org.oorsprong.websamples.ArrayOftCurrency;
import org.oorsprong.websamples.ArrayOftLanguage;
import org.oorsprong.websamples.TCountryInfo;
import org.oorsprong.websamples.TCurrency;

@WebService
public class CountryInfoServiceSoapImpl implements CountryInfoServiceSoapType{

	@Override
	public ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countryFlag(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCountryCodeAndName listOfCountryNamesByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countryName(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String languageISOCode(String sLanguageName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TCurrency countryCurrency(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String currencyName(String sCurrencyISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftLanguage listOfLanguagesByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCountryInfo fullCountryInfoAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCountryCodeAndName listOfCountryNamesByCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCurrency listOfCurrenciesByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TCountryInfo fullCountryInfo(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftContinent listOfContinentsByCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCurrency listOfCurrenciesByCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String languageName(String sISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countryISOCode(String sCountryName) {
		// TODO Auto-generated method stub
		String str = this.capitalCity(sCountryName);
		return str;
	}

	@Override
	public ArrayOftContinent listOfContinentsByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countryIntPhoneCode(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftLanguage listOfLanguagesByCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOftCountryCodeAndName countriesUsingCurrency(
			String sISOCurrencyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String capitalCity(String sCountryISOCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
