package burda.cleevio.homework;

import burda.cleevio.homework.types.Watches;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ITransactionController {

    @RequestMapping(
            value = "/",
            consumes = {"application/json", "application/xml"},
            method = RequestMethod.POST)
    String acceptPost(Model model);

    @RequestMapping(value = "/",
            method = RequestMethod.GET)
    String showForm();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String showWatches(Watches watches);
}
