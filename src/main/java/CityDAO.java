import java.util.List;

public interface CityDAO {
    City add(City city);
    City getById(int id);
    List<City> readAll();
    void updateCity(City city);
    void deleteCity(City city);
}