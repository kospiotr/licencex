package pl.xperios.licencex.ui.common;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings({"serial", "unchecked"})
public final class LeftNavbar extends CustomComponent {

    public static final String ID = "dashboard-menu";
    public static final String REPORTS_BADGE_ID = "dashboard-menu-reports-badge";
    public static final String NOTIFICATIONS_BADGE_ID = "dashboard-menu-notifications-badge";
    private static final String STYLE_VISIBLE = "valo-menu-visible";
    private Label notificationsBadge;
    private Label reportsBadge;
    private MenuBar.MenuItem settingsItem;

    public LeftNavbar() {
        setPrimaryStyleName("valo-menu");
        addStyleName("left-navbar");
//        setId(ID);
        setSizeUndefined();

        setCompositionRoot(buildContent());
    }

    private Component buildContent() {
        final CssLayout menuContent = new CssLayout();
//        menuContent.addStyleName("sidebar");
//        menuContent.addStyleName(ValoTheme.MENU_PART);
//        menuContent.addStyleName("no-vertical-drag-hints");
//        menuContent.addStyleName("no-horizontal-drag-hints");
//        menuContent.setWidth(null);
//        menuContent.setHeight("100%");

//        menuContent.addComponent(buildTitle());
        menuContent.addComponent(buildTitleButton());
//        menuContent.addComponent(buildToggleButton());
        menuContent.addComponent(buildMenuItems());

        return menuContent;
    }

    private Component buildTitle() {
        Label logo = new Label("License <strong>X</strong>", ContentMode.HTML);
        logo.setSizeUndefined();
        HorizontalLayout logoWrapper = new HorizontalLayout(logo);
        logoWrapper.setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
        logoWrapper.addStyleName("valo-menu-title");
        logoWrapper.setHeight("40px");
        return logoWrapper;
    }

    private Component buildTitleButton() {
//        Label logo = new Label("License <strong>X</strong>", ContentMode.HTML);
//        logo.setSizeUndefined();
//        HorizontalLayout logoWrapper = new HorizontalLayout(logo);
//        logoWrapper.setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
//        logoWrapper.addStyleName("valo-menu-title");
//        logoWrapper.setHeight("40px");
        Button button = new Button("License<strong>X</strong>");
        button.setCaptionAsHtml(true);
        button.addStyleName(ValoTheme.BUTTON_BORDERLESS);
        CssLayout layout = new CssLayout();
        layout.addStyleName("logo");
        layout.addStyleName("valo-menu-title");
        layout.addComponent(button);
        return layout;
    }

    private Component buildUserMenu() {
        final MenuBar settings = new MenuBar();
        settings.addStyleName("user-menu");
        settingsItem = settings.addItem("", null);
        settingsItem.addItem("Edit Profile", new Command() {
            @Override
            public void menuSelected(final MenuItem selectedItem) {
            }
        });
        settingsItem.addItem("Sign Out", new Command() {
            @Override
            public void menuSelected(final MenuItem selectedItem) {
            }
        });
        return settings;
    }

    private Component buildMenuItems() {
        CssLayout menuItemsLayout = new CssLayout();
        menuItemsLayout.addStyleName("valo-menuitems");

        menuItemsLayout.addComponent(new ValoMenuItemButton("Dashboard", ""));
        menuItemsLayout.addComponent(new ValoMenuItemButton("Users", "userList"));
        return menuItemsLayout;

    }

    private Component buildBadgeWrapper(final Component menuItemButton,
                                        final Component badgeLabel) {
        CssLayout dashboardWrapper = new CssLayout(menuItemButton);
//        dashboardWrapper.addStyleName("badgewrapper");
//        dashboardWrapper.addStyleName(ValoTheme.MENU_ITEM);
//        badgeLabel.addStyleName(ValoTheme.MENU_BADGE);
//        badgeLabel.setWidthUndefined();
//        badgeLabel.setVisible(false);
        dashboardWrapper.addComponent(badgeLabel);
        return dashboardWrapper;
    }

    @Override
    public void attach() {
        super.attach();
    }


    public final class ValoMenuItemButton extends Button {

        public ValoMenuItemButton(String caption, String view) {
            setPrimaryStyleName("valo-menu-item");
            setCaption(caption);
            addClickListener((ClickListener) event ->
                    UI.getCurrent().getNavigator().navigateTo(view));
        }

    }
}
