package burda.cleevio.homework;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ITransactionController {

    @RequestMapping(
            value = "/sendWatch",
            consumes = {"application/json", "application/xml"},
            method = RequestMethod.POST)
    String acceptPost(Model model);
}
