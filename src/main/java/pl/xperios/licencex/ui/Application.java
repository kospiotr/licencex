package pl.xperios.licencex.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import pl.xperios.licencex.ui.common.ApplicationLayout;
import pl.xperios.licencex.ui.common.LeftNavbar;
import pl.xperios.licencex.ui.common.TopNavbar;

@SpringUI
@Theme("custom")
public class Application extends UI {

    static final String MAINVIEW = "main";

    @Autowired
    private SpringViewProvider viewProvider;

    @Override
    protected void init(VaadinRequest request) {
        ApplicationLayout applicationLayout = new ApplicationLayout(new LeftNavbar(), new TopNavbar());
        setContent(applicationLayout);
        setId("application");

        Navigator navigator = new Navigator(this, applicationLayout.getViewContainer());
        navigator.addProvider(viewProvider);
    }

}
