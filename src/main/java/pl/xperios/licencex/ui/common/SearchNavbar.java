package pl.xperios.licencex.ui.common;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

public class SearchNavbar extends CssLayout {

    public SearchNavbar() {
        addStyleName("search-navbar");
        addComponent(new Search());
    }


    private class Search extends TextField {

        public Search() {
            addStyleName("global-search");
            setPlaceholder("Search...");
//            setIcon(VaadinIcons.SEARCH);
            addStyleName(ValoTheme.TEXTFIELD_BORDERLESS);
            addStyleName(ValoTheme.TEXTFIELD_SMALL);
        }
    }

}
