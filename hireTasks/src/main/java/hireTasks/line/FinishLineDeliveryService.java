package hireTasks.line;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FinishLineDeliveryService implements IFinishLineDeliveryService {
	
	FinishLineDeliveryDao deliveryDao;
	
	@Override
	public List<FinishLineDeliveryEntity> getDeliveryList() {
		return deliveryDao.getDeliveryList();
	}
	
}
