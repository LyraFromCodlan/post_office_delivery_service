package ru.nurtay_tulegenov.delivery_post_service.service.service_implementtion;

import jakarta.persistence.criteria.Predicate;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.nurtay_tulegenov.delivery_post_service.dto.DeliveryDto;
import ru.nurtay_tulegenov.delivery_post_service.enums.DeliveryType;
import ru.nurtay_tulegenov.delivery_post_service.mapper.EntityResponseMapper;
import ru.nurtay_tulegenov.delivery_post_service.model.Delivery;
import ru.nurtay_tulegenov.delivery_post_service.model.DeliveryHistory;
import ru.nurtay_tulegenov.delivery_post_service.model.PostOffice;
import ru.nurtay_tulegenov.delivery_post_service.repository.DeliveryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.HistoryRepository;
import ru.nurtay_tulegenov.delivery_post_service.repository.PostOfficeRepository;
import ru.nurtay_tulegenov.delivery_post_service.service.DeliveryService;

import java.util.List;

@Service
@AllArgsConstructor
public class DeliveryServiceImp implements DeliveryService {
    private final EntityResponseMapper mapper;
    private final PostOfficeRepository postOfficeRepository;
    private final DeliveryRepository deliveryRepository;
    private final HistoryRepository historyRepository;

    @Override
    @Transactional
    public Delivery registerDelivery(DeliveryDto request) {
        try {
            Delivery delivery = mapper.mapDeliveryDtoToDelivery(request);
            PostOffice postOffice = postOfficeRepository.findByCodeIgnoreCase(request.getPostOfficeCode());
            delivery.setPostOffice(postOffice);
            return deliveryRepository.save(delivery);
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public Delivery moveDelivery(String postOfficeCode, Long deliveryId) {
        try{
            Delivery delivery = deliveryRepository.findById(deliveryId).get();
            PostOffice postOfficeReceiver = postOfficeRepository.findByCodeIgnoreCase(postOfficeCode);
            delivery.setPostOffice(postOfficeReceiver);
            return deliveryRepository.save(delivery);
        }catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public Delivery getDeliveryInfo(Long id) {
        try{
            return deliveryRepository.findById(id).get();
        }catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public List<DeliveryHistory> getDeliveryHistory(Long id) {
        try{
            Delivery delivery = deliveryRepository.findById(id).get();
            return historyRepository.findAllByDelivery(delivery);
        }catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }
    @Override
    public Boolean registerReception(Long id) {
        try{
            Delivery delivery = deliveryRepository.findById(id).get();
            delivery.setIsReceived(true);
            deliveryRepository.save(delivery);
        }catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        return null;
    }

    private Specification<Delivery> getPredicate(){
        return (root, query, criteriaBuilder) -> {
            return (Predicate) query.where(getPostOffice(new PostOffice())
                    .or(getDeliveryType()).toPredicate(root,query,criteriaBuilder));
        };
    }
    private Specification<Delivery> getPostOffice(PostOffice postOffice){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("postOffice"),postOffice));
    }

    private Specification<Delivery> getDeliveryType(){
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("deliveryType"), DeliveryType.PARCEL);
    }
}
