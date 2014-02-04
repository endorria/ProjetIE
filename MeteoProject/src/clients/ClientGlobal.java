package clients;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import marshallWeather.CurrentWeather;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class ClientGlobal {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		System.out.println("Start interroggation ");
		GlobalWeather s = new GlobalWeather();
		GlobalWeatherSoap port =  s.getGlobalWeatherSoap();
		
		
		JAXBContext context = JAXBContext.newInstance("marshallWeather");
		
		Unmarshaller u = context.createUnmarshaller();
		StringReader stream = new StringReader(port.getWeather("Madrid", "Spain"));
		
		Object o = u.unmarshal(stream);
		CurrentWeather cw = (CurrentWeather) o;
		
		System.out.println(cw.getPressure());
	}
}
