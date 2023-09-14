package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.repository.DeliveryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.HistoryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.PostOfficeRepository;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
//@AllArgsConstructor
public class DeliveryServiceImp implements DeliveryService {
    private final EntityResponseMapper mapper;
    private final PostOfficeRepository postOfficeRepository;
    private final DeliveryRepository deliveryRepository;
    private final HistoryRepository historyRepository;

    public DeliveryServiceImp(EntityResponseMapper mapper, PostOfficeRepository postOfficeRepository, DeliveryRepository deliveryRepository, HistoryRepository historyRepository) {
        this.mapper = mapper;
        this.postOfficeRepository = postOfficeRepository;
        this.deliveryRepository = deliveryRepository;
        this.historyRepository = historyRepository;
    }

    @Override
    @Transactional
    public Delivery registerDelivery(DeliveryDto request) {
        Delivery delivery = mapper.mapDeliveryDtoToDelivery(request);
        PostOffice postOffice = postOfficeRepository.findByCodeIgnoreCase(request.getPostOfficeCode());
        delivery = deliveryRepository.save(delivery);
        if (postOffice!=null)
            delivery.setPostOffices(Arrays.asList(postOffice).stream().collect(Collectors.toSet()));
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery moveDelivery(String postOfficeCode, Long deliveryId) {
        try{
//            PostOffice postOfficeSender = postOfficeRepository.
            PostOffice PostOfficeReceiver = postOfficeRepository.findByCodeIgnoreCase(postOfficeCode);
            Delivery delivery = deliveryRepository.findById(deliveryId).get();
            if (delivery!=null){

            }
//            return deliveryRepository.save()
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public Delivery getDeliveryInfo(Long id) {
        try{
            return deliveryRepository.findById(id).get();
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public List<DeliveryHistory> getDeliveryHistory(Long id) {
        try{
            
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
    @Override
    public Boolean registerReception(Long id) {
        try{
            
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
