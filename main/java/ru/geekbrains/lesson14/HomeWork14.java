package ru.geekbrains.lesson14;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ru.geekbrains.lesson14.dto.DailyForecast;
import ru.geekbrains.lesson14.dto.WeatherResponse;
import ru.geekbrains.lesson14.repository.WeatherForecastRepository;

import java.io.IOException;
import java.sql.SQLException;

public class HomeWork14 {
    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String FIVE_DAYS_URL = "5day";
    public static final String API_VERSION = "v1";
//    CITY_ID = "2953504" equal Baden-Baden,01,DE,Germany https://www.weatherbit.io/api/meta;
    public static final String CITY_ID = "295350";
    public static final String API_KEY = "AI8Rib56ETHQbtI2PHaupiqsFR21A2ru";
    public static final String LANGUAGE = "ru-ru";
    public static final String METRIC = "true";

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST_URL)
                .addPathSegment(API_VERSION)
                .addPathSegment(DAILY_URL)
                .addPathSegment(FIVE_DAYS_URL)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("metric", METRIC)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse weatherResponse = objectMapper.readValue(response.body().byteStream(), WeatherResponse.class);
        WeatherForecastRepository repository = new WeatherForecastRepository();

        for (DailyForecast forecast : weatherResponse.getDailyForecasts()) {
            System.out.printf(
                    "Погода в Баден-Баден на %s\n" +
                    "%s, температура от %.1f до %.1f %s\n\n",
                    forecast.getDate(),
                    forecast.getDay().getIconPhrase(),
                    forecast.getTemperature().getMinimum().getValue(),
                    forecast.getTemperature().getMaximum().getValue(),
                    forecast.getTemperature().getMinimum().getUnit());
            repository.save(
                    CITY_ID, forecast.getDate(),
                    forecast.getDay().getIconPhrase(),
                    forecast.getTemperature().getMaximum().getValue()
            );
        }
        repository.read();
    }
}

/*
 {
	"Headline": {
		"EffectiveDate": "2021-08-31T01:00:00+03:00",
		"EffectiveEpochDate": 1630360800,
		"Severity": 2,
		"Text": "Понедельник, поздняя ночь - Вторник, поздняя ночь: дождь и грозы",
		"Category": "thunderstorm",
		"EndDate": "2021-09-01T07:00:00+03:00",
		"EndEpochDate": 1630468800,
		"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?unit=c",
		"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?unit=c"
	},
	"DailyForecasts": [
		{
			"Date": "2021-08-27T07:00:00+03:00",
			"EpochDate": 1630036800,
			"Temperature": {
				"Minimum": {
					"Value": 13.5,
					"Unit": "C",
					"UnitType": 17
				},
				"Maximum": {
					"Value": 16.6,
					"Unit": "C",
					"UnitType": 17
				}
			},
			"Day": {
				"Icon": 7,
				"IconPhrase": "Облачно",
				"HasPrecipitation": false
			},
			"Night": {
				"Icon": 36,
				"IconPhrase": "Переменная облачность",
				"HasPrecipitation": false
			},
			"Sources": [
				"AccuWeather"
			],
			"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1&unit=c",
			"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1&unit=c"
		},
		{
			"Date": "2021-08-28T07:00:00+03:00",
			"EpochDate": 1630123200,
			"Temperature": {
				"Minimum": {
					"Value": 12.8,
					"Unit": "C",
					"UnitType": 17
				},
				"Maximum": {
					"Value": 19.9,
					"Unit": "C",
					"UnitType": 17
				}
			},
			"Day": {
				"Icon": 2,
				"IconPhrase": "Преимущественно ясно",
				"HasPrecipitation": false
			},
			"Night": {
				"Icon": 34,
				"IconPhrase": "Преимущественно ясно",
				"HasPrecipitation": false
			},
			"Sources": [
				"AccuWeather"
			],
			"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=2&unit=c",
			"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=2&unit=c"
		},
		{
			"Date": "2021-08-29T07:00:00+03:00",
			"EpochDate": 1630209600,
			"Temperature": {
				"Minimum": {
					"Value": 14.1,
					"Unit": "C",
					"UnitType": 17
				},
				"Maximum": {
					"Value": 19.9,
					"Unit": "C",
					"UnitType": 17
				}
			},
			"Day": {
				"Icon": 3,
				"IconPhrase": "Небольшая облачность",
				"HasPrecipitation": false
			},
			"Night": {
				"Icon": 7,
				"IconPhrase": "Облачно",
				"HasPrecipitation": false
			},
			"Sources": [
				"AccuWeather"
			],
			"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=3&unit=c",
			"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=3&unit=c"
		},
		{
			"Date": "2021-08-30T07:00:00+03:00",
			"EpochDate": 1630296000,
			"Temperature": {
				"Minimum": {
					"Value": 17.0,
					"Unit": "C",
					"UnitType": 17
				},
				"Maximum": {
					"Value": 19.4,
					"Unit": "C",
					"UnitType": 17
				}
			},
			"Day": {
				"Icon": 6,
				"IconPhrase": "Преимущественно облачно",
				"HasPrecipitation": false
			},
			"Night": {
				"Icon": 12,
				"IconPhrase": "Ливни",
				"HasPrecipitation": true,
				"PrecipitationType": "Rain",
				"PrecipitationIntensity": "Light"
			},
			"Sources": [
				"AccuWeather"
			],
			"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=4&unit=c",
			"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=4&unit=c"
		},
		{
			"Date": "2021-08-31T07:00:00+03:00",
			"EpochDate": 1630382400,
			"Temperature": {
				"Minimum": {
					"Value": 12.7,
					"Unit": "C",
					"UnitType": 17
				},
				"Maximum": {
					"Value": 18.0,
					"Unit": "C",
					"UnitType": 17
				}
			},
			"Day": {
				"Icon": 18,
				"IconPhrase": "Дождь",
				"HasPrecipitation": true,
				"PrecipitationType": "Rain",
				"PrecipitationIntensity": "Light"
			},
			"Night": {
				"Icon": 18,
				"IconPhrase": "Дождь",
				"HasPrecipitation": true,
				"PrecipitationType": "Rain",
				"PrecipitationIntensity": "Heavy"
			},
			"Sources": [
				"AccuWeather"
			],
			"MobileLink": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=5&unit=c",
			"Link": "http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=5&unit=c"
		}
	]
}
 */
