package hw.cloud.prometheus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import hw.cloud.prometheus.entity.CityRates;

public interface CityRatesMapper {
	
	@Select("SELECT * FROM city_rates")
	@Results({
		@Result(property = "cityName",  column = "city_name"),
		@Result(property = "pensionRatePerson", column = "PENSION_RATE_PERSON"),
		@Result(property = "medicalRatePerson", column = "MEDICAL_RATE_PERSON"),
		@Result(property = "unempolyeeRatePerson", column = "UNEMPOLYEE_RATE_PERSON"),
		@Result(property = "basicHousingRatePerson", column = "BASICHOUSING_RATE_PERSON"),
		@Result(property = "supplementHousingRatePerson", column = "SUPPLEMENTHOUSING_RATE_PERSON")
	})
	List<CityRates> getAll();
	
	@Select("SELECT * FROM city_rates WHERE id = #{id}")
	@Results({
		@Result(property = "cityName",  column = "city_name"),
		@Result(property = "pensionRatePerson", column = "PENSION_RATE_PERSON"),
		@Result(property = "medicalRatePerson", column = "MEDICAL_RATE_PERSON"),
		@Result(property = "unempolyeeRatePerson", column = "UNEMPOLYEE_RATE_PERSON"),
		@Result(property = "basicHousingRatePerson", column = "BASICHOUSING_RATE_PERSON"),
		@Result(property = "supplementHousingRatePerson", column = "SUPPLEMENTHOUSING_RATE_PERSON")
	})
	CityRates getOne(Long id);

	@Insert(value="INSERT INTO city_rates(city_name,province,pension_rate_person) VALUES(#{cityName}, #{province}, #{pensionRatePerson})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(CityRates city);

	@Update("UPDATE users SET cityName=#{city_name WHERE id =#{id}")
	void update(CityRates city);

	@Delete("DELETE FROM city_rates WHERE id =#{id}")
	void delete(Long id);
}
