package clients;

import javax.xml.bind.JAXBException;

import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapImpl;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;
import org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType_CountryInfoServiceSoap_Client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class ClientCountry {
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		System.out.println("Start interroggation ");
		CountryInfoService ci = new CountryInfoService();
		
		CountryInfoServiceSoapType port = ci.getCountryInfoServiceSoap();
		
		
		System.out.println(port.capitalCity("FR"));
		System.out.println(port.countryISOCode("Spain"));
		System.out.println(port.capitalCity("ES"));
	}
}
