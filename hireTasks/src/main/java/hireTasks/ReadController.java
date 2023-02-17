package hireTasks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hireTasks.line.FinishLineDeliveryEntity;
import hireTasks.line.IFinishLineDeliveryService;


@RequestMapping()
@RestController
public class ReadController {
   

	@Autowired
	IFinishLineDeliveryService deliveryService;
	
	@GetMapping("/getList")
	public List<FinishLineDeliveryEntity> getMethodName() {
		List<FinishLineDeliveryEntity> deliveryList = deliveryService.getDeliveryList();
		
        return deliveryList;
	}
}
