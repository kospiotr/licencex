package pl.xperios.licencex.ui.common;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

class UserNavbar extends CssLayout {

    UserNavbar() {
        addStyleName("user-navbar");
        addComponents(new FlagButton(), new HelpButton(), new UserButton(), new MenuToggleButton());
    }

    private class FlagButton extends Button {

        FlagButton() {
            setIcon(VaadinIcons.FLAG);
            addStyleName(ValoTheme.BUTTON_BORDERLESS);
            setWidthUndefined();
        }
    }

    private class HelpButton extends Button {

        HelpButton() {
            setIcon(VaadinIcons.QUESTION_CIRCLE);
            addStyleName(ValoTheme.BUTTON_BORDERLESS);
            setWidthUndefined();
        }
    }

    private class UserButton extends Button {
        UserButton() {
            setIcon(VaadinIcons.USER);
            addStyleName(ValoTheme.BUTTON_BORDERLESS);
            setWidthUndefined();
        }

    }

    private class MenuToggleButton extends Button {

        MenuToggleButton() {
            setStyleName("toggle-button");
            setIcon(VaadinIcons.LIST);
            addStyleName(ValoTheme.BUTTON_BORDERLESS);
        }
    }
}
