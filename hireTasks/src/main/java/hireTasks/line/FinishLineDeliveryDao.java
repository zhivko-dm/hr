package hireTasks.line;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FinishLineDeliveryDao {
	
	private FinishLineDeliveryDao() {
	}

	public List<FinishLineDeliveryEntity> getDeliveryList() {

		List<FinishLineDeliveryEntity> returnList = getVoiceListFromDB();
		
		return returnList;
	}
	
	private List<FinishLineDeliveryEntity> getVoiceListFromDB() {
		List<FinishLineDeliveryEntity> dummyList = new ArrayList<FinishLineDeliveryEntity>();
		for(int i=0;i<3;i++){
			FinishLineDeliveryEntity d = new FinishLineDeliveryEntity();
			d.setCategory("C"+i);
			d.setRegion("R"+i);
			d.setService("S"+i);
			d.setValue("V"+i);
			dummyList.add(d);	
		}
	return dummyList;
	}

}
