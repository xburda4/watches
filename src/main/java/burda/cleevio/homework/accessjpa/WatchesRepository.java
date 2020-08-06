package burda.cleevio.homework.accessjpa;

import burda.cleevio.homework.types.Watches;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@EntityScan
public interface WatchesRepository extends CrudRepository<Watches, Long> {
}
