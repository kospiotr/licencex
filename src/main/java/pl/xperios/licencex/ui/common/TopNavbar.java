package pl.xperios.licencex.ui.common;

import com.vaadin.ui.CssLayout;

public class TopNavbar extends CssLayout {

    public TopNavbar() {
        addStyleName("top-navbar");

        addComponent(new SearchNavbar());
        addComponent(new UserNavbar());
    }


}
