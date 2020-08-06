package burda.cleevio.homework;

import burda.cleevio.homework.accessjpa.WatchesRepository;
import burda.cleevio.homework.types.Watches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TransactionController implements ITransactionController {

    @Autowired
    private WatchesRepository wr;

    @Override
    public ResponseEntity<String> acceptPost(@RequestBody Watches watches) {
        if(watches.isImageValid()) {
            Watches watchesWithId = wr.save(watches);
            return new ResponseEntity<>(Long.toString(watchesWithId.getId()),HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<String> showForm() {
        return new ResponseEntity<>("index",HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> showWatches(Watches watches) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
