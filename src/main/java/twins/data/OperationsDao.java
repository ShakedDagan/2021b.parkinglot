package twins.data;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OperationsDao extends PagingAndSortingRepository<OperationEntity, String>{

}
