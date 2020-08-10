package burda.cleevio.homework;

import burda.cleevio.homework.types.Watches;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface ITransactionController {

    @RequestMapping(
            value = "/",
            consumes = {"application/json", "application/xml"},
            method = RequestMethod.POST)
    ResponseEntity<String> acceptPost(@RequestBody Watches watches);

    @RequestMapping(value = "/",
            method = RequestMethod.GET)
    ResponseEntity<String> showForm();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    ResponseEntity<String> showWatches(@PathVariable long id);
}
