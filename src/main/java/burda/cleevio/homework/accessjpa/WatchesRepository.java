package burda.cleevio.homework.accessjpa;

import burda.cleevio.homework.types.Watches;
import org.springframework.data.repository.CrudRepository;

public interface WatchesRepository extends CrudRepository<Watches, Long> {
}
