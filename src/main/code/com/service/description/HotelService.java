package main.code.com.service.description;

import main.code.com.entity.Apartment;
import main.code.com.entity.UserOrder;
import main.code.com.exeptions.ServiceException;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    List<Apartment> retrieveApartmentByType(String type) throws ServiceException;

    List<Apartment> retrieveALLApartments() throws ServiceException;


    Optional<Apartment> retrieveApartmentById(int Apartment) throws ServiceException;

    List<Apartment> retrieveApartmentsByUserId(int userId) throws ServiceException;

    void removeApartmentById(int apartmentId) throws ServiceException;

    List<Apartment> retrieveApartmentByStatus(String status) throws ServiceException;

    List<Apartment> retrieveApartmentsByUserOrders(List<UserOrder> userOrders) throws ServiceException;


    boolean addNewApartment(String status,String type,String StringNumberOfRooms,
                            String StringApartmentNumber,String StringNumberOfBeds,String StringPrice,String photo) throws ServiceException;

    public void updateApartmentStatusById(int id,String status) throws ServiceException;


    boolean updateApartmentInformation(String StringId,String status,String type,String StringNumberOfRooms,
                                       String StringApartmentNumber,String StringNumberOfBeds,String StringPrice,String photo) throws ServiceException;
}
