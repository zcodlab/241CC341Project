package uni.isw.designpatterns.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uni.isw.designpatterns.dto.dto.CarDto;
import uni.isw.designpatterns.dto.mapper.CarMapper;
import uni.isw.designpatterns.dto.model.Car;
import uni.isw.designpatterns.dto.model.CarType;

public class MapCarToCarDto {
    
    public MapCarToCarDto() {
    }

    @org.junit.jupiter.api.Test
    public void testMapCarToCarDto() {
        CarType carType=new CarType("SEDAN");
        Car car=new Car("Toyota",5,carType);        
        CarDto carDto=CarMapper.INSTANCE.carToCarDto(car);        
        //testear
        assertNotNull(carDto);
        assertEquals(carDto.getMake(), "Toyota");
        assertEquals(carDto.getSeatCount(), 5);
        assertEquals(carDto.getType(), "SEDAN");
        
        
        
    }
    
 
}
