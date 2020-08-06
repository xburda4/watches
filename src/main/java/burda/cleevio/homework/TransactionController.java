package burda.cleevio.homework;

import burda.cleevio.homework.accessjpa.WatchesRepository;
import burda.cleevio.homework.types.Watches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class TransactionController implements ITransactionController {
    @Autowired
    private WatchesRepository wr;

    @Override
    public String acceptPost(Model model) {
        return null;
    }

    @Override
    public String showForm() {
        return "index";
    }

    @Override
    public String showWatches(Watches watches) {
        return "watchesHtml";
    }

    private boolean isInputValid() {
        return true;
    }
}
