package uni.isw.designpatterns.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import uni.isw.designpatterns.dto.dto.CarDto;
import uni.isw.designpatterns.dto.model.Car;
import uni.isw.designpatterns.dto.model.CarType;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );    
    
    //numberOfSeats,seatCount,type,type deben estar como public
    @Mapping(source = "numberOfSeats", target = "seatCount") 
    @Mapping(source = "type", target = "type", qualifiedByName = "getCarType")
    CarDto carToCarDto(Car car);
    
    @Named("getCarType") 
    public static String getCarType(CarType carType) { 
        return carType.getName();
    }
}
